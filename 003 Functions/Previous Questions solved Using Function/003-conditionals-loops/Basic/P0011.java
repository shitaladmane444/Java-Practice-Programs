import java.util.Scanner;

public class P0011 {
    static double PerimeterOfRectangle(double l, double w){
        return (2*(l * w));
    }

    public static void main(String[] args) {
        System.out.print("Enter Length: ");
        Scanner sc = new Scanner(System.in);
        double l = sc.nextDouble();
        System.out.print("Enter Width: ");
        double w = sc.nextDouble();

        System.out.println("Perimeter of Rectangle is " + PerimeterOfRectangle(l, w));
    }
}
