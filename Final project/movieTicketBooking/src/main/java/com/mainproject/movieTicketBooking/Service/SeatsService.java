package com.mainproject.movieTicketBooking.Service;

import com.mainproject.movieTicketBooking.Entity.Seats;
import com.mainproject.movieTicketBooking.Repository.SeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SeatsService {
    @Autowired
    private SeatsRepository repo;
    public Seats getBySeats(String seats){
        return repo.getBySeats(seats);
    }
}
