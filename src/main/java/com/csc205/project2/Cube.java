package com.csc205.project2;

public class Cube extends Sphere {

    public Cube(int length) {
        super(length);
// TODO Auto-generated constructor stub
    }

    public double surfaceArea() {
        return 6*radius*radius;
    }

    public double volume() {
        return radius*radius*radius;
    }


    public String toString() {
        return "Cube [width"+surfaceArea()+=" + surfaceArea() + "+ volume+=" + volume() + "]";
    }


}