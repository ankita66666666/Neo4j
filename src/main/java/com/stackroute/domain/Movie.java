package com.stackroute.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.neo4j.ogm.annotation.*;

import java.util.ArrayList;
import java.util.List;

@NodeEntity

@Data

@NoArgsConstructor

@AllArgsConstructor

public class Movie {

    @GraphId

    private Long movieId;
    private String movieTitle;
    private int yearOfRelease;
    @Relationship(type = "like")
    private List<Movie> movies = new ArrayList<>();
}

