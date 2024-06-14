package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiceImpl;

import java.util.ArrayList;
import java.util.List;

@Controller
public class CarController {

//    public List<Car> createCars() {
//        List<Car> cars = new ArrayList<Car>();
//        cars.add(new Car("BMW","m3","Black"));
//        cars.add(new Car("LADA","Priora","White"));
//        cars.add(new Car("Opel","Astra","Pink"));
//        cars.add(new Car("KAMAZ","Samosval","Orange"));
//        cars.add(new Car("KIA","Rio","Yellow"));
//        return cars;
//    }

    @GetMapping(value="/cars")
    public String printCars(@RequestParam(value="count",defaultValue = "5") int count, Model model) {
        CarService carService = new CarServiceImpl();
//        List<Car> cars = new ArrayList<Car>();
//        cars.add(new Car("BMW","m3","Black"));
//        cars.add(new Car("LADA","Priora","White"));
//        cars.add(new Car("Opel","Astra","Pink"));
//        cars.add(new Car("KAMAZ","Samosval","Orange"));
//        cars.add(new Car("KIA","Rio","Yellow"));
        model.addAttribute("cars", carService.outCars(count, carService.createCars()));
        return "cars";
    }

//    public List<Car> outCars(int count, List<Car> cars) {
//        if (cars.size() < count) {
//            return cars;
//        }
//        List<Car> carNew = new ArrayList<>();
//        for (int i = 0; i < count; i++) {
//            carNew.add(cars.get(i));
//        }
//        return carNew;
//    }
}
