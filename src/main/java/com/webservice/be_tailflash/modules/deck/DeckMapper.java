package com.webservice.be_tailflash.modules.deck;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.webservice.be_tailflash.modules.deck.dto.CreateDeckRequest;
import com.webservice.be_tailflash.modules.deck.dto.DeckResponse;
import com.webservice.be_tailflash.modules.deck.dto.UpdateDeckRequest;
import com.webservice.be_tailflash.modules.deck.entity.Deck;

@Mapper(componentModel = "spring")
public interface DeckMapper {

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "ownerId", ignore = true)
    Deck toEntity(CreateDeckRequest request);

    DeckResponse toResponse(Deck entity);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "ownerId", ignore = true)
    void updateEntity(UpdateDeckRequest request, @org.mapstruct.MappingTarget Deck entity);
}
