import java.util.Scanner;

// Sum of two user input numbers
public class function_p04 {
    static int num1, num2;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        num1 = sc.nextInt();
        System.out.print("Enter second number: ");
        num2 = sc.nextInt();

        add();
    }

    static void add(){
        int sum = num1 + num2;
        System.out.println("Sum:"+sum);
    }
}