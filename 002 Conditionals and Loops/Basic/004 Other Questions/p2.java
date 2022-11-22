package com.session_06.Other_questions;

import java.util.Scanner;

public class p2 {
    public static void main(String[] args) {
//        Input a number and print all the factors of that number (loop)
        Scanner sc = new Scanner(System.in);
        System.out.print("ENTER A NUMBER: ");
        int num = sc.nextInt();

        System.out.print("Factor of "+num+" are: ");
        for (int n=1; n<=num; ++n){
            if  (num % n == 0) {
                System.out.print(n + " ");
            }
        }
    }
}
