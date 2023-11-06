package model;

public class FountainPen extends Pen {
    private Ink ink;
    private Nib nib;

    public FountainPen(long id, String name, String brand, double price, ClosingType closingType, Ink ink, Nib nib) {
        super(id, name, brand, price, PenType.FOUNTAIN, closingType);
        this.ink = ink;
        this.nib = nib;
    }

    @Override
    public void write() {
        System.out.println("Writing with " + getBrand() + " " + getName() + " Fountain Pen using " + ink.getColor() + " ink and " + nib.getThickness() + " nib.");
    }
}
