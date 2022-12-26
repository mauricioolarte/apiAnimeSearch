package com.anime.anime.search.domain.dto;

import org.junit.Test;

import static org.junit.Assert.*;

public class AnimeCarousellCardDTOTest {
    AnimeCarousellCardDTO anime = new AnimeCarousellCardDTO();

    @Test
    public void getAnimeId() {
        anime.setAnimeId(1);
        assertEquals((Integer) 1, anime.getAnimeId());
    }

    @Test
    public void getAnimeTitle() {
        anime.setAnimeTitle("animeTitle");
        assertEquals("animeTitle", anime.getAnimeTitle());
    }

    @Test
    public void getUrlImagen() {
        anime.setUrlImagen("http://example.com");
        assertEquals("http://example.com", anime.getUrlImagen());
    }

    @Test
    public void getScore() {
        anime.setScore(1.0);
        assertEquals((Double) 1.0, anime.getScore());
    }

    @Test
    public void getRecommendationMessage() {
        anime.setRecommendationMessage("I do not recommend it.");
        assertEquals("I do not recommend it.", anime.getRecommendationMessage());
    }

}