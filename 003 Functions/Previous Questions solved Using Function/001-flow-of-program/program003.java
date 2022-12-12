package functions001;

import java.util.Scanner;
// Take a number as input and print the multiplication table for it.

public class program003 {
	static int num;
	public static void main(String[]args){
		
		multi();
	}
	static void multi(){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter number: ");
		num = sc.nextInt();
		
		for(int i=1; i<=10; i++){
			int temp = i * num;
			System.out.println(num+" X "+i+" = "+temp);
		}
	}
}