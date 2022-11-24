// Calculate Depreciation  of Value
import java.util.Scanner;

public class inter_p8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int p, t, d;

        System.out.print("Enter Time: ");
        t= sc.nextInt(); // Time in years
        System.out.print("Enter Depreciation rate: ");
        d = sc.nextInt(); // Depreciation rate
        System.out.print("Enter Present value: ");
        p = sc.nextInt(); // Present value

        System.out.println("Final Value is: "+p*Math.pow((1+0.01*t),d));
    }
}
