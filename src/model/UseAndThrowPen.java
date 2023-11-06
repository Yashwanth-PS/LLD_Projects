package model;

public class UseAndThrowPen extends Pen {
    private Ink ink;
    private Nib nib;
    public UseAndThrowPen(long id, String name, String brand, double price, ClosingType closingType, Ink ink, Nib nib) {
        super(id, name, brand, price, PenType.USE_AND_THROW, closingType);
        this.ink = ink;
        this.nib = nib;
    }

    @Override
    public void write() {
        System.out.println("Writing with " + getBrand() + " " + getName() + " Use and Throw Pen.");
    }
}
