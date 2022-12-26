package com.anime.anime.search.domain.service;

import com.anime.anime.search.domain.dto.AnimeCarousellCardDTO;
import com.anime.anime.search.domain.repository.ApiJikanProviderInterface;
import com.anime.anime.search.persistence.mapper.AnimeCarrousellCardMapper;
import com.anime.anime.search.persistence.model.anime.Anime;
import com.anime.anime.search.persistence.model.qparams.AnimeSearchParams;
import com.anime.anime.search.util.ExampleAnimeObject;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AnimeCarousellCardServiceTest {

    @InjectMocks
    private AnimeCarousellCardService animeCarousellCardService;

    @Mock
    ApiJikanProviderInterface apiJikanProviderInterface;
    @Mock
    private AnimeCarrousellCardMapper mapper;

    @Test
    public void getListAnimeLess5() {

        AnimeSearchParams params = new AnimeSearchParams();
        params.setWordToSearch("goku");

        ExampleAnimeObject exampleAnimeObject = new ExampleAnimeObject();

        Anime a = exampleAnimeObject.animeExample();
        ArrayList<Anime> example = new ArrayList<>();
        example.add(a);

        AnimeCarousellCardDTO animeCarousellCardDTO = new AnimeCarousellCardDTO();
        animeCarousellCardDTO.setAnimeId(52716);
        animeCarousellCardDTO.setAnimeTitle("Goku Yoru");
        animeCarousellCardDTO.setUrlImagen("https://cdn.myanimelist.net/images/anime/1383/126832.jpg");
        animeCarousellCardDTO.setScore(0.0);

        when(apiJikanProviderInterface.getAnimeByQueryParams(params)).thenReturn(example);
        when(mapper.toAnimeCarousellCardDTO(a)).thenReturn(animeCarousellCardDTO);

        animeCarousellCardDTO.setRecommendationMessage("I do not recommend it.");

        assertEquals(animeCarousellCardDTO.getRecommendationMessage(), animeCarousellCardService.getListAnime(params).get(0).getRecommendationMessage());
    }

    @Test
    public void getListAnimeLess8() {

        AnimeSearchParams params = new AnimeSearchParams();
        params.setWordToSearch("goku");

        ExampleAnimeObject exampleAnimeObject = new ExampleAnimeObject();

        Anime b = exampleAnimeObject.animeExample();
        b.setAnimeScore(6.0);
        ArrayList<Anime> example = new ArrayList<>();
        example.add(b);

        AnimeCarousellCardDTO animeCarousellCardDTO = new AnimeCarousellCardDTO();
        animeCarousellCardDTO.setAnimeId(52716);
        animeCarousellCardDTO.setAnimeTitle("Goku Yoru");
        animeCarousellCardDTO.setUrlImagen("https://cdn.myanimelist.net/images/anime/1383/126832.jpg");
        animeCarousellCardDTO.setScore(7.0);

        when(apiJikanProviderInterface.getAnimeByQueryParams(params)).thenReturn(example);
        when(mapper.toAnimeCarousellCardDTO(b)).thenReturn(animeCarousellCardDTO);

        animeCarousellCardDTO.setRecommendationMessage("You may have fun.");

        assertEquals(animeCarousellCardDTO.getRecommendationMessage(), animeCarousellCardService.getListAnime(params).get(0).getRecommendationMessage());
    }

    @Test
    public void getListAnimeGreater8() {

        AnimeSearchParams params = new AnimeSearchParams();
        params.setWordToSearch("goku");

        ExampleAnimeObject exampleAnimeObject = new ExampleAnimeObject();

        Anime c = exampleAnimeObject.animeExample();
        ArrayList<Anime> example = new ArrayList<>();
        c.setAnimeScore(9.0);

        example.add(c);

        AnimeCarousellCardDTO animeCarousellCardDTO = new AnimeCarousellCardDTO();
        animeCarousellCardDTO.setAnimeId(52716);
        animeCarousellCardDTO.setAnimeTitle("Goku Yoru");
        animeCarousellCardDTO.setUrlImagen("https://cdn.myanimelist.net/images/anime/1383/126832.jpg");
        animeCarousellCardDTO.setScore(9.0);

        when(apiJikanProviderInterface.getAnimeByQueryParams(params)).thenReturn(example);
        when(mapper.toAnimeCarousellCardDTO(c)).thenReturn(animeCarousellCardDTO);

        animeCarousellCardDTO.setRecommendationMessage("“Great, this is one of the best anime.");

        assertEquals(animeCarousellCardDTO.getRecommendationMessage(), animeCarousellCardService.getListAnime(params).get(0).getRecommendationMessage());
    }
}