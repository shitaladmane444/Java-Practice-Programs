package com.basic.perimeter_02;

import java.util.Scanner;

public class perimeter_of_square {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("ENTER one side of square: ");
        int a = in.nextInt();
        System.out.print("Perimeter of Square is: "+4*a);
    }
}
