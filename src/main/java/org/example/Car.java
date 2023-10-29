package org.example;

public class Car {
    private String name;
    private String brand;
    private String vin;
    private Type type;

    public Car(String name, String brand, String vin, Type type) {
        this.name = name;
        this.brand = brand;
        this.vin = vin;
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public String getVin() {
        return vin;
    }

    public Type getType() {
        return type;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", vin='" + vin + '\'' +
                ", type=" + type +
                '}';
    }
}
