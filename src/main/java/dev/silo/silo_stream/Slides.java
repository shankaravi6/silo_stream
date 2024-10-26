package dev.silo.silo_stream;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "slide_show")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Slides {
    @Id
    private ObjectId id;  // MongoDB object id
    private String imdbId;
    private String movieLink;
    private String title;
    private List<String> genres;
    private String poster;
    private String releaseDate;
    private String imdb;
    private String rt;
    private String lb;

    private Director director;  // Nested director object
    private String distributor;
    private Double boxOffice;
    private String cinematography;
    private String music;

    private List<Cast> cast;  // Nested cast list
    private String description;

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Director {
        private String name;
        private String image;
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Cast {
        private String name;
        private String image;
    }
}
