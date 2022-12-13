package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImp implements CarService {

    private ArrayList<Car> cars = new ArrayList<>();

    @Override
    public List<Car> getCars(Integer count) {
        if (cars.isEmpty()) {
            cars.add(new Car("car1", 1, "1111"));
            cars.add(new Car("car2", 2, "2222"));
            cars.add(new Car("car3", 3, "3333"));
            cars.add(new Car("car4", 4, "4444"));
            cars.add(new Car("car5", 5, "5555"));
        }
        return cars;
    }
}
