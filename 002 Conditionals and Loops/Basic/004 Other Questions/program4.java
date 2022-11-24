import java.util.Scanner;

/**
 * Subtract the product and sum of digits of an integer
 */
public class program4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, product, sum;
        System.out.print("Enter first Number: ");
        a = sc.nextInt();
        System.out.print("Enter second Number: ");
        b = sc.nextInt();
        product = a * b;
        sum = a + b;
        System.out.println("Subtracted value of Product and sum is: "+(product-sum));
    }
}
