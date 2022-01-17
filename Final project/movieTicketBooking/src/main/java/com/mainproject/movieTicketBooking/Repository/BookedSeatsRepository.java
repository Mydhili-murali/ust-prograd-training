package com.mainproject.movieTicketBooking.Repository;

import com.mainproject.movieTicketBooking.Entity.BookedSeats;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookedSeatsRepository extends JpaRepository<BookedSeats,Long> {
    public Boolean existsBySeats(String seats);
    public Boolean existsByMovieMovieId(Long movieId);
    public BookedSeats getBySeatsAndMovieMovieId(String seats,Long movieId);
    public List<BookedSeats> findByUserUserName(String userName);
}
