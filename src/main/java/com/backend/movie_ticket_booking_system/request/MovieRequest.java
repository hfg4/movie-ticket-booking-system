package com.backend.movie_ticket_booking_system.request;

import com.backend.movie_ticket_booking_system.enums.Genre;
import com.backend.movie_ticket_booking_system.enums.Language;
import lombok.Data;
import java.sql.Date;

@Data
public class MovieRequest {
    private String movieName;
    private Integer duration;
    private Double rating;
    private Date releaseDate;
    private Genre genre;
    private Language language;
}