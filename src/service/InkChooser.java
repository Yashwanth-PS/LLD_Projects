package service;

import model.Ink;
import model.InkColor;
import model.InkFeatures;

class InkChooser {
    private InkColorChoiceService inkColorChoiceService;
    private InkFeaturesChoiceService inkFeaturesChoiceService;

    public InkChooser(InkColorChoiceService inkColorChoiceService, InkFeaturesChoiceService inkFeaturesChoiceService) {
        this.inkColorChoiceService = inkColorChoiceService;
        this.inkFeaturesChoiceService = inkFeaturesChoiceService;
    }

    public Ink chooseInk() {
        InkColor color = inkColorChoiceService.chooseInkColor();
        InkFeatures features = inkFeaturesChoiceService.chooseInkFeatures();
        return new Ink(color, features);
    }
}
