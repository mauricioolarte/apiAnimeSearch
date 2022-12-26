package com.anime.anime.search.persistence.provider;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.client.RestTemplate;

public class RequestToApi {

    private final Log logger = LogFactory.getLog(RequestToApi.class);

    @Value("${value.apiJikanUrlAnime}")
    private String apiJikanUrlAnime;


    public JsonObject getListAnimeWhitSearchParam(String params){
        JsonObject response;
        logger.info("Llamado a Api ApiJickan");

        RestTemplate request = new RestTemplate();
        String url = "https://api.jikan.moe/v4/anime?q=" + params;



        Gson gson = new Gson();
        String responseBody = request.getForObject(url, String.class);
        logger.debug(responseBody);

        response = gson.fromJson( responseBody, JsonObject.class);

        logger.info("Fin Lamado a Api ApiJickan");

        return response;
    }
}
