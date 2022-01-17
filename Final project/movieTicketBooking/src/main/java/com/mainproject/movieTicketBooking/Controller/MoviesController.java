package com.mainproject.movieTicketBooking.Controller;


import com.mainproject.movieTicketBooking.Service.MoviesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

import static com.mainproject.movieTicketBooking.Controller.UsersController.userNameFetched;

@Controller
public class MoviesController {
    @Autowired
    private MoviesService moviesService;

    @RequestMapping("/moviesPage")
    public String moviesPage(Model model){
        model.addAttribute("movies",moviesService.listAllMovies());

        return "moviesPage";
    }



    @RequestMapping("/{userName}/movieDetails/{id}")
    public String movieDetails(@PathVariable String userName,@PathVariable Long id,Model model){
//System.out.println(moviesService.getById((id)).getMovieName());
        model.addAttribute("userName",userName);
        model.addAttribute("movie", moviesService.getById(id));
       // model.addAttribute("movieShows",movieShowsService.listMovieShows(id));
       // model.addAttribute("movieName",moviesService.getById((id)).getMovieName());

        return "movieDetails";
    }



}
