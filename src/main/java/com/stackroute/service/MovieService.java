package com.stackroute.service;

import com.stackroute.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.List;

public interface MovieService {

    public Movie saveMovie(Movie movie);

    public List<Movie> getAllMovies();

}
