package com.anime.anime.search.persistence.provider;

import com.anime.anime.search.util.ExampleApiResponseAnime;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.junit.Test;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class RequestToApiTest {

    @Value("${value.apiJikanUrlAnime}")
    private String apiJikanUrlAnime;

    @Test
    public void getListAnimeWhitSearchParam() {

        ExampleApiResponseAnime exampleApiResponseAnime = new ExampleApiResponseAnime();
        String json = exampleApiResponseAnime.jsonString();

        RequestToApi requestToApi = new RequestToApi();

        RestTemplate response = mock(RestTemplate.class);

        String url = "https://api.jikan.moe/v4/anime?q=" + "goku";
        when(response.getForObject(url, String.class)).thenReturn(json);

        Gson gson = new Gson();
        JsonObject responseObject = gson.fromJson(json, JsonObject.class);

        assertEquals(responseObject.get("animeId"), requestToApi.getListAnimeWhitSearchParam("goku").get("animeId"));

    }

}