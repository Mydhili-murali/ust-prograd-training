package com.mydhili.demoAop;

import org.springframework.stereotype.Component;

@Component
public class Circle {
    private double radius;

    public Circle() {
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public void area(){
        double area=radius*radius;
        System.out.println("For Circle: "+ area);
    }
    public void perimeter(){
        double perimeter=2*Math.PI*radius;
        System.out.println("For circle: "+ perimeter);
    }
    public void showArea(){
        area();
    }
    public void perimeterShow(){
        perimeter();
    }
    public void displayGetRadius(){
        System.out.println("Radius: " + getRadius() );
    }
    public void process(){
        System.out.println("area of circle is calculated");
        System.out.println("perimeter circle is calculated");
    }
    public String processResult(){
        System.out.println("************************************");
        System.out.println("Running Operation for Circle...");
        System.out.println("************************************");

        return "Successfully executed ";
    }
    public void testThrowException() {
        throw new NullPointerException();
    }
}
