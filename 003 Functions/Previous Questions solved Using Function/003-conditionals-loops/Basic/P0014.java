import java.util.Scanner;

public class P0014 {
    
    static double VolumeOfConeJavaProgram(double h, double r) {
        return Math.PI * (r * r) * h/3;
    }
    public static void main(String[] args) {
        System.out.print("Enter Height: ");
        Scanner sc = new Scanner(System.in);
        double h = sc.nextDouble();
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        System.out.println("Volume Of Cone is " + VolumeOfConeJavaProgram(h, r));
    }
}
