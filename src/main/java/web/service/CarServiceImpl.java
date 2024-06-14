package web.service;

import web.model.Car;

import java.util.ArrayList;
import java.util.List;

public class CarServiceImpl implements CarService {

    @Override
    public List<Car> outCars(int count, List<Car> cars) {
        if (cars.size() < count) {
            return cars;
        }
        List<Car> carNew = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            carNew.add(cars.get(i));
        }
        return carNew;
    }

    public List<Car> createCars() {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("BMW","m3","Black"));
        cars.add(new Car("LADA","Priora","White"));
        cars.add(new Car("Opel","Astra","Pink"));
        cars.add(new Car("KAMAZ","Samosval","Orange"));
        cars.add(new Car("KIA","Rio","Yellow"));
        return cars;
    }
}

