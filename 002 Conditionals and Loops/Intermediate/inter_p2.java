// Calculate Electricity Bill
import java.util.Scanner;

public class inter_p2 {
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		float per_unit = 6.91f;
		
		System.out.print("Enter the number of Units: ");
		int unit = in.nextInt();
		
		System.out.println(per_unit*unit+" is the price for "+unit+" unit"); 
	}
}