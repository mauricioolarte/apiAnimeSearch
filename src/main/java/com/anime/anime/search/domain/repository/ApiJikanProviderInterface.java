package com.anime.anime.search.domain.repository;

import com.anime.anime.search.persistence.model.anime.Anime;
import com.anime.anime.search.persistence.model.qparams.AnimeSearchParams;
import org.springframework.stereotype.Service;


import java.util.ArrayList;

@Service
public interface ApiJikanProviderInterface {
    ArrayList<Anime> getAnimeByQueryParams(AnimeSearchParams params);
}
