package com.Algorithm.Other;

import java.util.Scanner;

public class SimpleGreedyAlgo {
    public void run() {
        Scanner reader = new Scanner(System.in);  // Reading from System.in
        System.out.println("Enter a whole number from 1 to 99: ");
        while (reader.hasNextInt()) {
            int n = reader.nextInt();
            if (n > 0 && n < 100) {
                int val = n;
                int quarters = 0, dimes = 0, nickels = 0, pennies = 0;

                while (val > 24) {
                    val = val - 25;
                    quarters++;
                }

                while (val > 9) {
                    val = val - 10;
                    dimes++;
                }

                while (val > 4) {
                    val = val - 5;
                    nickels++;
                }

                while (val > 0) {
                    val = val - 1;
                    pennies++;
                }
                System.out.println("You have:");
                System.out.println(quarters + " quarters");
                System.out.println(dimes + " dimes");
                System.out.println(nickels + " nickels");
                System.out.println(pennies + " pennies");
            } else System.out.println("This number is out of bounds ");

            System.out.println("Enter a whole number from 1 to 99: ");
        }
        System.out.println("Invalid input, ending program");
        reader.close();
    }
}
