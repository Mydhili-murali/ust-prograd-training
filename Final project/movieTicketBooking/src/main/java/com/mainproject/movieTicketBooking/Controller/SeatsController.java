package com.mainproject.movieTicketBooking.Controller;

import com.mainproject.movieTicketBooking.Entity.BookedSeats;
import com.mainproject.movieTicketBooking.Entity.Seats;
import com.mainproject.movieTicketBooking.Service.BookedSeatsService;
import com.mainproject.movieTicketBooking.Service.MoviesService;
import com.mainproject.movieTicketBooking.Service.SeatsService;
import com.mainproject.movieTicketBooking.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Objects;

@Controller
public class SeatsController {
    @Autowired
    private BookedSeatsService bookedSeatsService;
    @Autowired
    private SeatsService seatsService;

    @Autowired
    private MoviesService moviesService;

    @Autowired
    private UsersService usersService;

    @GetMapping("/{userName}/seatMap/{id}")
    public String bookMyShow(@PathVariable String userName,@PathVariable Long id,Model model){
        model.addAttribute("userName",userName);
        model.addAttribute("movie",id);
        return "seatMap";
    }


    @GetMapping("/{userName}/bookedStatus/{id}")
    public String seatBooking(@PathVariable String userName,@PathVariable Long id,Model model){
        model.addAttribute("userName",userName);
        model.addAttribute("movie",id);
        return "bookedStatus";
    }


    @PostMapping("/{userName}/bookedStatus/{id}")
    public String bookedSeats(@PathVariable String userName,@PathVariable Long id, HttpServletRequest request, Model model){
        model.addAttribute("movie",id);
        String bookSeats=request.getParameter("bookedSeats");
        String[] bookedSeat=bookSeats.split(",");
        for(String seat:bookedSeat){
            BookedSeats bookedSeats=bookedSeatsService.getBySeatsAndMovieMovieId(seat,id);
            if(!(Objects.isNull(bookedSeats))){
                model.addAttribute("message1", " Seats are already booked...Please select another seats to continue booking !!!");
                return "seatMap";
            }
        }
        for(String seat:bookedSeat){
            BookedSeats bookedSeats=bookedSeatsService.getBySeatsAndMovieMovieId(seat,id);
            Seats seats=seatsService.getBySeats(seat);
                BookedSeats bookedSeats1=new BookedSeats(seats.getSeats(),seats.getPrice());
                bookedSeats1.setMovie(moviesService.getById(id));
                bookedSeats1.setUser(usersService.findById(userName));
                bookedSeatsService.saveSeats(bookedSeats1);
                model.addAttribute("message","Seats booked successfully!!!");

            }




        return "bookedStatus";
    }
@GetMapping("/{userName}/myBookings")
    public String myBookings(@PathVariable String userName, Model model ){
model.addAttribute("userName",bookedSeatsService.getByUserUserName(userName));
        return "myBookings";
}


}
