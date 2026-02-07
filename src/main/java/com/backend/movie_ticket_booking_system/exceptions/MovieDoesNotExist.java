package com.backend.movie_ticket_booking_system.exceptions;

public class MovieDoesNotExist extends RuntimeException {
    private static final long serialVersionUID = -5385129013790060351L;

    public MovieDoesNotExist() {
        super("Movie dose not Exists");
    }
}
