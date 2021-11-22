package com.company;

import java.util.Scanner;

public class lab2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        while (!sc.hasNext("int")) {
            if (sc.hasNextInt()) {
                int a = sc.nextInt();
                int n = sc.nextInt();
                int answer = 1;
                for (int i = 1; i <= n; i++) {
                    answer *= a;
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