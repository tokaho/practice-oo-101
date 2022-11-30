package com.oo101;

class Main {
    public static void main(String[] args) {
        Car car = new Car("Car1",new GasolineEngine());
        car.speedUp();
        Car car2 = new Car("Car2",new ElectricEngine());
        car2.speedUp();

        Truck truck = new Truck("Truck1", 10);
        truck.speedUp();

        Driver driver1 = new Driver(car);
        driver1.speedUp();
    }
}
