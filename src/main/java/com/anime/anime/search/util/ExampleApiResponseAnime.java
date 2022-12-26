package com.anime.anime.search.util;

import org.springframework.stereotype.Component;

@Component
public class ExampleApiResponseAnime {

    public String jsonString() {
        return "{\n" +
                "    \"pagination\": {\n" +
                "        \"last_visible_page\": 1,\n" +
                "        \"has_next_page\": false,\n" +
                "        \"current_page\": 1,\n" +
                "        \"items\": {\n" +
                "            \"count\": 3,\n" +
                "            \"total\": 3,\n" +
                "            \"per_page\": 25\n" +
                "        }\n" +
                "    },\n" +
                "    \"data\": [\n" +
                "        {\n" +
                "            \"mal_id\": 52716,\n" +
                "            \"url\": \"https://myanimelist.net/anime/52716/Goku_Yoru\",\n" +
                "            \"images\": {\n" +
                "                \"jpg\": {\n" +
                "                    \"image_url\": \"https://cdn.myanimelist.net/images/anime/1383/126832.jpg\",\n" +
                "                    \"small_image_url\": \"https://cdn.myanimelist.net/images/anime/1383/126832t.jpg\",\n" +
                "                    \"large_image_url\": \"https://cdn.myanimelist.net/images/anime/1383/126832l.jpg\"\n" +
                "                },\n" +
                "                \"webp\": {\n" +
                "                    \"image_url\": \"https://cdn.myanimelist.net/images/anime/1383/126832.webp\",\n" +
                "                    \"small_image_url\": \"https://cdn.myanimelist.net/images/anime/1383/126832t.webp\",\n" +
                "                    \"large_image_url\": \"https://cdn.myanimelist.net/images/anime/1383/126832l.webp\"\n" +
                "                }\n" +
                "            },\n" +
                "            \"trailer\": {\n" +
                "                \"youtube_id\": null,\n" +
                "                \"url\": null,\n" +
                "                \"embed_url\": null,\n" +
                "                \"images\": {\n" +
                "                    \"image_url\": null,\n" +
                "                    \"small_image_url\": null,\n" +
                "                    \"medium_image_url\": null,\n" +
                "                    \"large_image_url\": null,\n" +
                "                    \"maximum_image_url\": null\n" +
                "                }\n" +
                "            },\n" +
                "            \"approved\": true,\n" +
                "            \"titles\": [\n" +
                "                {\n" +
                "                    \"type\": \"Default\",\n" +
                "                    \"title\": \"Goku Yoru\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"type\": \"Japanese\",\n" +
                "                    \"title\": \"極夜\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"type\": \"English\",\n" +
                "                    \"title\": \"Depths of Night\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"title\": \"Goku Yoru\",\n" +
                "            \"title_english\": \"Depths of Night\",\n" +
                "            \"title_japanese\": \"極夜\",\n" +
                "            \"title_synonyms\": [],\n" +
                "            \"type\": \"Movie\",\n" +
                "            \"source\": \"Original\",\n" +
                "            \"episodes\": 1,\n" +
                "            \"status\": \"Finished Airing\",\n" +
                "            \"airing\": false,\n" +
                "            \"aired\": {\n" +
                "                \"from\": \"2021-11-13T00:00:00+00:00\",\n" +
                "                \"to\": null,\n" +
                "                \"prop\": {\n" +
                "                    \"from\": {\n" +
                "                        \"day\": 13,\n" +
                "                        \"month\": 11,\n" +
                "                        \"year\": 2021\n" +
                "                    },\n" +
                "                    \"to\": {\n" +
                "                        \"day\": null,\n" +
                "                        \"month\": null,\n" +
                "                        \"year\": null\n" +
                "                    }\n" +
                "                },\n" +
                "                \"string\": \"Nov 13, 2021\"\n" +
                "            },\n" +
                "            \"duration\": \"13 min\",\n" +
                "            \"rating\": \"PG-13 - Teens 13 or older\",\n" +
                "            \"score\": null,\n" +
                "            \"scored_by\": null,\n" +
                "            \"rank\": 18906,\n" +
                "            \"popularity\": 20523,\n" +
                "            \"members\": 57,\n" +
                "            \"favorites\": 0,\n" +
                "            \"synopsis\": \"The film portrays the author's fear of how Hong Kong has changed and how she faces her emotions. It feels like the soul is broken into many pieces, but if we survive, depths of night will eventually pass.\\n\\n(Source: Goldenhorse)\",\n" +
                "            \"background\": \"Runner-up of Best Animated Short Film at the 58th Golden Horse Awards.\",\n" +
                "            \"season\": null,\n" +
                "            \"year\": null,\n" +
                "            \"broadcast\": {\n" +
                "                \"day\": null,\n" +
                "                \"time\": null,\n" +
                "                \"timezone\": null,\n" +
                "                \"string\": null\n" +
                "            },\n" +
                "            \"producers\": [],\n" +
                "            \"licensors\": [],\n" +
                "            \"studios\": [],\n" +
                "            \"genres\": [\n" +
                "                {\n" +
                "                    \"mal_id\": 8,\n" +
                "                    \"type\": \"anime\",\n" +
                "                    \"name\": \"Drama\",\n" +
                "                    \"url\": \"https://myanimelist.net/anime/genre/8/Drama\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"explicit_genres\": [],\n" +
                "            \"themes\": [\n" +
                "                {\n" +
                "                    \"mal_id\": 40,\n" +
                "                    \"type\": \"anime\",\n" +
                "                    \"name\": \"Psychological\",\n" +
                "                    \"url\": \"https://myanimelist.net/anime/genre/40/Psychological\"\n" +
                "                }\n" +
                "            ],\n" +
                "            \"demographics\": []\n" +
                "        },\n" +
                "    ]\n" +
                "}";


    }
}
