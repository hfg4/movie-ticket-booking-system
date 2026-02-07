package com.backend.movie_ticket_booking_system.request;

import lombok.Data;

@Data
public class ShowSeatRequest {
    private Integer showId;
    private Integer priceOfPremiumSeat;
    private Integer priceOfClassicSeat;
}