package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
//        for (int i = 0; i < 3; i++) {
//            for (int j = 0; j < 5; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//
//        for (int i = 1; i <= 5; i++) {
//            for (int j = 1; j < i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }
//
//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j <= i; j++) {
//                System.out.print("* ");
//            }
//            System.out.println("");
//        }

        Scanner inputNumber = new Scanner(System.in);
        System.out.println("Nhap mot so nguyen bat ky");
        int numbers = inputNumber.nextInt();
        int count = 0;
        int N = 2;

        while (count < numbers) {
            int uoc = 0;
            for (int i = 1; i <= N; i++) {
                if (N % i == 0) uoc++;
            }
            if (uoc == 2) {
                System.out.println(N);
                N++;
                count++;
            } else N++;
        }
    }
}