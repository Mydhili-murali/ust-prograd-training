create database MovieTicketBooking;
select * from MovieTicketBooking.users;
drop table movieTicketBooking.movies;
select * from MovieTicketBooking.movies;
insert into MovieTicketBooking.movies values(1,"2022-01-16","Spider-Man:No Way Home","10:30",62);
insert into MovieTicketBooking.movies values(2,"2022-01-25","Minnal Murali","3:30",62);
insert into MovieTicketBooking.movies values(3,"2022-01-28","Pushpa","9.00",62);
insert into MovieTicketBooking.movies values(4,"2022-01-30","Nobody","10:30",62);
select * from MovieTicketBooking.seats;
drop table movieTicketBooking.seats;
drop table movieTicketBooking.movie_shows;

insert into movieticketbooking.Seats values(1,200,"1A");
insert into movieticketbooking.Seats values(2,200,"1B");
insert into movieticketbooking.Seats values(3,200,"1C");
insert into movieticketbooking.Seats values(4,200,"1D");
insert into movieticketbooking.Seats values(5,200,"1E");
insert into movieticketbooking.Seats values(6,200,"1F");

insert into movieticketbooking.Seats values(7,200,"2A");
insert into movieticketbooking.Seats values(8,200,"2B");
insert into movieticketbooking.Seats values(9,200,"2C");
insert into movieticketbooking.Seats values(10,200,"2D");
insert into movieticketbooking.Seats values(11,200,"2E");
insert into movieticketbooking.Seats values(12,200,"2F");

insert into movieticketbooking.Seats values(13,200,"3A");
insert into movieticketbooking.Seats values(14,200,"3B");
insert into movieticketbooking.Seats values(15,200,"3C");
insert into movieticketbooking.Seats values(16,200,"3D");
insert into movieticketbooking.Seats values(17,200,"3E");
insert into movieticketbooking.Seats values(18,200,"3F");

insert into movieticketbooking.Seats values(19,200,"4A");
insert into movieticketbooking.Seats values(20,200,"4B");
insert into movieticketbooking.Seats values(21,200,"4C");
insert into movieticketbooking.Seats values(22,200,"4D");
insert into movieticketbooking.Seats values(23,200,"4E");
insert into movieticketbooking.Seats values(24,200,"4F");

insert into movieticketbooking.Seats values(25,200,"5A");
insert into movieticketbooking.Seats values(26,200,"5B");
insert into movieticketbooking.Seats values(27,200,"5C");
insert into movieticketbooking.Seats values(28,200,"5D");
insert into movieticketbooking.Seats values(29,200,"5E");
insert into movieticketbooking.Seats values(30,200,"5F");

insert into movieticketbooking.Seats values(31,200,"6A");
insert into movieticketbooking.Seats values(32,200,"6B");
insert into movieticketbooking.Seats values(34,200,"6C");
insert into movieticketbooking.Seats values(35,200,"6D");
insert into movieticketbooking.Seats values(36,200,"6E");
insert into movieticketbooking.Seats values(37,200,"6F");

insert into movieticketbooking.Seats values(38,200,"7A");
insert into movieticketbooking.Seats values(39,200,"7B");
insert into movieticketbooking.Seats values(40,200,"7C");
insert into movieticketbooking.Seats values(41,200,"7D");
insert into movieticketbooking.Seats values(42,200,"7E");
insert into movieticketbooking.Seats values(43,200,"7F");

insert into movieticketbooking.Seats values(44,200,"8A");
insert into movieticketbooking.Seats values(45,200,"8B");
insert into movieticketbooking.Seats values(46,200,"8C");
insert into movieticketbooking.Seats values(47,200,"8D");
insert into movieticketbooking.Seats values(48,200,"8E");
insert into movieticketbooking.Seats values(49,200,"8F");

insert into movieticketbooking.Seats values(50,200,"9A");
insert into movieticketbooking.Seats values(51,200,"9B");
insert into movieticketbooking.Seats values(52,200,"9C");
insert into movieticketbooking.Seats values(53,200,"9D");
insert into movieticketbooking.Seats values(54,200,"9E");
insert into movieticketbooking.Seats values(55,200,"9F");

insert into movieticketbooking.Seats values(56,200,"10A");
insert into movieticketbooking.Seats values(57,200,"10B");
insert into movieticketbooking.Seats values(58,200,"10C");
insert into movieticketbooking.Seats values(59,200,"10D");
insert into movieticketbooking.Seats values(60,200,"10E");
insert into movieticketbooking.Seats values(61,200,"10F");

insert into MovieTicketBooking.movie_shows values(1,"10:30",1);
insert into MovieTicketBooking.movie_shows values(2,"3:30",1);
insert into MovieTicketBooking.movie_shows values(3,"9.00",1);
insert into MovieTicketBooking.movie_shows values(4,"10:30",2);
insert into MovieTicketBooking.movie_shows values(5,"3:30",2);
insert into MovieTicketBooking.movie_shows values(6,"9.00",2);
insert into MovieTicketBooking.movie_shows values(7,"10:30",3);
insert into MovieTicketBooking.movie_shows values(8,"3:30",3);
insert into MovieTicketBooking.movie_shows values(9,"9.00",3);
insert into MovieTicketBooking.movie_shows values(10,"10:30",4);
insert into MovieTicketBooking.movie_shows values(11,"3:30",4);
insert into MovieTicketBooking.movie_shows values(12,"9.00",4);
select * from MovieTicketBooking.movie_shows;
show tables from MovieTicketBooking;
select * from MovieTicketBooking.booked_seats;
drop table movieTicketBooking.booked_seats;