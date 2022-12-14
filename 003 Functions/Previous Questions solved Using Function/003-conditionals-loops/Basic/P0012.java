import java.util.Scanner;

public class P0012 {
    
    static double PerimeterOfSquare(double a){
        return (4 * a);
    }
    public static void main(String[] args) {
        System.out.print("Enter Side: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.println("Perimeter Of Square is " + PerimeterOfSquare(a));
    }
}
