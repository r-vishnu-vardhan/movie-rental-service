package com.etraveli.movie.rental.service.service;

import com.etraveli.movie.rental.service.entities.Movie;

import java.util.List;

public interface MovieService {
    Movie findById(Long id);
}
