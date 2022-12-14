import java.util.Scanner;

public class P0017 {
    static double VolumeOfSphere(double r) {
        double n = 1.33; // Value of 4/3
        return (n * Math.PI * (r * r *r));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter radius: ");
        double r = sc.nextDouble();

        System.out.println("Volume Of Sphere is: " + VolumeOfSphere(r));
    }
}
