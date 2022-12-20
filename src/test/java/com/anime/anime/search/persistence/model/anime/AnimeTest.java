package com.anime.anime.search.persistence.model.anime;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class AnimeTest {
    Anime anime = new Anime();

    @Test
    public void TestGetSetAnimeId() {
        anime.setAnimeId(6);
        assertEquals((Integer) 6, anime.getAnimeId());
        assertNotEquals((Integer) 3, anime.getAnimeId());
    }

     @Test
    public void getSetAnimeUrl() {
        anime.setAnimeUrl("http://example.com");
        assertEquals("http://example.com", anime.getAnimeUrl());
        assertNotEquals("", anime.getAnimeUrl());
    }

    @Test
    public void getSetImagesImageUrl() {
        anime.setImagesImageUrl("http://example.com/image1");
        assertEquals("http://example.com/image1", anime.getImagesImageUrl());
        assertNotEquals("a", anime.getImagesImageUrl());
    }

    @Test
    public void getSetImagesSmallImageUrl() {
        anime.setImagesSmallImageUrl("http://example.com/imageSmall");
        assertEquals("http://example.com/imageSmall", anime.getImagesSmallImageUrl());
        assertNotEquals("small", anime.getImagesSmallImageUrl());
    }

    @Test
    public void getSetImagesLargeImageUrl() {
        anime.setImagesLargeImageUrl("http://example.com/imageLarge");
        assertEquals("http://example.com/imageLarge", anime.getImagesLargeImageUrl());
        assertNotEquals("large", anime.getImagesLargeImageUrl());
    }

    @Test
    public void getAnimeTitle() {
        anime.setAnimeTitle("Naruto");
        assertEquals("Naruto", anime.getAnimeTitle());
        assertNotEquals("Noruto", anime.getAnimeTitle());
    }

    @Test
    public void getSetAnimetype() {
        anime.setAnimetype("Movie");
        assertEquals("Movie", anime.getAnimetype());
        assertNotEquals("Movie2", anime.getAnimetype());
    }

    @Test
    public void getSetAnimeSource() {
        anime.setAnimeSource("Manga");
        assertEquals("Manga", anime.getAnimeSource());
        assertNotEquals("manga", anime.getAnimeSource());
    }

    @Test
    public void getSetAnimeEpisodes() {
        anime.setAnimeEpisodes(220);
        assertEquals((Integer)220, anime.getAnimeEpisodes());
        assertNotEquals((Integer)221, anime.getAnimeEpisodes());
    }

    @Test
    public void getAnimeAired() {
        anime.setAnimeAired("Jul 30, 2011");
        assertEquals("Jul 30, 2011", anime.getAnimeAired());
        assertNotEquals("Jul 30, 201", anime.getAnimeAired());
    }

    @Test
    public void getSetAnimeDuration() {
        anime.setAnimeDuration("14 min");
        assertEquals("14 min", anime.getAnimeDuration());
        assertNotEquals("14 Min", anime.getAnimeDuration());
    }

    @Test
    public void getSetAnimeRating() {
        anime.setAnimeRating("PG-13 - Teens 13 or older");
        assertEquals("PG-13 - Teens 13 or older", anime.getAnimeRating());
        assertNotEquals("Not PG", anime.getAnimeRating());
    }


    @Test
    public void getAnimeScore() {
        anime.setAnimeScore(3.6);
        assertEquals((Double)3.6, anime.getAnimeScore());
        assertNotEquals(3.7, anime.getAnimeScore());
    }

    @Test
    public void getAnimeSynopsis() {
        anime.setAnimeSynopsis("As the Fourth Great Ninja War quickly approaches, Sunagakure hosts a special Chunin");
        assertEquals("As the Fourth Great Ninja War quickly approaches, Sunagakure hosts a special Chunin",
                anime.getAnimeSynopsis());
        assertNotEquals("", anime.getAnimeSynopsis());
    }

    @Test
    public void getAnimeBackground() {
        anime.setAnimeBackground("Naruto: Honoo no Chuunin Shiken!");
        assertEquals("Naruto: Honoo no Chuunin Shiken!", anime.getAnimeBackground());
        assertNotEquals("w", anime.getAnimeBackground());
    }

    @Test
    public void getAnimeYear() {
        anime.setAnimeYear(2022);
        assertEquals((Integer)2022, anime.getAnimeYear());
        assertNotEquals((Integer)2021, anime.getAnimeYear());
    }

    @Test
    public void getAnimeGenres() {
        List<String> genres = new ArrayList<String>();
        genres.add("action");
        genres.add("Adventure");
        anime.setAnimeGenres(genres);
        assertEquals(genres, anime.getAnimeGenres());
    }
}