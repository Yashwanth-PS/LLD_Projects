package model;

public class BallPen extends Pen implements Refillable {
    private Refill refill;

    public BallPen(long id, String name, String brand, double price, ClosingType closingType, Refill refill) {
        super(id, name, brand, price, PenType.BALL, closingType);
        this.refill = refill;
    }

    @Override
    public void write() {
        System.out.println("Writing with " + getBrand() + " " + getName() + " using " + refill.getInk().getColor() + " ink.");
    }

    @Override
    public void refill(Refill refill) {
        this.refill = refill;
        System.out.println("Refilling the " + getBrand() + " " + getName() + " Ball Pen with a new refill.");
    }
}
