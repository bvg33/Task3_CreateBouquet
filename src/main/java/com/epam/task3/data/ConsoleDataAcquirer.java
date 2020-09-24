package com.epam.task3.data;

import java.util.Scanner;

public class ConsoleDataAcquirer implements DataAcquirer {

    public int getNumber() {
        int number = 0;
        try (Scanner scanner = new Scanner(System.in)) {
            do {
                System.out.println("Enter a Positive number of flowers in bouquet");
                while (!scanner.hasNextInt()) {
                    System.out.println("This is not a number!");
                    scanner.next();
                }
                number = scanner.nextInt();
            } while (number <= 0);
        }
        return number;
    }
}