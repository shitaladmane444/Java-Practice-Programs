// Total surface area of cube
import java.util.Scanner;

public class program2 {
    public static void main(String[] args) {
        int a;
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a number: ");
        a = in.nextInt();
        System.out.println("Total surface area of cube is: "+6*Math.pow(a, 2));
    }
}
