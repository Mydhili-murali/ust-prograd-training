package com.mainproject.movieTicketBooking.Repository;

import com.mainproject.movieTicketBooking.Entity.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsersRepository extends JpaRepository<Users,String> {
}
