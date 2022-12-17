import java.util.Scanner;
/*Sum of n numbers */
public class inter_p13 {
    static void SumOfNumbers(){
        int num, n, sum=0;
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers you want to input: ");
        n = in.nextInt();
        System.out.println("Enter "+n+" number: ");
        for (int i = 1; i <= n; i++) {
            num = in.nextInt();
            sum+=num;
        }
        System.out.println("Sum of "+n+" numbers is: "+sum);
    }
    public static void main(String[] args) {
        SumOfNumbers();
    }
}
