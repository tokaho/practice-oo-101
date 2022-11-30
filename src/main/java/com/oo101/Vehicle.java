package com.oo101;

public class Vehicle {
    private String name;
    private int speed;
    public Vehicle(String name, int speed){
        this.name=name;
        this.speed=speed;
    }
    public void speedUp(){
        System.out.println(String.format("%s: speed up %d km/h\n",this.name,this.speed));
    }
}
