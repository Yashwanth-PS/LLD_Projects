package service;

import model.Pen;

public interface PenService { // Service layer
    Pen openPenWithOptions();

    void writeWithPen();

    void closePen();

    boolean isPenClose();
}