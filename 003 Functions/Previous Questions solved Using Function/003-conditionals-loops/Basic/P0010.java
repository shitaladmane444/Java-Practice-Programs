import java.util.Scanner;

public class P0010 {
    static double PerimeterOfParallelogram(double a, double b){
        return (2*(a + b));
    }
    public static void main(String[] args) {
        System.out.print("Enter Base: ");
        Scanner sc = new Scanner(System.in);
        double b = sc.nextDouble();
        System.out.print("Enter Side: ");
        double a = sc.nextDouble();
        
        System.out.println("Perimeter Of Parallelogram is " + PerimeterOfParallelogram(a, b));
    }
}
