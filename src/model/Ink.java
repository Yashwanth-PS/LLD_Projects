package model;

public class Ink { // Model: Data classes
    private InkColor color;
    private InkFeatures features;
    public Ink(InkColor color, InkFeatures features) {
        this.color = color;
        this.features = features;
    }
}