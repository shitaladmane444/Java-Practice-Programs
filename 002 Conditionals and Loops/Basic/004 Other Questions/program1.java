// Curved Surface area of cylinder
import java.util.Scanner;

public class program1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("ENTER FIRST NUMBER: ");
        int num1 = in.nextInt();
        System.out.print("ENTER SECOND NUMBER: ");
        int num2 = in.nextInt();

        int prod = num1 * num2;
        int sum = num1 + num2;
        System.out.println("Product of "+num1+" and "+num2+" is: "+prod);
        System.out.println("Sum of "+num1+" and "+num2+" is: "+sum);
        System.out.print("Subtracted Value of PRODUCT and SUM is: " + (prod-sum));
    }
}
