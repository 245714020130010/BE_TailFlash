package com.webservice.be_tailflash.modules.flashcard;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.webservice.be_tailflash.modules.flashcard.dto.CreateFlashcardRequest;
import com.webservice.be_tailflash.modules.flashcard.dto.FlashcardResponse;
import com.webservice.be_tailflash.modules.flashcard.dto.UpdateFlashcardRequest;
import com.webservice.be_tailflash.modules.flashcard.entity.Flashcard;

@Mapper(componentModel = "spring")
public interface FlashcardMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "deckId", ignore = true)
    @Mapping(target = "categoryId", ignore = true)
    @Mapping(target = "hint", expression = "java(request.hint() == null ? \"\" : request.hint())")
    @Mapping(target = "note", expression = "java(request.note() == null ? \"\" : request.note())")
    @Mapping(target = "sortOrder", expression = "java(request.sortOrder() == null ? 0 : request.sortOrder())")
    Flashcard toEntity(CreateFlashcardRequest request);

    FlashcardResponse toResponse(Flashcard entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "deckId", ignore = true)
    @Mapping(target = "categoryId", ignore = true)
    @Mapping(target = "hint", expression = "java(request.hint() == null ? \"\" : request.hint())")
    @Mapping(target = "note", expression = "java(request.note() == null ? \"\" : request.note())")
    @Mapping(target = "sortOrder", expression = "java(request.sortOrder() == null ? 0 : request.sortOrder())")
    void updateEntity(UpdateFlashcardRequest request, @org.mapstruct.MappingTarget Flashcard entity);
}
