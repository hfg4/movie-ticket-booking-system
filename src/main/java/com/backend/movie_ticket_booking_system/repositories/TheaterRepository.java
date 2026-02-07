package com.backend.movie_ticket_booking_system.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.backend.movie_ticket_booking_system.entities.Theater;

public interface TheaterRepository extends JpaRepository<Theater, Integer> {
    Theater findByAddress(String address);
}
