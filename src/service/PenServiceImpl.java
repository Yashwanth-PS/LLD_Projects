package service;

import model.*;
import model.constants.ClosingType;
import model.constants.NibThickness;
import model.constants.PenType;

import java.util.Scanner;

public class PenServiceImpl implements PenService{
    private Pen openedPen;

    @Override
    public Pen openPenWithOptions() {
        if (openedPen != null) {
            System.out.println("You have already opened a pen. Please close it before opening another.");
            return null;
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose a pen type:");
        for (int i = 0; i < PenType.values().length; i++) {
            System.out.println((i + 1) + ". " + PenType.values()[i]);
        }

        int penTypeChoice = scanner.nextInt();
        PenType chosenPenType = PenType.values()[penTypeChoice - 1];

        System.out.println("Choose a closing type:");
        for (int i = 0; i < ClosingType.values().length; i++) {
            System.out.println((i + 1) + ". " + ClosingType.values()[i]);
        }

        int closingTypeChoice = scanner.nextInt();
        ClosingType chosenClosingType = ClosingType.values()[closingTypeChoice - 1];

        // Create an ink object based on user choices
        InkChooserServiceImpl inkChooser = new InkChooserServiceImpl(new InkColorChoiceServiceImpl(), new InkFeaturesChoiceServiceImpl());
        Ink userInk = inkChooser.chooseInk();

        // Get user's choice for nib thickness
        NibThickness chosenThickness = null;
        while (true) {
            System.out.print("Choose a nib thickness option (1: Thin, 2: Medium, 3: Thick): ");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    chosenThickness = NibThickness.THIN;
                    break;
                case 2:
                    chosenThickness = NibThickness.MEDIUM;
                    break;
                case 3:
                    chosenThickness = NibThickness.THICK;
                    break;
                default:
                    System.out.println("Invalid choice. Please choose 1, 2, or 3.");
                    continue; // Repeat the loop if the choice is invalid
            }
            break; // Exit the loop if a valid choice is made
        }

        // Use the chosenThickness enum value as needed
        Nib userNib = new Nib(chosenThickness); // pass it to the Nib constructor or perform other actions

        Pen pen = null;

        switch (chosenPenType) {
            case BALL:
                pen = new BallPen(1, "Ball Pen", "BIC", 1.99, chosenClosingType, new Refill(1.5, 5.0, userInk, userNib));
                break;
            case GEL:
                pen = new GelPen(2, "Gel Pen", "Pilot", 2.99, chosenClosingType, new Refill(1.5, 5.0, userInk, userNib));
                break;
            case FOUNTAIN:
                pen = new FountainPen(3, "Fountain Pen", "Waterman", 19.99, chosenClosingType, userInk, userNib);
                break;
            case USE_AND_THROW:
                pen = new UseAndThrowPen(4, "Use and Throw Pen", "Generic", 0.99, chosenClosingType, userInk, userNib);
                break;
            default:
                System.out.println("Invalid pen type choice.");
        }

        if (pen != null) {
            openedPen = pen;
            openedPen.open();
        }

        return openedPen;
    }

    @Override
    public void writeWithPen() {
        if (openedPen == null) {
            System.out.println("You must open a pen before writing.");
        } else {
            openedPen.write();
        }
    }

    @Override
    public void closePen() {
        if (openedPen == null) {
            System.out.println("You cannot close a pen without opening one.");
        } else {
            openedPen.close();
            openedPen = null;
        }
    }

    @Override
    public boolean isPenClose() {
        return openedPen == null;
    }
}
