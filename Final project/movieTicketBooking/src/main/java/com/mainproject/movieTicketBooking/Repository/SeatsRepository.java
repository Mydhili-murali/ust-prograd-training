package com.mainproject.movieTicketBooking.Repository;

import com.mainproject.movieTicketBooking.Entity.Seats;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SeatsRepository extends JpaRepository<Seats,Long> {
    public Seats getBySeats(String seats);
}
