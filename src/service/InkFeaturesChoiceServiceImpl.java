package service;

import model.InkFeatures;

import java.util.Scanner;

class InkFeaturesChoiceServiceImpl implements InkFeaturesChoiceService {
    @Override
    public InkFeatures chooseInkFeatures() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Choose ink features:");
        for (int i = 0; i < InkFeatures.values().length; i++) {
            System.out.println((i + 1) + ". " + InkFeatures.values()[i]);
        }

        int inkFeaturesChoice = scanner.nextInt();
        return InkFeatures.values()[inkFeaturesChoice - 1];
    }
}
