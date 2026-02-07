package com.backend.movie_ticket_booking_system.exceptions;

public class TheaterDoesNotExist extends RuntimeException {
    private static final long serialVersionUID = 2885350098352987873L;

    public TheaterDoesNotExist() {
        super("Theater does not Exists");
    }
}
