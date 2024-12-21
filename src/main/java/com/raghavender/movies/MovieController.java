package com.raghavender.movies;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/movies")
@CrossOrigin(origins = "*" , maxAge = 3600)
public class MovieController {
    @Autowired
    MovieService movieService;
@GetMapping
public ResponseEntity<List<Movie>> getAllMovies(){
    return new ResponseEntity<List<Movie>>(movieService.allMovies(), HttpStatus.OK);
}

@GetMapping("/{id}")
public ResponseEntity<Optional<Movie>> getMovieById(@PathVariable String id){
    return new ResponseEntity<Optional<Movie>>(movieService.movieRepository.findMovieByImdbId(id), HttpStatus.OK);
}
}
