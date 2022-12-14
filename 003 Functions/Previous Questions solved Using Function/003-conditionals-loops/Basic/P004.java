import java.util.Scanner;

public class P004 {
	
	static double AreaOfIsoscelesTriangle(double b, double h) {
		return (b * h)/2;
	}
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Base: ");
		double b = sc.nextDouble();
		System.out.print("Enter Height: ");
		double h = sc.nextDouble();
		
		System.out.println("Area of Isosceles Triangle: " + AreaOfIsoscelesTriangle(b, h));
	}
}