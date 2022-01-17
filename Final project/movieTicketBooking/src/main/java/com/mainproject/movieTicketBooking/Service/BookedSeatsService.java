package com.mainproject.movieTicketBooking.Service;

import com.mainproject.movieTicketBooking.Entity.BookedSeats;
import com.mainproject.movieTicketBooking.Repository.BookedSeatsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookedSeatsService {
@Autowired
    private BookedSeatsRepository repo;


    public void saveSeats(BookedSeats bookedSeats) {
        repo.save(bookedSeats);
    }

    public Boolean existsByMovieMovieId(Long movieId){
       return repo.existsByMovieMovieId(movieId);
    }
    public Boolean existsBySeats(String seats){
        return repo.existsBySeats(seats);
    }
    public BookedSeats getBySeatsAndMovieMovieId(String seats, Long movieId){return repo.getBySeatsAndMovieMovieId(seats,movieId);}
public List<BookedSeats> getByUserUserName(String userName){return repo.findByUserUserName(userName);}
}
