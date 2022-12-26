package com.anime.anime.search.persistence.provider;

import com.anime.anime.search.persistence.model.anime.Anime;
import com.anime.anime.search.persistence.model.qparams.AnimeSearchParams;
import com.anime.anime.search.util.ExampleAnimeObject;
import com.anime.anime.search.util.ExampleApiResponseAnime;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.junit.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class ApiJikanProviderTest {

    private ApiJikanProvider apiJ;

    @InjectMocks
    private RequestToApi requestToApi;



    @Test
    public void getAnimeByQueryParams() {
        ExampleApiResponseAnime exampleApiResponseAnime = new ExampleApiResponseAnime();
        String json = exampleApiResponseAnime.jsonString();
        ApiJikanProvider apiJ = new ApiJikanProvider();
        RequestToApi requestToApi = mock(RequestToApi.class);
        AnimeSearchParams params = new AnimeSearchParams();
        params.setWordToSearch("goku");

        Gson gson = new Gson();

        ExampleAnimeObject animeExample = new ExampleAnimeObject();
        Anime animeT = animeExample.animeExample();

        //String wordToSearch = params.getWordToSearch();
        when(requestToApi.getListAnimeWhitSearchParam(params.getWordToSearch()))
                .thenReturn(gson.fromJson(json, JsonObject.class));

        ArrayList<Anime> p = new ArrayList<>();
        p.add(animeT);
        assertEquals(p.get(0).getAnimeId(),apiJ.getAnimeByQueryParams(params).get(0).getAnimeId());
    }




}