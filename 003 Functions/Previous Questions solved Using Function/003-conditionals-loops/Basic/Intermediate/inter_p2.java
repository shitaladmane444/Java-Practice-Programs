// Calculate Electricity Bill
import java.util.Scanner;

public class inter_p2 {
	static void ElectricityBill(int unit) {
		float per_unit = 6.91f;
		System.out.println("Bill Amount: " + per_unit * unit);
	}

	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the number of Units: ");
		int unit = in.nextInt();
		
		ElectricityBill(unit);
	}
}