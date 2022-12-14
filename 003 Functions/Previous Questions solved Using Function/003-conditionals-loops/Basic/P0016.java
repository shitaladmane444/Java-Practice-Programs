import java.util.Scanner;

public class P0016 {
    
    static double VolumeOfCylinder(double r, double h){
        return (Math.PI * (r * r * h));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Height: ");
        double h = sc.nextDouble();
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();

        System.out.println("Volume Of Cylinder is: " + VolumeOfCylinder(r, h));
    }
}
