package service;

import model.Ink;
import model.constants.InkColor;
import model.constants.InkFeatures;

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
