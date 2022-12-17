import java.util.Scanner;

// Print Circumference and area of a circle of radius by user input.
public class function_p06 {
    static double radii;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter radius: ");
        radii = in.nextDouble();

        calc();
    }
    static void calc(){
        System.out.println("Circumference: "+ 2 * Math.PI * radii);
        System.out.println("Area: "+ Math.PI * Math.pow(radii, 2));
    }
}