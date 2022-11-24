// Calculate Average Marks
import java.util.Scanner;

public class inter_p12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n, sum=0, marks;

        System.out.print("Enter number of Subjects: ");
        n = sc.nextInt();

        for (int i = 0; i <= n; ++i) {
            System.out.println("Enter marks for subject "+(i+1));
            marks = sc.nextDouble();
            sum+=marks;
        }
        System.out.println("Average of Six subjects is : "+sum/n);
    }
}
