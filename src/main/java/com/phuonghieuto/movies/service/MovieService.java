package com.phuonghieuto.movies.service;

import com.phuonghieuto.movies.entity.Movie;
import com.phuonghieuto.movies.repository.MovieRepository;
import lombok.AllArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Service
public class MovieService {
    private MovieRepository movieRepository;
    public List<Movie> getAllMovies() {
        return movieRepository.findAll();
    }

    public Optional<Movie> getMovie(String imdbId) {
        return movieRepository.findByImdbId(imdbId);
    }
}
