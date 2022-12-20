package com.anime.anime.search.domain.service;

import com.anime.anime.search.domain.dto.AnimeCarousellCardDTO;
import com.anime.anime.search.domain.repository.ApiJikanProviderInterface;
import com.anime.anime.search.persistence.mapper.AnimeCarrousellCardMapper;
import com.anime.anime.search.persistence.model.qparams.AnimeSearchParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class AnimeCarousellCardService {

    @Autowired
    private AnimeCarrousellCardMapper mapper;
    @Autowired
    private ApiJikanProviderInterface apiJikanProviderInterface;


    public ArrayList<AnimeCarousellCardDTO> getListAnime(AnimeSearchParams params){

        return mapper.toAnimeCarousellListDTO(apiJikanProviderInterface.getAnimeByQueryParams(params));

    }

}
