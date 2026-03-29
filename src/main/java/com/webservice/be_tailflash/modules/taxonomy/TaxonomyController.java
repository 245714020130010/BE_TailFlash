package com.webservice.be_tailflash.modules.taxonomy;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.webservice.be_tailflash.common.dto.ApiResponse;
import com.webservice.be_tailflash.modules.taxonomy.dto.CreateCategoryRequest;
import com.webservice.be_tailflash.modules.taxonomy.dto.CreateTagRequest;
import com.webservice.be_tailflash.modules.taxonomy.dto.TaxonomyCategoryData;
import com.webservice.be_tailflash.modules.taxonomy.dto.TaxonomyTagData;
import com.webservice.be_tailflash.security.AuthPrincipal;
import com.webservice.be_tailflash.security.SecurityUtils;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/api/v1/taxonomy")
@RequiredArgsConstructor
@Validated
public class TaxonomyController {

    private final TaxonomyService taxonomyService;

    @GetMapping("/categories")
    public ResponseEntity<ApiResponse<List<TaxonomyCategoryData>>> listCategories(
        @RequestParam(required = false) String query,
        @RequestParam(required = false) Integer limit
    ) {
        return ResponseEntity.ok(ApiResponse.success(taxonomyService.listCategories(query, limit)));
    }

    @PostMapping("/categories")
    public ResponseEntity<ApiResponse<TaxonomyCategoryData>> createCategory(@Valid @RequestBody CreateCategoryRequest request) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.status(HttpStatus.CREATED).body(
            ApiResponse.success(taxonomyService.createCategory(principal.role(), request))
        );
    }

    @GetMapping("/tags")
    public ResponseEntity<ApiResponse<List<TaxonomyTagData>>> listTags(
        @RequestParam(required = false) String query,
        @RequestParam(required = false) Integer limit
    ) {
        return ResponseEntity.ok(ApiResponse.success(taxonomyService.listTags(query, limit)));
    }

    @PostMapping("/tags")
    public ResponseEntity<ApiResponse<TaxonomyTagData>> createTag(@Valid @RequestBody CreateTagRequest request) {
        AuthPrincipal principal = SecurityUtils.currentPrincipal();
        return ResponseEntity.status(HttpStatus.CREATED).body(
            ApiResponse.success(taxonomyService.createTag(principal.role(), request))
        );
    }
}
