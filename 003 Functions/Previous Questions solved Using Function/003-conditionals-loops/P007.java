import java.util.Scanner;

public class P007 {
    
    static double AreaOfEquilateralTriangle(double s){
        return (Math.sqrt(3) * s * s)/4;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Side: ");
        double s = in.nextDouble();
        
        System.out.println("Area of Equilateral Triangle is: " + AreaOfEquilateralTriangle(s));
    }
}
