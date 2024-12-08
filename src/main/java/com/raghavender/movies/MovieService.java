package com.raghavender.movies;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class MovieService {
    @Autowired
    MovieRepository movieRepository;

    public List<Movie> allMovies() {

     return movieRepository.findAll();
    }

    public Optional<Movie> singleMovie(String id) {
        return movieRepository.findMovieByImdbId(id);
    }
}
