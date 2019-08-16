package com.stackroute.service;

import com.stackroute.domain.Movie;
import com.stackroute.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class MovieServiceImpl implements MovieService {

    @Autowired
    private MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie saveMovie(Movie movie)
    {
        Movie savedMovie = movieRepository.save(movie);
        return savedMovie;
    }

    @Override
    public List<Movie> getAllMovies() {
        return (List<Movie>) movieRepository.findAll();
    }

    @Override
    public Optional<Movie> deleteMovieById(int id) throws Exception {
        Optional<Movie> deletedMovie = movieRepository.findById(id);
        movieRepository.deleteById(id);
        return deletedMovie;
    }

    @Override
    public Movie updateMovie(int id,Movie movie) throws Exception
    {
        movieRepository.findById(id).get();
        movie.setMovieTitle(movie.getMovieTitle());
        movie.setYearOfRelease(movie.getYearOfRelease());
        return movieRepository.save(movie);
    }

    @Override
    public Optional<Movie> getMovieById(int id) throws Exception
    {
       Optional<Movie> movies=movieRepository.findById(id);
       return movies;

    }

}
