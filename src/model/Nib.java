package model;

import model.constants.NibThickness;

public class Nib {
    private NibThickness thickness;
    public Nib(NibThickness thickness) {
        this.thickness = thickness;
    }
    public NibThickness getThickness() {
        return thickness;
    }
}
