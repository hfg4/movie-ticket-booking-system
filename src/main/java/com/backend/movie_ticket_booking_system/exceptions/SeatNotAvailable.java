package com.backend.movie_ticket_booking_system.exceptions;

public class SeatNotAvailable extends RuntimeException {
    private static final long serialVersionUID = 1497113945165128412L;

    public SeatNotAvailable() {
        super("Requested Seats Are Not Available");
    }
}