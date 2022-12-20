package com.anime.anime.search.persistence.model.anime;

/**
 * clase que define la entidad empisodio, corresponde a la informacion de cada episodio de una serie de anime
 */

public class AnimeEpisode {

    private  Integer episodeId;
    private Integer animeId;
    private String urlEpisode;
    private String titleEpisode;
    private Double scoreEpisode;

    public AnimeEpisode(Integer episodeId, Integer animeId, String urlEpisode, String titleEpisode, Double scoreEpisode) {
        this.episodeId = episodeId;
        this.animeId = animeId;
        this.urlEpisode = urlEpisode;
        this.titleEpisode = titleEpisode;
        this.scoreEpisode = scoreEpisode;
    }


    public Integer getEpisodeId() {
        return episodeId;
    }

    public void setEpisodeId(Integer episodeId) {
        this.episodeId = episodeId;
    }

    public Integer getAnimeId() {
        return animeId;
    }

    public void setAnimeId(Integer animeId) {
        this.animeId = animeId;
    }

    public String getUrlEpisode() {
        return urlEpisode;
    }

    public void setUrlEpisode(String urlEpisode) {
        this.urlEpisode = urlEpisode;
    }

    public String getTitleEpisode() {
        return titleEpisode;
    }

    public void setTitleEpisode(String titleEpisode) {
        this.titleEpisode = titleEpisode;
    }

    public Double getScoreEpisode() {
        return scoreEpisode;
    }

    public void setScoreEpisode(Double scoreEpisode) {
        this.scoreEpisode = scoreEpisode;
    }
}
