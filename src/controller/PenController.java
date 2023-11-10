package controller;

import service.PenService;

import java.util.Scanner;

public class PenController {
    private PenService penService;

    public PenController(PenService penService) {
        this.penService = penService;
    }

    public void handleUserActions() {
        Scanner scanner = new Scanner(System.in);
        boolean continueWriting = true;

        while (continueWriting) {
            System.out.println("Choose an action:");
            System.out.println("1. Open a pen");
            System.out.println("2. Write");
            System.out.println("3. Close the opened pen");
            System.out.println("4. Exit");

            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1:
                    penService.openPenWithOptions();
                    break;
                case 2:
                    penService.writeWithPen();
                    break;
                case 3:
                    penService.closePen();
                    break;
                case 4:
                    if (!penService.isPenClose()) {
                        System.out.println("Please close the pen before exiting.");
                    } else {
                        continueWriting = false; // Exit the loop if the pen is closed
                        break;
                    }
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
            }
        }
    }
}
