import java.util.Scanner;
// Area of Rhombus
public class P006 {
    static double AreaOfRhombus(double d1, double d2){
        return (d1 * d2)/2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Diagonal: ");
        double d1 = sc.nextDouble();
        System.out.print("Enter Second Diagonal: ");
        double d2 = sc.nextDouble();

        System.out.println("Area of Rhombus is: " + AreaOfRhombus(d1, d2));
    }
}
