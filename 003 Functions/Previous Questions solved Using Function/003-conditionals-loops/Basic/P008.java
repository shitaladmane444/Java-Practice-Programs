import java.util.Scanner;

public class P008 {

    static double PerimeterOfCircle(double r){
        return (2 * Math.PI * r);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = in.nextDouble();

        System.out.println("Perimeter of Circle: " + PerimeterOfCircle(r));
    }
}
