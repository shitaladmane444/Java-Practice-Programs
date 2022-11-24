// Calculate average of N Numbers.
import java.util.Scanner;

public class inter_p3 {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of times User has to input NUMBERS: ");
        int a = sc.nextInt();
        int sum=0,count=0;

        while(count != a){
            System.out.print("Enter a number: ");
            int n = sc.nextInt();
            sum+=n;
            count++;
        }
        System.out.print("Average of "+a+" numbers entered by user is: "+ sum/a);
    }
}