import java.util.Scanner;

public class P0025 {
    
    static void largestNumber(int num) {
        int max=0;
        Scanner sc = new Scanner(System.in);
        while (num != 0) {
            System.out.println("Enter number: ");
            num = sc.nextInt();
            System.out.println("Enter 0 to exit loop");
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Highest Number is: " + max);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        largestNumber(num);
    }
}
