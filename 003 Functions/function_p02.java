import java.util.Scanner;

// Even or odd
public class function_p02 {
    static int num;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        check();
    }
    static void check(){
        if (num % 2 == 0) {
            System.out.println("Even number");
        }else {
            System.out.println("Odd number");
        }
    }
}