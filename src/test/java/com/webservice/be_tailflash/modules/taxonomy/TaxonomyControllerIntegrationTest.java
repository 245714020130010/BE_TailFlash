package com.webservice.be_tailflash.modules.taxonomy;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.BDDMockito.given;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.webmvc.test.autoconfigure.AutoConfigureMockMvc;
import org.springframework.boot.webmvc.test.autoconfigure.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.test.context.bean.override.mockito.MockitoBean;
import org.springframework.test.web.servlet.MockMvc;

import com.webservice.be_tailflash.modules.taxonomy.dto.CreateCategoryRequest;
import com.webservice.be_tailflash.modules.taxonomy.dto.CreateTagRequest;
import com.webservice.be_tailflash.modules.taxonomy.dto.TaxonomyCategoryData;
import com.webservice.be_tailflash.modules.taxonomy.dto.TaxonomyTagData;
import com.webservice.be_tailflash.security.AuthPrincipal;
import com.webservice.be_tailflash.security.JwtTokenProvider;

@WebMvcTest(TaxonomyController.class)
@AutoConfigureMockMvc(addFilters = false)
class TaxonomyControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @MockitoBean
    private TaxonomyService taxonomyService;

    @MockitoBean
    private JwtTokenProvider jwtTokenProvider;

    @Test
    void listCategoriesShouldReturnEnvelope() throws Exception {
        given(taxonomyService.listCategories("eng", 5))
            .willReturn(List.of(new TaxonomyCategoryData(1L, "english-core", 0, true)));

        SecurityContextHolder.getContext().setAuthentication(adminAuthentication());
        try {
            mockMvc.perform(get("/api/v1/taxonomy/categories")
                    .queryParam("query", "eng")
                    .queryParam("limit", "5"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.success").value(true))
                .andExpect(jsonPath("$.data[0].nameKey").value("english-core"));
        } finally {
            SecurityContextHolder.clearContext();
        }
    }

    @Test
    void createCategoryShouldReturnCreatedEnvelope() throws Exception {
        given(taxonomyService.createCategory(any(), any(CreateCategoryRequest.class)))
            .willReturn(new TaxonomyCategoryData(2L, "toeic", 1, true));

        SecurityContextHolder.getContext().setAuthentication(adminAuthentication());
        try {
            mockMvc.perform(post("/api/v1/taxonomy/categories")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("""
                        {
                          "nameKey": "toeic",
                          "sortOrder": 1
                        }
                        """))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.success").value(true))
                .andExpect(jsonPath("$.data.nameKey").value("toeic"));
        } finally {
            SecurityContextHolder.clearContext();
        }
    }

    @Test
    void createTagShouldReturnCreatedEnvelope() throws Exception {
        given(taxonomyService.createTag(any(), any(CreateTagRequest.class)))
            .willReturn(new TaxonomyTagData(3L, "business", "business"));

        SecurityContextHolder.getContext().setAuthentication(adminAuthentication());
        try {
            mockMvc.perform(post("/api/v1/taxonomy/tags")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("""
                        {
                          "name": "business"
                        }
                        """))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.success").value(true))
                .andExpect(jsonPath("$.data.slug").value("business"));
        } finally {
            SecurityContextHolder.clearContext();
        }
    }

    private UsernamePasswordAuthenticationToken adminAuthentication() {
        AuthPrincipal principal = new AuthPrincipal(1L, "admin@tailflash.local", "ADMIN");
        return new UsernamePasswordAuthenticationToken(
            principal,
            null,
            List.of(new SimpleGrantedAuthority("ROLE_ADMIN"))
        );
    }
}
