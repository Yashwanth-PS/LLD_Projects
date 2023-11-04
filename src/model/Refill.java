package model;

public class Refill {
    private double price;
    private double length;
    private Ink ink;
    private Nib nib;

    public Refill(double price, double length, Ink ink, Nib nib) {
        this.price = price;
        this.length = length;
        this.ink = ink;
        this.nib = nib;
    }

    public double getPrice() {
        return price;
    }

    public double getLength() {
        return length;
    }

    public Ink getInk() {
        return ink;
    }

    public Nib getNib() {
        return nib;
    }
}
