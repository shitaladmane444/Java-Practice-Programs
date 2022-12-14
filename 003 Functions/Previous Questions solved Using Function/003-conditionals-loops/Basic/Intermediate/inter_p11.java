// Calculate Compound Interest
import java.util.Scanner;

public class inter_p11 {

    static void CompoundInterest() {
        double p, r, time, amt=0, ci, t=1;

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Principle: ");
        p = sc.nextDouble();
        System.out.print("Enter Rate of Interest: ");
        r = sc.nextDouble();
        System.out.print("Enter time: ");
        time = sc.nextDouble();
        r = (1+r/100);
        
        for(int i=0; i<time; i++) t*=r;

        amt = p * t;
        System.out.println("Amount: "+amt);
        ci = amt - p;
        System.out.print("Compound Interest is: "+ci);
    }
    public static void main(String[] args) {
        CompoundInterest();
    }
}
