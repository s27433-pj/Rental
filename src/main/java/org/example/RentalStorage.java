package org.example;

import java.util.ArrayList;
import java.util.List;

public class RentalStorage {
    List<Rental> rentalList = new ArrayList<>();

    private static RentalStorage instance;

    private  void RentalStorage(){
    }

    public void addRental(Rental rental){
        rentalList.add(rental);
    }
    public List<Rental> getAllRental(){
        return rentalList;
    }
    public static RentalStorage getInstance() {
        if (instance == null) {
            instance = new RentalStorage();
        }
        return instance;
    }
}
