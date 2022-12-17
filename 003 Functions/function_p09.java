import java.util.Scanner;

public class function_p09 {

    static int Factorial(int n){
        if (n == 0)
         return 1;
        else
         return(n * Factorial(n-1));   
        } 

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = in.nextInt();
        
        System.out.println("Factorial of "+n+" is: "+Factorial(n));
    }
}

