package functions001;

import java.util.Scanner;
// Input a year and find whether it is a leap year or not.
public class program001{
	static int year;
	public static void main(String[]args){
		
		Scanner in = new Scanner(System.in);
		System.out.print("Enter Year: ");
		year = in.nextInt();
		
		leapyear();
	}
	
	static void leapyear(){
		if(year%4==0){
			System.out.println("Leap Year");
		}
		else{
			System.out.println("Not a Leap Year");
		}
	}
}