package com.session_06.Other_questions;

import java.util.Scanner;

public class p7 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num,a=0;

        System.out.println("Enter a number: ");
        num = in.nextInt();

        while(num!=0){
            System.out.println("Enter a number: ");
            num = in.nextInt();
            System.out.println("Enter 0 to exit loop");
            if (num>a) {
                a = num;
            }
        } 
        System.out.println("The largest number entered by the user is: "+a);
    }
}
