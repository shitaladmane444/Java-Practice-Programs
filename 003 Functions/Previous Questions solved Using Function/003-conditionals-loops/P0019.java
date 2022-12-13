import java.util.Scanner;

public class P0019 {
    
    static double CurvedSurfaceAreaOfCylinder(double r, double h) {
        return (2 * Math.PI * r * h);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();
        System.out.print("Enter Height: ");
        double h = sc.nextDouble();

        System.out.println("Curved Surface Area of Cylinder is: " + CurvedSurfaceAreaOfCylinder(r, h));
    }
}
