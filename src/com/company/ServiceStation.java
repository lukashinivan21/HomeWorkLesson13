package com.company;

public class ServiceStation implements Service {


    @Override
    public void check(Bicycle bicycle) {
        message(bicycle);
    }

    @Override
    public void check(Car car) {
        message(car);
        car.checkEngine();
    }

    @Override
    public void check(Truck truck) {
        message(truck);
        truck.checkEngine();
        truck.checkTrailer();
    }

    public void message(Transport transport) {
        System.out.println("Обслуживаем " + transport.getModelName());
        for (int i = 0; i < transport.getWheelsCount(); i++) {
            transport.updateTyre();
        }
    }
}
