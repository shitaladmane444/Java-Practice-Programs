import java.util.Scanner;

public class P0015 {
    
    static double VolumeOfPrism(double h, double b, double a){
        return (a * b * h) / 2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height: ");
        double h = sc.nextDouble();
        System.out.println("Enter Apothem Length: ");
        double a = sc.nextDouble();
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        System.out.println("Volume of Prism is " + VolumeOfPrism(h, r, a));
    }
}
