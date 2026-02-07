package com.backend.movie_ticket_booking_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.movie_ticket_booking_system.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer> {
    Movie findByMovieName(String name);
}