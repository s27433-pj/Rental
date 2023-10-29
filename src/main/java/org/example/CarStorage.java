package org.example;

import java.util.ArrayList;
import java.util.List;

public class CarStorage {
    List<Car> carList = new ArrayList<>();

    private static CarStorage instance;

    public CarStorage() {

    }

    public void addCar(Car car) {
        carList.add(car);
    }

    public List<Car> getAllCars() {
        return carList;
    }
    public static CarStorage getInstance() {
        if (instance == null) {
            instance = new CarStorage();
        }
        return instance;
    }


}
