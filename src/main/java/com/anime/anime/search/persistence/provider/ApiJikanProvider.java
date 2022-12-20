package com.anime.anime.search.persistence.provider;

import com.anime.anime.search.domain.repository.ApiJikanProviderInterface;
import com.anime.anime.search.persistence.model.anime.Anime;
import com.anime.anime.search.persistence.model.qparams.AnimeSearchParams;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import java.util.ArrayList;
import java.util.List;

@Component
public class ApiJikanProvider implements ApiJikanProviderInterface {
    private static final Integer DEFAULT_INT = 0;
    private static final Double DEFAULT_DOUBLE = 0.0;
    private static final String IMAGES_LEVEL = "images";

    private final Log LOGGER = LogFactory.getLog(ApiJikanProvider.class);


    @Value("${value.apiJikanUrlAnime}")
    private String apiJikanUrlAnime;

    @Override
    public ArrayList<Anime> getAnimeByQueryParams(AnimeSearchParams params) {

        LOGGER.info("Inicio metodo getAnimeByQueryParams");

        try {

        } catch (Exception e) {
            LOGGER.error(e.getStackTrace());
        }
        JsonObject response;
        Gson gson = new Gson();
        RestTemplate request = new RestTemplate();
        ArrayList<Anime> animeList = new ArrayList<>();

        LOGGER.info("Lamado a Api ApiJickan");

        response = gson.fromJson( request.getForObject(apiJikanUrlAnime+params.getWordToSearch(), String.class), JsonObject.class);

        LOGGER.info("Fin Lamado a Api ApiJickan");

        JsonArray array;
        array = response.get("data").getAsJsonArray();
        array.forEach(jsonElement -> {
            Anime anime = new Anime();
            JsonObject animeJson;
            animeJson = jsonElement.getAsJsonObject();

            List<String> animeGenresList = new ArrayList<>();
            JsonArray genres;
            genres = animeJson.get("genres").getAsJsonArray();

            genres.forEach(g -> animeGenresList.add(g.getAsJsonObject().get("name").getAsString()));

            anime.setAnimeId( (animeJson.get("mal_id").toString().equals("null"))?
                    DEFAULT_INT:animeJson.get("mal_id").getAsInt());
            anime.setAnimeUrl((animeJson.get("url").toString().equals("null"))?
                    "":animeJson.get("url").getAsString());
            anime.setImagesImageUrl((animeJson.get(IMAGES_LEVEL).getAsJsonObject().get("jpg").getAsJsonObject().get("image_url").toString().equals("null"))?
                    "":animeJson.get(IMAGES_LEVEL).getAsJsonObject().get("jpg").getAsJsonObject().get("image_url").getAsString());
            anime.setImagesSmallImageUrl((animeJson.get(IMAGES_LEVEL).getAsJsonObject().get("jpg").getAsJsonObject().get("small_image_url").toString().equals("null"))?
                    "":animeJson.get(IMAGES_LEVEL).getAsJsonObject().get("jpg").getAsJsonObject().get("small_image_url").getAsString());
            anime.setImagesLargeImageUrl((animeJson.get(IMAGES_LEVEL).getAsJsonObject().get("jpg").getAsJsonObject().get("large_image_url").toString().equals("null"))?
                    "":animeJson.get(IMAGES_LEVEL).getAsJsonObject().get("jpg").getAsJsonObject().get("large_image_url").getAsString());
            anime.setAnimeTitle((animeJson.get("title").toString().equals("null"))?"":animeJson.get("title").getAsString());
            anime.setAnimetype((animeJson.get("type").toString().equals("null"))?"":animeJson.get("type").getAsString());
            anime.setAnimeSource((animeJson.get("source").toString().equals("null"))?"":animeJson.get("source").getAsString());
            anime.setAnimeEpisodes((animeJson.get("episodes").toString().equals("null"))?DEFAULT_INT:animeJson.get("episodes").getAsInt());
            anime.setAnimeAired((animeJson.get("aired").getAsJsonObject().get("string").toString().equals("null"))?
                    "":animeJson.get("aired").getAsJsonObject().get("string").getAsString());
            anime.setAnimeDuration((animeJson.get("duration").toString().equals("null"))?"":animeJson.get("duration").getAsString());
            anime.setAnimeRating((animeJson.get("rating").toString().equals("null"))?"":animeJson.get("rating").getAsString());
            anime.setAnimeScore((animeJson.get("score").toString().equals("null"))?DEFAULT_DOUBLE:animeJson.get("score").getAsDouble());
            anime.setAnimeSynopsis((animeJson.get("synopsis").toString().equals("null"))?"":animeJson.get("synopsis").getAsString());
            anime.setAnimeBackground((animeJson.get("background").toString().equals("null"))?"":animeJson.get("background").getAsString());
            anime.setAnimeYear((animeJson.get("year").toString().equals("null"))?DEFAULT_INT:animeJson.get("year").getAsInt());
            anime.setAnimeGenres(animeGenresList);
            animeList.add(anime);
        });
        LOGGER.info("Fin metodo getAnimeByQueryParams");

        return  animeList;
    }
}
