import java.util.Scanner;

public class P009 {
    
    static double PerimeterOfEquilateralTriangle(double a){
        return(3 * a);
    }
    public static void main(String[] args) {
        System.out.print("Enter side: ");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();

        System.out.println("Perimeter Of Equilateral Triangle is " + PerimeterOfEquilateralTriangle(a));
    }
}
