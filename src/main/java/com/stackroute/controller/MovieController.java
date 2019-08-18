package com.stackroute.controller;

import com.stackroute.domain.Movie;
import com.stackroute.repository.MovieRepository;
import com.stackroute.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;


@RestController

@RequestMapping(value = "api/v1/")
public class MovieController {

    private MovieService movieService;

    @Autowired
    public MovieController(MovieService movieService) throws Exception
    {
        this.movieService = movieService;
    }

    @PostMapping("movie")
    public ResponseEntity<?> saveMovie(@RequestBody Movie movie) throws Exception{
        return new ResponseEntity<>(movieService.saveMovie(movie), HttpStatus.CREATED);
    }

    @GetMapping("movies")
    public ResponseEntity<?> getAllMovies() throws Exception
    {
        return new ResponseEntity<>(movieService.getAllMovies(), HttpStatus.FOUND);
    }
    @GetMapping("movies/{id}")
    public ResponseEntity<?> deleteById(@PathVariable("id") int id) throws Exception
    {
        Optional<Movie> movie=movieService.deleteMovieById(id);
        return new ResponseEntity<>(movieService.deleteMovieById(id),HttpStatus.OK);
    }
    @PutMapping("movies/{id}")
    public ResponseEntity<?> updateMovie(@PathVariable int id,@RequestBody Movie movie) throws Exception
    {
        Movie movie1=movieService.updateMovie(id,movie);
        return new ResponseEntity<>(movieService.updateMovie(id,movie),HttpStatus.OK);
    }
        @GetMapping("movie/get/{id}")
    public ResponseEntity<?> getById(@PathVariable int id) throws Exception
        {
            Optional<Movie> movie=movieService.getMovieById(id);
            return new ResponseEntity<>(movie,HttpStatus.OK);
        }


}
