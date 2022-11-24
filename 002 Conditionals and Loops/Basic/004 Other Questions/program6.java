/**
 * Take integer input till the user enters 0
 * and print the sum of all numbers (while loop)
 */

import java.util.Scanner;

public class program6 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num, sum=0;
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        while(num != 0){
            System.out.print("Enter a number: ");
            num = sc.nextInt();
            sum += num;
        }
        System.out.println("Sum of all entered numbers is: "+sum);
    }
}
