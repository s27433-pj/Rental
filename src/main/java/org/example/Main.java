package org.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        //Format date
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");

        //car storage, add cars
        CarStorage.getInstance().addCar(new Car("Random-car-name", "Random-car-brand","1", Type.STANDARD));
        CarStorage.getInstance().addCar(new Car("Random-car-name1", "Random-car-brand1","2", Type.ECONOMY));
        CarStorage.getInstance().addCar(new Car("Random-car-name2","Random-car-brand2", "3", Type.PREMIUM));

        //create user
        User user1 = new User(1);

        //Rental date
        Date dateFrom = date.parse("2023-11-13");
        Date dateTo = date.parse("2023-12-29");

        Date dateFrom1 = date.parse("2023-10-13");
        Date dateTo1 = date.parse("2023-12-29");

        Date dateFrom2 = date.parse("2023-12-30");
        Date dateTo2 = date.parse("2024-12-29");

        //Services
        RentalService rentalService = new RentalService();
        rentalService.rent(user1, "1", dateFrom , dateTo);
        rentalService.isAvailable("1", dateFrom1,dateTo1);
        rentalService.rent(user1, "1", dateFrom1, dateTo1);
        rentalService.estimataePrice("1", dateFrom, dateTo);
    }
}