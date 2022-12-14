import java.util.Scanner;

public class P003{
	
	static double AreaOfRectangle(double w, double l){
		return (w * l);
	}
	
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Width: ");
		double w = sc.nextDouble();
		System.out.print("Enter Height: ");
		double l = sc.nextDouble();
		
		System.out.println("Area of Rectangle is: " + AreaOfRectangle(w, l));
	}
}