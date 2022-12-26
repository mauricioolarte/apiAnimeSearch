package com.anime.anime.search.util;

import com.anime.anime.search.persistence.model.anime.Anime;

import java.util.ArrayList;
import java.util.List;

public class ExampleAnimeObject {

    public Anime animeExample(){

        List<String> animeGenresList = new ArrayList<>();
        animeGenresList.add("Drama");

        Anime animeT =new Anime();
        animeT.setAnimeId(52716);
        animeT.setAnimeUrl("https://myanimelist.net/anime/52716/Goku_Yoru");
        animeT.setImagesImageUrl("https://cdn.myanimelist.net/images/anime/1383/126832.jpg");
        animeT.setImagesSmallImageUrl("https://cdn.myanimelist.net/images/anime/1383/126832t.jpg");
        animeT.setImagesLargeImageUrl("https://cdn.myanimelist.net/images/anime/1383/126832l.jpg");
        animeT.setAnimeTitle("Goku Yoru");
        animeT.setAnimetype("Movie");
        animeT.setAnimeSource("Original");
        animeT.setAnimeEpisodes(1);
        animeT.setAnimeAired("Nov 13, 2021");
        animeT.setAnimeDuration("13 min");
        animeT.setAnimeRating("PG-13 - Teens 13 or older");
        animeT.setAnimeScore(0.0);
        animeT.setAnimeSynopsis("The film portrays the author's fear of how Hong Kong has changed and how she faces her emotions. It feels like the soul is broken into many pieces, but if we survive, depths of night will eventually pass.\n\n(Source: Goldenhorse)");
        animeT.setAnimeBackground("Runner-up of Best Animated Short Film at the 58th Golden Horse Awards.");
        animeT.setAnimeYear(0);
        animeT.setAnimeGenres(animeGenresList);

        return animeT;
    }
}
