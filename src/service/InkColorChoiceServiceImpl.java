package service;

import model.constants.InkColor;

import java.util.Scanner;

class InkColorChoiceServiceImpl implements InkColorChoiceService {
    @Override
    public InkColor chooseInkColor() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose an ink color:");
        for (int i = 0; i < InkColor.values().length; i++) {
            System.out.println((i + 1) + ". " + InkColor.values()[i]);
        }

        int inkColorChoice = scanner.nextInt();
        return InkColor.values()[inkColorChoice - 1];
    }
}
