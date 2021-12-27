create database College;
show databases;
create table College.Student(
ID int,
Name varchar(255),
Department varchar(255),
Contact long,
Marks int);
select * from College.Student;
insert into College.Student values(100,"Mydhili","CSE",9842345,90);
insert into College.Student values(101,"Nimin","ECE",9842342,91);
insert into College.Student values(102,"Rohit","EEE",9842325,89);
insert into College.Student values(103,"Nivedya","CE",9232345,90);
select ID,Name from College.Student;
insert into College.Student values(103,"Mydhi","CSE",9232345,90);
SET SQL_SAFE_UPDATES=0;
delete from College.Student where Name="Mydhi";
alter table College.Student add primary key(ID);
alter table College.Student drop primary key;
select * from College.Student where Marks < 90;
select * from college.student where Marks > 90;
update college.student set marks = 95 where Name= "Mydhili";
select * from college.student where Marks = 95 and Department="CSE";
select Name, max(marks) from college.student;
select min(marks) from college.student;
select min(marks) as minimum from college.student;
select sum(marks) as total from college.student;
select count(marks) as total from college.student where ID=102;
select *from college.student where marks between 90 and 95;
select *from college.student where marks not between 90 and 95;
select *from college.student where department in ("EEE","ECE","CSE");
select *from college.student where department ="EEE"or department="CE";
select * from college.student where Name like "M%";
select * from college.student where Name like "%i";
select * from college.student where Name like "M%i";
select *from college.student order by marks;
select *from college.student order by marks desc;
select *from college.student order by Name asc;
delete from college.student;
drop table college.student;
drop database college;
show databases;

insert into College.Student values(104,"Mydhi","CSE",9842345,96);
insert into College.Student values(105,"Kannan","ECE",9842342,90);
insert into College.Student values(106,"Chottu","EEE",9842325,91);
insert into College.Student values(107,"Nivu","CE",9232345,94);
select * from College.Student;
delete from College.Student where Name="Nivu";
SET SQL_SAFE_UPDATES=0;
alter table College.Student add primary key(ID); 
select count(department) as count, department from College.Student group by department;
select sum(marks) as total,department from College.Student group by department;
select sum(marks) as total,department from College.Student group by department order by department desc;
select sum(marks) as total,Name,department from College.Student group by department order by Name asc;
select count(department) as count,department from College.Student group by department having sum(marks)>90 order by Name asc;


