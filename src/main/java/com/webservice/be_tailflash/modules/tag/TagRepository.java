package com.webservice.be_tailflash.modules.tag;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.domain.Pageable;

import com.webservice.be_tailflash.modules.tag.entity.Tag;

public interface TagRepository extends JpaRepository<Tag, Long> {

    Optional<Tag> findBySlug(String slug);

    boolean existsBySlug(String slug);

    List<Tag> findAllByOrderByNameAsc(Pageable pageable);

    List<Tag> findByNameContainingIgnoreCaseOrderByNameAsc(String keyword, Pageable pageable);
}
