package org.example;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введи свой вариант ответа: камень, ножницы или бумага. Либо введите 'выход'");
        //                      0         1         2
        String[] choices = {"камень", "ножницы", "бумага"};
        Random random = new Random();
        int userWins = 0;
        int computerWins = 0;

        while (true) {
            int computerChoiceIdx = random.nextInt(choices.length);
            String computerChoice = choices[computerChoiceIdx];

            Scanner scanner = new Scanner(System.in);
            System.out.println("Твой вариант ответа:");
            String userChoice = scanner.nextLine().toLowerCase(Locale.ROOT).trim();

            if (userChoice.equals("выход")) {
                break;
            }

            if (computerChoice.equals(userChoice)) {
                System.out.println("Ничья!");
            } else if ((userChoice.equals("камень") && computerChoice.equals("ножницы")) ||
                    (userChoice.equals("бумага") && computerChoice.equals("камень")) ||
                    (userChoice.equals("ножницы") && computerChoice.equals("бумага"))) {
                userWins++;
                System.out.println("Ты победил! Твой счёт: " + userWins);
            } else {
                computerWins++;
                System.out.println("Компьютер победил! Счёт компьютера: " + computerWins);
            }
        }
        System.out.println("Всего хорошего!");
    }
}
