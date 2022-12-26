package com.anime.anime.search.persistence.provider;

import com.anime.anime.search.domain.repository.ApiJikanProviderInterface;
import com.anime.anime.search.persistence.model.anime.Anime;
import com.anime.anime.search.persistence.model.qparams.AnimeSearchParams;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class ApiJikanProvider implements ApiJikanProviderInterface {
    private static final Integer DEFAULT_INT = 0;
    private static final Double DEFAULT_DOUBLE = 0.0;
    private static final String IMAGES_LEVEL = "images";

    private final Log logger = LogFactory.getLog(ApiJikanProvider.class);


    @Value("${value.apiJikanUrlAnime}")
    private String apiJikanUrlAnime;

    @Override
    public ArrayList<Anime> getAnimeByQueryParams(AnimeSearchParams params) {

        logger.info("Inicio metodo getAnimeByQueryParams");

        ArrayList<Anime> animeList = new ArrayList<>();
        try {

            JsonObject response;

            RequestToApi requestToApi = new RequestToApi();

            response = requestToApi.getListAnimeWhitSearchParam(params.getWordToSearch());

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

            logger.info("Fin metodo getAnimeByQueryParams");



        } catch (Exception e) {
            logger.error(e.toString());
        }
        return  animeList;

    }
}
