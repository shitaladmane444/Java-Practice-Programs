import java.util.Scanner;

public class inter_p13 {
    public static void main(String[] args) {
        int n, a, sum=0;
        Scanner in = new Scanner(System.in);
        System.out.print("Run loop for: ");
        a = in.nextInt();

        for (int i = 0; i != a; i++) {
            System.out.println("Enter a number: ");
            n = in.nextInt();
            sum+=n;
        }
        System.out.println("Sum of "+a+" numbers is: "+sum);
    }
}
