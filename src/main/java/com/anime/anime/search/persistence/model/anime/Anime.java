package com.anime.anime.search.persistence.model.anime;

import java.util.List;

public class Anime {
    private Integer animeId;
    private String animeUrl;
    private String imagesImageUrl;
    private String imagesSmallImageUrl;
    private String imagesLargeImageUrl;
    private String animeTitle;
    private String animetype;
    private String animeSource;
    private Integer animeEpisodes;
    private String animeAired;
    private String animeDuration;
    private String animeRating;
    private Double animeScore;
    private String animeSynopsis;
    private String animeBackground;
    private Integer animeYear;
    private List<String> animeGenres;


    public Integer getAnimeId() {
        return animeId;
    }

    public void setAnimeId(Integer animeId) {
        this.animeId = animeId;
    }

    public String getAnimeUrl() {
        return animeUrl;
    }

    public void setAnimeUrl(String animeUrl) {
        this.animeUrl = animeUrl;
    }

    public String getImagesImageUrl() {
        return imagesImageUrl;
    }

    public void setImagesImageUrl(String imagesImageUrl) {
        this.imagesImageUrl = imagesImageUrl;
    }

    public String getImagesSmallImageUrl() {
        return imagesSmallImageUrl;
    }

    public void setImagesSmallImageUrl(String imagesSmallImageUrl) {
        this.imagesSmallImageUrl = imagesSmallImageUrl;
    }

    public String getImagesLargeImageUrl() {
        return imagesLargeImageUrl;
    }

    public void setImagesLargeImageUrl(String imagesLargeImageUrl) {
        this.imagesLargeImageUrl = imagesLargeImageUrl;
    }

    public String getAnimeTitle() {
        return animeTitle;
    }

    public void setAnimeTitle(String animeTitle) {
        this.animeTitle = animeTitle;
    }

    public String getAnimetype() {
        return animetype;
    }

    public void setAnimetype(String animetype) {
        this.animetype = animetype;
    }

    public String getAnimeSource() {
        return animeSource;
    }

    public void setAnimeSource(String animeSource) {
        this.animeSource = animeSource;
    }

    public Integer getAnimeEpisodes() {
        return animeEpisodes;
    }

    public void setAnimeEpisodes(Integer animeEpisodes) {
        this.animeEpisodes = animeEpisodes;
    }

    public String getAnimeAired() {
        return animeAired;
    }

    public void setAnimeAired(String animeAired) {
        this.animeAired = animeAired;
    }

    public String getAnimeDuration() {
        return animeDuration;
    }

    public void setAnimeDuration(String animeDuration) {
        this.animeDuration = animeDuration;
    }

    public String getAnimeRating() {
        return animeRating;
    }

    public void setAnimeRating(String animeRating) {
        this.animeRating = animeRating;
    }

    public Double getAnimeScore() {
        return animeScore;
    }

    public void setAnimeScore(Double animeScore) {
        this.animeScore = animeScore;
    }

    public String getAnimeSynopsis() {
        return animeSynopsis;
    }

    public void setAnimeSynopsis(String animeSynopsis) {
        this.animeSynopsis = animeSynopsis;
    }

    public String getAnimeBackground() {
        return animeBackground;
    }

    public void setAnimeBackground(String animeBackground) {
        this.animeBackground = animeBackground;
    }

    public Integer getAnimeYear() {
        return animeYear;
    }

    public void setAnimeYear(Integer animeYear) {
        this.animeYear = animeYear;
    }

    public List<String> getAnimeGenres() {
        return animeGenres;
    }

    public void setAnimeGenres(List<String> animeGenres) {
        this.animeGenres = animeGenres;
    }
}
