package com.session_06.Other_questions;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = 0;
        int b = 1;
        System.out.print("ENTER A NUMBER: ");
        int z = sc.nextInt();
        int count = 2;

        System.out.print("Fibonacci Series:");
        while (count <= z) {
            int temp = b;
            b = b + a;
            a = temp;
            count++;
            System.out.print(" "+b+" ");
        }

    }
}
