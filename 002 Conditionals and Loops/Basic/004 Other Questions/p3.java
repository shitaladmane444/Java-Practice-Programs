// Take integer input till the user enters 0 and print the sum of all numbers (while loop)
import java.util.Scanner;

public class p3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.print("Enter a Number: ");
            num = sc.nextInt();
            sum += num;
        } while(num > 0);

        System.out.println("Sum is " + sum);
    }
}
