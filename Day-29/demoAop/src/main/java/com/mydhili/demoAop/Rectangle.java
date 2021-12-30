package com.mydhili.demoAop;

import org.springframework.stereotype.Component;

@Component
public class Rectangle {
    double length,breadth;

    public Rectangle() {
    }

    public double getLength() {
        return length;
    }

    public void setLengthAndBreadth(double length,double breadth) {
        this.length = length;
        this.breadth=breadth;
    }

    public double getBreadth() {
        return breadth;
    }


    public void area(){
       double area=length*breadth;
        System.out.println("For Rectangle: "+ area);
    }
    public void perimeter(){
        double perimeter=2*(length+breadth);
        System.out.println("For Rectangle: "+ perimeter);
    }
    public void showArea(){
        area();
    }
    public void perimeterShow(){
        perimeter();
    }
    public void displayGetLengthAndBreadth(){
        System.out.println("Length: " +getLength());
        System.out.println("Breadth: " +getBreadth());
    }
    public void process(){
        System.out.println("area of rectangle is calculated");
        System.out.println("perimeter of rectangle is calculated");
    }

    public String processResult(){
        System.out.println("************************************");
        System.out.println("Running Operation for Rectangle...");
        System.out.println("************************************");

        return "Successfully executed ";
    }
    public void testThrowException() {
        throw new NullPointerException();
    }

}
