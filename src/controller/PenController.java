package controller;

import service.PenService;

public class PenController {
    private PenService penService;

    public PenController(PenService penService) {
        this.penService = penService;
    }
}
