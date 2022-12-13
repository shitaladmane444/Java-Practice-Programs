package functions002;
import java.util.Scanner;
public class program006 {

    static void convert(){
        double ex_rate=0.012;
        System.out.print("Enter amount: ");
        Scanner in = new Scanner(System.in);
        double amt = in.nextDouble();

        System.out.println("USD: "+(amt*ex_rate));
    }

    public static void main(String[] args) {
        convert();
    }
}
