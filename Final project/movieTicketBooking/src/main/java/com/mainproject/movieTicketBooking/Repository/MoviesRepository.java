package com.mainproject.movieTicketBooking.Repository;

import com.mainproject.movieTicketBooking.Entity.Movies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MoviesRepository extends JpaRepository<Movies,Long> {
}
