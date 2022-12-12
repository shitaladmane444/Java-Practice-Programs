package functions002;

import java.util.Scanner;



public class program003 {

    static void simpleInterest(){
        int P, T, R;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle amount: ");
        P = sc.nextInt();
        System.out.print("Enter Time: ");
        T = sc.nextInt();
        System.out.print("Enter Rate of Interest: ");
        R = sc.nextInt();

        System.out.println("Simple Interest: "+(P+T+R/100));
    }

    public static void main(String[] args) {
        simpleInterest();
    }
}
