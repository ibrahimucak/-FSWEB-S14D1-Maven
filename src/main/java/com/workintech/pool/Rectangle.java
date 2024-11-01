package com.workintech.pool;

public class Rectangle {
   private  double width;
    private double length;

    public Rectangle(double width, double height) {
        this.width = width < 0 ? 0 : width;
        this.length = height < 0 ? 0 : height;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return this.length *this.width;
    }
}
