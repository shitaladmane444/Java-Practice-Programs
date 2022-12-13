import java.util.Scanner;

public class P002{
	static double AreaOfTriangle(double h, double b){
		return (h * b)/2;
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter base: ");
		double b = sc.nextDouble();
		System.out.print("Enter height: ");
		double h = sc.nextDouble();
		
		System.out.println("Area of Triangle: " + AreaOfTriangle(h, b));
		
	}
}