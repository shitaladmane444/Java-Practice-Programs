// Calculate average of N Numbers.
import java.util.Scanner;

public class inter_p3 {

    static void average(int a){
        int sum=0,count=0;
        Scanner in = new Scanner(System.in);
        while(count != a){
            System.out.print("Enter a number: ");
            int n =in.nextInt();
            sum+=n;
            count++;
        }
        System.out.print("Average of "+a+" numbers entered by user is: "+ sum/a);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times User has to input NUMBERS: ");
        int a = sc.nextInt();
        
        average(a);
    }
}