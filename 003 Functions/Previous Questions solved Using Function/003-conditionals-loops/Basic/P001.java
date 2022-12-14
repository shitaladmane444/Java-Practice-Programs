import java.util.Scanner;

public class P001 {
    static double AreaOfCircle(double r){
        return (Math.PI * r * r);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        System.out.println("Area of Circle is: " + AreaOfCircle(r));
    }
    
}
