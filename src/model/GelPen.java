package model;

public class GelPen extends Pen implements Refillable {
    private Refill refill;

    public GelPen(long id, String name, String brand, double price, ClosingType closingType, Refill refill) {
        super(id, name, brand, price, PenType.GEL, closingType);
        this.refill = refill;
    }

    @Override
    public void write() {
        System.out.println("Writing with " + getBrand() + " " + getName() + " using " + refill.getInk().getColor() + " ink.");
    }

    @Override
    public void refill(Refill refill) {
        this.refill = refill;
        System.out.println("Changing the refill of the  " + getBrand() + " " + getName() + " Gel Pen with a new refill.");
    }
}
