package com.webservice.be_tailflash.modules.taxonomy;

import java.time.Instant;
import java.util.List;
import java.util.Locale;

import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.webservice.be_tailflash.common.exception.ConflictException;
import com.webservice.be_tailflash.common.exception.ForbiddenException;
import com.webservice.be_tailflash.modules.category.CategoryRepository;
import com.webservice.be_tailflash.modules.category.entity.Category;
import com.webservice.be_tailflash.modules.tag.TagRepository;
import com.webservice.be_tailflash.modules.tag.entity.Tag;
import com.webservice.be_tailflash.modules.taxonomy.dto.CreateCategoryRequest;
import com.webservice.be_tailflash.modules.taxonomy.dto.CreateTagRequest;
import com.webservice.be_tailflash.modules.taxonomy.dto.TaxonomyCategoryData;
import com.webservice.be_tailflash.modules.taxonomy.dto.TaxonomyTagData;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class TaxonomyServiceImpl implements TaxonomyService {

    private static final int DEFAULT_LIMIT = 10;
    private static final int MAX_LIMIT = 30;

    private final CategoryRepository categoryRepository;
    private final TagRepository tagRepository;

    @Override
    @Transactional(readOnly = true)
    public List<TaxonomyCategoryData> listCategories(String query, Integer limit) {
        int safeLimit = normalizeLimit(limit);
        String keyword = normalizeBlank(query);

        List<Category> categories = keyword == null
            ? categoryRepository.findByIsActiveTrueOrderBySortOrderAscNameKeyAsc(PageRequest.of(0, safeLimit))
            : categoryRepository.findByIsActiveTrueAndNameKeyContainingIgnoreCaseOrderBySortOrderAscNameKeyAsc(
                keyword,
                PageRequest.of(0, safeLimit)
            );

        return categories.stream()
            .map(category -> new TaxonomyCategoryData(
                category.getId(),
                category.getNameKey(),
                category.getSortOrder(),
                category.getIsActive()
            ))
            .toList();
    }

    @Override
    @Transactional
    public TaxonomyCategoryData createCategory(String requesterRole, CreateCategoryRequest request) {
        requireAdminRole(requesterRole);

        String normalizedKey = normalizeCategoryKey(request.nameKey());
        if (categoryRepository.existsByNameKey(normalizedKey)) {
            throw new ConflictException("TAXONOMY_CATEGORY_EXISTS", "Category already exists");
        }

        Category category = new Category();
        category.setNameKey(normalizedKey);
        category.setIcon(normalizeBlank(request.icon()));
        category.setParentId(request.parentId());
        category.setSortOrder(request.sortOrder() == null ? 0 : request.sortOrder());
        category.setIsActive(true);
        category.setCreatedAt(Instant.now());
        category.setUpdatedAt(Instant.now());

        Category saved = categoryRepository.save(category);
        return new TaxonomyCategoryData(saved.getId(), saved.getNameKey(), saved.getSortOrder(), saved.getIsActive());
    }

    @Override
    @Transactional(readOnly = true)
    public List<TaxonomyTagData> listTags(String query, Integer limit) {
        int safeLimit = normalizeLimit(limit);
        String keyword = normalizeBlank(query);

        List<Tag> tags = keyword == null
            ? tagRepository.findAllByOrderByNameAsc(PageRequest.of(0, safeLimit))
            : tagRepository.findByNameContainingIgnoreCaseOrderByNameAsc(keyword, PageRequest.of(0, safeLimit));

        return tags.stream()
            .map(tag -> new TaxonomyTagData(tag.getId(), tag.getName(), tag.getSlug()))
            .toList();
    }

    @Override
    @Transactional
    public TaxonomyTagData createTag(String requesterRole, CreateTagRequest request) {
        requireAdminRole(requesterRole);

        String normalizedName = request.name().trim();
        String slug = slugify(normalizedName);
        if (tagRepository.existsBySlug(slug)) {
            throw new ConflictException("TAXONOMY_TAG_EXISTS", "Tag already exists");
        }

        Tag tag = new Tag();
        tag.setName(normalizedName);
        tag.setSlug(slug);
        tag.setCreatedAt(Instant.now());

        Tag saved = tagRepository.save(tag);
        return new TaxonomyTagData(saved.getId(), saved.getName(), saved.getSlug());
    }

    private void requireAdminRole(String requesterRole) {
        if (!"ADMIN".equals(requesterRole)) {
            throw new ForbiddenException("AUTH_FORBIDDEN", "Admin role required");
        }
    }

    private int normalizeLimit(Integer limit) {
        if (limit == null || limit <= 0) {
            return DEFAULT_LIMIT;
        }
        return Math.min(limit, MAX_LIMIT);
    }

    private String normalizeBlank(String value) {
        if (value == null) {
            return null;
        }
        String trimmed = value.trim();
        return trimmed.isBlank() ? null : trimmed;
    }

    private String normalizeCategoryKey(String rawKey) {
        return rawKey.trim().toLowerCase(Locale.ROOT);
    }

    private String slugify(String value) {
        String normalized = value.trim().toLowerCase(Locale.ROOT)
            .replaceAll("[^a-z0-9]+", "-")
            .replaceAll("(^-|-$)", "");
        return normalized.isBlank() ? "tag" : normalized;
    }
}
