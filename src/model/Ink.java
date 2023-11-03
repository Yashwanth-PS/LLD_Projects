package model;

public class Ink { // Model: Data classes
    private InkColor color;
    private InkFeatures features;

    public Ink(InkColor color, InkFeatures features) {
        this.color = color;
        this.features = features;
    }

    public InkColor getColor() {
        return color;
    }

    public InkFeatures getFeatures() {
        return features;
    }

}
