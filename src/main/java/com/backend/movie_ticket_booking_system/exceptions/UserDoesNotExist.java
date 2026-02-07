package com.backend.movie_ticket_booking_system.exceptions;

public class UserDoesNotExist extends RuntimeException {
    private static final long serialVersionUID = 264309547420961862L;

    public UserDoesNotExist() {
        super("User does not exists");
    }
}
