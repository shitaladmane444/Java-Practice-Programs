package functions002;

import java.util.Scanner;

public class program005 {
    
    static void largest(){
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt(); 
        if (num1 > num2) {
            System.out.println("Largest Number is "+ num1);
        } else {
            System.out.println("Largest Number is "+ num2);
        }
    }
    
    public static void main(String[] args) {
        largest();
    }
}
