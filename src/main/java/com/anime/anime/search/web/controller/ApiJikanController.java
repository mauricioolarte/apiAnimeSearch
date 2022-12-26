package com.anime.anime.search.web.controller;

import com.anime.anime.search.domain.dto.AnimeCarousellCardDTO;
import com.anime.anime.search.domain.service.AnimeCarousellCardService;
import com.anime.anime.search.persistence.model.qparams.AnimeSearchParams;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/anime")
public class ApiJikanController {
    @Autowired
    private AnimeCarousellCardService animeCarousellCardService;
    private final Log logger = LogFactory.getLog(ApiJikanController.class);

    @CrossOrigin(origins="http://localhost:3000")
    @PostMapping("/name")
    public ResponseEntity<ArrayList<AnimeCarousellCardDTO>> getAnimesByName(@RequestBody AnimeSearchParams jsonBody){
        logger.info("llamado a ruta /anime");
         return new ResponseEntity<>(animeCarousellCardService.getListAnime(jsonBody), HttpStatus.OK);
    }
}
