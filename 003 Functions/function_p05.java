<<<<<<< HEAD
import java.util.Scanner;

// Product of two numbers
public class function_p05 {
    static int a , b, product;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = in.nextInt();
        System.out.print("Enter a number: ");
        b = in.nextInt();

        prod();
    }

    static void prod(){
        product = a * b;
        System.out.println("Product: "+product);
    }
=======
import java.util.Scanner;

// Product of two numbers
public class function_p05 {
    static int a , b, product;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = in.nextInt();
        System.out.print("Enter a number: ");
        b = in.nextInt();

        prod();
    }

    static void prod(){
        product = a * b;
        System.out.println("Product: "+product);
    }
>>>>>>> b93e3a3e1d55f550b50eae113b1980b2faa60357
}