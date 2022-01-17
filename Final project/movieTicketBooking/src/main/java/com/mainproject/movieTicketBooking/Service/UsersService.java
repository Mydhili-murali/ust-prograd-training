package com.mainproject.movieTicketBooking.Service;

import com.mainproject.movieTicketBooking.Entity.Users;
import com.mainproject.movieTicketBooking.Repository.UsersRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UsersService {
    @Autowired
    private UsersRepository repo;

    public void saveUser(Users user) {
        repo.save(user);
    }
    public Boolean existsById(String userName){
        return repo.existsById(userName);
    }

    public Users findById(String userName) {
        return repo.getById(userName);
    }
}
