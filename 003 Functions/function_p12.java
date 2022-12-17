import java.util.Scanner;

public class function_p12 {
    
    static void PythagoreanTripletORnot(double a, double b, double c){
        if (Math.pow(a, 2) + Math.pow(b, 2) ==  Math.pow(c, 2)){
            System.out.println("Pythagorean Triplet");

        }else {
            System.out.println("Not a Pythagorean Triplet");
        }
     }   

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = in.nextDouble();
        System.out.print("Enter second number: ");
        double b = in.nextDouble();
        System.out.print("Enter third number: ");
        double c = in.nextDouble();
        
        PythagoreanTripletORnot(a, b, c);
    }
}
