package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число:");

        for (int i = 1; i <= 20; i++) {
            int x = scanner.nextInt();
            double sum= 1.0;
            sum += ((x + i) / i);
            System.out.println(sum);

            }

    }
}