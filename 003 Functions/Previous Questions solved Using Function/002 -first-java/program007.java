package functions002;
import java.util.Scanner;
public class program007 {

    static void fibo(){
        int num, a=0, b=1, temp=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();
        System.out.print("Fibonacci Series until "+num+" terms: ");
        for (int i = 1; i <= num; i++) {
            System.out.print(a+", ");
            
            temp = a + b;
            a = b;
            b = temp;
        }
    }

    public static void main(String[] args) {
        fibo();
    }
}
