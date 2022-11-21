package com.basic.area_01;

public class area_of_equilateral_triangle {
    public static void main(String[] args) {
        double root = Math.sqrt(3)/4;
        int a = 13;
        double exact_area = root * (a * a);

        int area = (int)exact_area; // Type casting
        System.out.println("Exact Area of Equilateral Triangle is: "+exact_area);
        System.out.println("Area of Equilateral Triangle in whole figure is: "+area);
    }
}
