// Fractional Program in Java
import java.util.Scanner;

public class inter_p1 {

	static void fractional(int n) {
		int fact = 1;
		while(n!=1){
			fact = fact * n;
			n--;  
		}
		System.out.print(fact);
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		
		fractional(n);
	}
}