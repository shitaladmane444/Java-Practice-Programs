package com.basic.perimeter_02;

import java.util.Scanner;

public class perimeter_of_rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter one side of RHOMBUS: ");
        int a = in.nextInt();

        System.out.println("Perimeter of RHOMBUS is: "+4*a);
    }
}
