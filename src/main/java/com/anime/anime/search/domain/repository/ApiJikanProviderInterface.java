package com.anime.anime.search.domain.repository;

import com.anime.anime.search.persistence.model.anime.Anime;
import com.anime.anime.search.persistence.model.qparams.AnimeSearchParams;
import org.springframework.stereotype.Component;


import java.util.ArrayList;

@Component
public interface ApiJikanProviderInterface {
    ArrayList<Anime> getAnimeByQueryParams(AnimeSearchParams params);
}
