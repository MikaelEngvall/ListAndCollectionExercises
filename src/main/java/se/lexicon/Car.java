package se.lexicon;

public class Car {
    private int id;
    private String brand;
    private String model;

    public Car(int id, String brand, String model) {
        this.id = id;
        this.brand = brand;
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    // Other getters and setters
}