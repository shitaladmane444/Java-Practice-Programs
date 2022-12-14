import java.util.Scanner;

public class P0020 {
    static double TotalSurfaceAreaOfCube(double a){
        return 6 * (a * a);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = sc.nextDouble();

        System.out.print("Total Surface Area Of Cube is: " + TotalSurfaceAreaOfCube(a));
    }
}
