package com.mainproject.movieTicketBooking.Service;

import com.mainproject.movieTicketBooking.Entity.Movies;
import com.mainproject.movieTicketBooking.Repository.MoviesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MoviesService {
    @Autowired
    private MoviesRepository repo;

    public List<Movies>listAllMovies(){
        return repo.findAll();
    }
    public Movies getById(Long movieId){
        return repo.getById(movieId);
    }
}
