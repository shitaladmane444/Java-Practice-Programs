package functions001;

import java.util.Scanner;

// Take two numbers and print the sum of both.
public class program002{
	
	static int a, b;
	
	public static void main(String[]args){		
		sum();
	}
	
	static void sum(){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<2; i++){
			System.out.print("Enter a number: ");
			a = sc.nextInt();
			b = a;
		}
		System.out.print("Sum: "+(a+b));
	}
	
}