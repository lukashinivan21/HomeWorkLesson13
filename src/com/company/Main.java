package com.company;

public class Main {

    public static void main(String[] args) {

        Car car1 = new Car("Audi", 4);
        Car car2 = new Car("BMW", 4);

        Bicycle bicycle1 = new Bicycle("Аист", 2);
        Bicycle bicycle2 = new Bicycle("Cube", 2);

        Truck truck1 = new Truck("Камаз", 6);
        Truck truck2 = new Truck("MAN", 8);

        ServiceStation station = new ServiceStation();

        station.check(bicycle1);
        System.out.println();
        station.check(bicycle2);
        System.out.println();
        station.check(car1);
        System.out.println();
        station.check(car2);
        System.out.println();
        station.check(truck1);
        System.out.println();
        station.check(truck2);
    }
}
