package com.webservice.be_tailflash.modules.taxonomy;

import java.util.List;

import com.webservice.be_tailflash.modules.taxonomy.dto.CreateCategoryRequest;
import com.webservice.be_tailflash.modules.taxonomy.dto.CreateTagRequest;
import com.webservice.be_tailflash.modules.taxonomy.dto.TaxonomyCategoryData;
import com.webservice.be_tailflash.modules.taxonomy.dto.TaxonomyTagData;

public interface TaxonomyService {

    List<TaxonomyCategoryData> listCategories(String query, Integer limit);

    TaxonomyCategoryData createCategory(String requesterRole, CreateCategoryRequest request);

    List<TaxonomyTagData> listTags(String query, Integer limit);

    TaxonomyTagData createTag(String requesterRole, CreateTagRequest request);
}
