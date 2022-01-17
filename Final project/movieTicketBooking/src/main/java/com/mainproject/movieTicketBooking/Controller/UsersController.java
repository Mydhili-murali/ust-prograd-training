package com.mainproject.movieTicketBooking.Controller;

import com.mainproject.movieTicketBooking.Entity.Movies;
import com.mainproject.movieTicketBooking.Entity.Users;
import com.mainproject.movieTicketBooking.Service.MoviesService;
import com.mainproject.movieTicketBooking.Service.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
public class UsersController {
    @Autowired
    private UsersService usersService;
    @Autowired
    private MoviesService moviesService;
    public  static String userNameFetched;

    @RequestMapping("/")
    public String index(){
        return "home";
    }
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
    @PostMapping("/register")
    public String register(HttpServletRequest req, Model model){
        String name=req.getParameter("name");
        String address=req.getParameter("address");
        String emailId=req.getParameter("emailId");
        String userName=req.getParameter("userName");
        String password=req.getParameter("password");
        Integer age=Integer.parseInt(req.getParameter("age"));
        Long phoneNumber=Long.parseLong(req.getParameter("phNo"));
            Users user=new Users(name,address,emailId,userName,password,age,phoneNumber);
            usersService.saveUser(user);
            model.addAttribute("message","Successfully registered!!!!!!");
            return "login";



    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @PostMapping("/login")
    public String login(HttpServletRequest req,Model model)
    {
        Users user;
        String userName=req.getParameter("userName");
        String password=req.getParameter("password");
        if (usersService.existsById(userName) == true) {
            userNameFetched=userName;
            user = usersService.findById(userName);
            if (password.equals(user.getPassword())) {

                model.addAttribute("message", "Successfully logged in!!!!!!!");
                model.addAttribute("userName",userName);
                model.addAttribute("movies",moviesService.listAllMovies());
                return "moviesPage";

            } else {
                model.addAttribute("message", "Invalid credentials!!!!!!!");
                return "login";
            }
        } else {
            model.addAttribute("message", "Invalid credentials!!!!!!!");
            return "login";
        }



    }






}
