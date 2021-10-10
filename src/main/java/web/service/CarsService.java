package web.service;

import org.springframework.stereotype.Component;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarsService {
    private List<Car> cars;

    {
        cars = new ArrayList<>();

        cars.add(new Car(1L, "Audi A8", 2009));
        cars.add(new Car(2L, "BMV X7", 2014));
        cars.add(new Car(3L, "Ford Model T", 1908));
        cars.add(new Car(4L, "ГАЗ 21 Волга", 1960));
        cars.add(new Car(5L, "Ё-Кроссовер", 2013));
    }

    public List<Car> listCars(Integer count) {
        return count == null ? cars : cars.stream().limit(count).collect(Collectors.toList());
    }
}
