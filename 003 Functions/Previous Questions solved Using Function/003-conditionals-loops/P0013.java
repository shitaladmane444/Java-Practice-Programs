import java.util.Scanner;

public class P0013 {
    static double PerimeterOfRhombus(double a) {
        return (4 * a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Sides: ");
        double a = sc.nextDouble();

        System.out.println("Perimeter Of Rhombus is " + PerimeterOfRhombus(a));
    }
}
