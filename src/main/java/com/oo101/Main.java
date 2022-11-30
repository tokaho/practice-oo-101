package com.oo101;

public class Main {
    public static void main(){
        Car car = new Car();
        car.speedUp();
        Truck truck = new Truck();
        truck.speedUp();

        Driver driver1 = new Driver(truck);
        driver1.speedUp();
    }
}
