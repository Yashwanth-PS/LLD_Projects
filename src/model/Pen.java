package model;

import model.constants.ClosingType;
import model.constants.PenType;

public abstract class Pen { // Model: Pen classes
    private long id;
    private String name;
    private String brand;
    private double price;
    private PenType type;
    private ClosingType closingType;

    public Pen(long id, String name, String brand, double price, PenType type, ClosingType closingType) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.closingType = closingType;
    }

    public abstract void write();

    public void open() {
        System.out.println("Opening the " + brand + " " + name + ".");
    }

    public void close() {
        System.out.println("Closing the " + brand + " " + name + ".");
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getBrand() {
        return brand;
    }

    public double getPrice() {
        return price;
    }

    public PenType getType() {
        return type;
    }

    public ClosingType getClosingType() {
        return closingType;
    }
}
