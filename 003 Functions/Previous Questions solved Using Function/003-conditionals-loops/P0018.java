import java.util.Scanner;

public class P0018 {
    
    static double VolumeOfPyramid(double l, double w, double h){
        return (l * w * h) / 3;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Length: ");
        double l = sc.nextDouble();
        System.out.print("Enter width: ");
        double w = sc.nextDouble();
        System.out.print("Enter heightL ");
        double h = sc.nextDouble();

        System.out.println("Volume of Pyramid: " + VolumeOfPyramid(l, w, h));
    }
}
