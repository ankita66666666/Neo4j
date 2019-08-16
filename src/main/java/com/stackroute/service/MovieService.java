package com.stackroute.service;

import com.stackroute.domain.Movie;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface MovieService {

    public Movie saveMovie(Movie movie) throws Exception;
    public List<Movie> getAllMovies() throws Exception;
    public Optional<Movie> deleteMovieById(int id) throws Exception;
    public Movie updateMovie(int id,Movie movie) throws Exception;
    public Optional<Movie> getMovieById(int id) throws Exception;

}
