import java.util.Scanner;

public class P005 {
    
    static double AreaOfParallelogram(double b, double h){
        return (b * h)/2;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter base and height: ");
        double b = sc.nextDouble();
        double h = sc.nextDouble();

        System.out.println("Area of Parallelogram: " + AreaOfParallelogram(b, h));
        
    }
    
}
