package com.anime.anime.search.persistence.model.anime;

import org.junit.Test;


import static org.junit.Assert.*;

public class AnimeEpisodeTest {

    AnimeEpisode episodeTest = new AnimeEpisode(1,1,"test", "testTitle",
            3.5);

    @Test
    public void getAnimeId() {
        assertEquals((Integer)1, episodeTest.getAnimeId());
        assertNotEquals((Integer)2, episodeTest.getEpisodeId());
    }

    @Test
    public void setAnimeId() {
        episodeTest.setAnimeId(2);
        assertEquals((Integer)2, episodeTest.getAnimeId());
        assertNotEquals((Integer)3, episodeTest.getEpisodeId());
    }

    @Test
    public void getUrlEpisode() {
        assertEquals("test", episodeTest.getUrlEpisode());
        assertNotEquals("test2", episodeTest.getUrlEpisode());
    }

    @Test
    public void setUrlEpisode() {
        episodeTest.setUrlEpisode("test1");
        assertEquals("test1", episodeTest.getUrlEpisode());
        assertNotEquals("test2", episodeTest.getUrlEpisode());
    }

    @Test
    public void getTitleEpisode() {
        assertEquals("testTitle", episodeTest.getTitleEpisode());
        assertNotEquals("testTitle1", episodeTest.getTitleEpisode());
    }

    @Test
    public void setTitleEpisode() {
        episodeTest.setTitleEpisode("testTitle2");
        assertEquals("testTitle2", episodeTest.getTitleEpisode());
        assertNotEquals("testTitle1", episodeTest.getTitleEpisode());
    }

    @Test
    public void getScoreEpisode() {
        assertEquals((Double)3.5 , episodeTest.getScoreEpisode());
        assertNotEquals(3.6, episodeTest.getScoreEpisode());

    }

    @Test
    public void setScoreEpisode() {
        episodeTest.setScoreEpisode(3.6);
        assertEquals((Double)3.6, episodeTest.getScoreEpisode());
        assertNotEquals(3.5, episodeTest.getScoreEpisode());
    }

    @Test
    public void testGetEpisodeId() {
        assertEquals((Integer) 1, episodeTest.getEpisodeId());
        assertNotEquals((Integer)2, episodeTest.getEpisodeId());
    }

    @Test
    public void testSetEpisodeId() {
        episodeTest.setEpisodeId(2);
        assertEquals((Integer)2,episodeTest.getEpisodeId());
    }
}