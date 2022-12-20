package com.anime.anime.search.web.controller;

import com.anime.anime.search.domain.dto.AnimeCarousellCardDTO;
import com.anime.anime.search.domain.service.AnimeCarousellCardService;
import com.anime.anime.search.persistence.model.qparams.AnimeSearchParams;
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
    @CrossOrigin(origins="*")
    @PostMapping("/name")
    public ResponseEntity<ArrayList<AnimeCarousellCardDTO>> getAnimesByName(@RequestBody AnimeSearchParams jsonBody){
         return new ResponseEntity<>(animeCarousellCardService.getListAnime(jsonBody), HttpStatus.OK);
    }
}
