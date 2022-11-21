package com.basic.area_01;

import java.util.Scanner;

public class area_of_rhombus {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Length of First Diagonal: ");
        float d1 = in.nextFloat();
        System.out.print("Length of Second Diagonal: ");
        float d2 = in.nextFloat();

        System.out.println("Area of Rhombus is: "+d1*d2/2);
    }
}
