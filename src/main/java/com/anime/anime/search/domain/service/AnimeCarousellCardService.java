package com.anime.anime.search.domain.service;

import com.anime.anime.search.domain.dto.AnimeCarousellCardDTO;
import com.anime.anime.search.domain.repository.ApiJikanProviderInterface;
import com.anime.anime.search.persistence.mapper.AnimeCarrousellCardMapper;
import com.anime.anime.search.persistence.model.anime.Anime;
import com.anime.anime.search.persistence.model.qparams.AnimeSearchParams;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AnimeCarousellCardService {

    @Autowired
    private AnimeCarrousellCardMapper mapper;
    @Autowired
    private ApiJikanProviderInterface apiJikanProviderInterface;


    public ArrayList<AnimeCarousellCardDTO> getListAnime(AnimeSearchParams params){
        List<Anime> animeSearchResponse = apiJikanProviderInterface.getAnimeByQueryParams(params);
        ArrayList<AnimeCarousellCardDTO> animeDtoResponse = new ArrayList<>();

        animeSearchResponse.forEach( a -> {
            AnimeCarousellCardDTO anime;
            anime = mapper.toAnimeCarousellCardDTO(a);
            double score = a.getAnimeScore();
            if (score >= 0 && score < 5) {
                anime.setRecommendationMessage("I do not recommend it.");
            }
            if (score >=5 && score < 8) {
                anime.setRecommendationMessage("You may have fun.");
            }
            if (score >=5 && score < 7) {
                anime.setRecommendationMessage("“Great, this is one of the best anime.");
            }
            animeDtoResponse.add(anime);
        });
        return animeDtoResponse;
    }

}
