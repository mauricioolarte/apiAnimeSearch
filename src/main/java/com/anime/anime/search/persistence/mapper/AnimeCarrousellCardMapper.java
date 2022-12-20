package com.anime.anime.search.persistence.mapper;

import com.anime.anime.search.persistence.model.anime.Anime;
import com.anime.anime.search.domain.dto.AnimeCarousellCardDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;

import java.util.ArrayList;

@Mapper(componentModel = "spring")
public interface AnimeCarrousellCardMapper {

    @Mappings({
            @Mapping(source= "animeId", target = "animeId"),
            @Mapping(source = "animeTitle", target = "animeTitle"),
            @Mapping(source = "imagesImageUrl", target = "urlImagen"),
            @Mapping(source = "animeScore", target = "score")
    })
    AnimeCarousellCardDTO toAnimeCarousellCardDTO(Anime anime);
    ArrayList<AnimeCarousellCardDTO> toAnimeCarousellListDTO(ArrayList<Anime> animeList);

}
