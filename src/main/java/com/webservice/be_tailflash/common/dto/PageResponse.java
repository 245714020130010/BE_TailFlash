package com.webservice.be_tailflash.common.dto;

import java.util.List;

public record PageResponse<T>(List<T> items, long totalElements, int totalPages, int page, int size) {
}
