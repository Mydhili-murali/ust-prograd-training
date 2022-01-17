package com.mainproject.movieTicketBooking.Entity;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.util.List;

@Entity
public class Movies {
    @Id
    @GeneratedValue
    private Long movieId;
    @Column(nullable = false)
    private String movieName;
    @Column(nullable = false)
    private Date movieDate;
    @Column(nullable = false)
    private Time movieTime;
    @Column(nullable = false)
    private Integer numberOfTicketsAvailable;
    @OneToMany(mappedBy = "movie")
    private List<BookedSeats> bookedSeats;

    public Movies() {
    }

    public Movies (String movieName, Date movieDate, Time movieTime, Integer numberOfTicketsAvailable) {

        this.movieName = movieName;
        this.movieDate = movieDate;
        this.movieTime = movieTime;
        this.numberOfTicketsAvailable=numberOfTicketsAvailable;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getMovieName() {
        return movieName;
    }

    public void setMovieName(String movieName) {
        this.movieName = movieName;
    }

    public Date getMovieDate() {
        return movieDate;
    }

    public void setMovieDate(Date movieDate) {
        this.movieDate = movieDate;
    }

    public Time getMovieTime() {
        return movieTime;
    }

    public void setMovieTime(Time movieTime) {
        this.movieTime = movieTime;
    }

    public Integer getNumberOfTicketsAvailable() {
        return numberOfTicketsAvailable;
    }

    public void setNumberOfTicketsAvailable(Integer numberOfTicketsAvailable) {
        this.numberOfTicketsAvailable = numberOfTicketsAvailable;
    }

    public List<BookedSeats> getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(List<BookedSeats> bookedSeats) {
        this.bookedSeats = bookedSeats;
    }
}
