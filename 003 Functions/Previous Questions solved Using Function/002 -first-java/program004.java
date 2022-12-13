package functions002;

import java.util.Scanner;

public class program004 {
    static int num1, num2;
    
    static void calculate(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        num1 = sc.nextInt();
        num2 = sc.nextInt();

        System.out.println("Multiplication: "+(num1 * num2));
        System.out.println("Addition: "+(num1 + num2));
        System.out.println("Subtraction: "+(num1 - num2));
        System.out.println("Division: "+(num1 / num2));
        System.out.println("Modulo: "+(num1 % num2));
    }
    
    public static void main(String[] args) {
        calculate();        
    }
}
