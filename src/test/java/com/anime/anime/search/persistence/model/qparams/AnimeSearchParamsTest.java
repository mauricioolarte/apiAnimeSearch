package com.anime.anime.search.persistence.model.qparams;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;


public class AnimeSearchParamsTest {
    AnimeSearchParams params = new AnimeSearchParams();

    @Test
    public void testGetSetWordToSearch() {
        params.setWordToSearch("Naruto");
        assertEquals("Naruto", params.getWordToSearch());
        assertNotEquals("Boruto", params.getWordToSearch());

    }
}