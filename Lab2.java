package com.company;

import java.util.Scanner;

public class Lab2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a numbers: ");
        while (!sc.hasNext("int")) {
            if (sc.hasNextInt()) {
                int a = sc.nextInt();
                int n = sc.nextInt();
                int answer = 1;
                int counter = 1;
                while (counter <= n) {
                    answer *= a;
                    counter++;
                }
                System.out.println(answer);
                break;
            } else {
                System.out.println("Error type!");
                sc.next();
            }
        }
        sc.close();
    }
}
