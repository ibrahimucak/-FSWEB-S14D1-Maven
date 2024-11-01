package com.workintech.pool;

public class Cuboid  extends  Rectangle{
    private double height;



    public Cuboid(double width, double height ,  double length) {
        super(width, height);
        this.height = Math.max(height, 0);
    }


    public double getLength() {
        return height;
    }
    public double getVolume(){
        return super.getArea() * this.getHeight();
    }


    public double getHeight() {
        return this.height;
    }
}
