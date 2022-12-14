import java.util.Scanner;
public class P0026 {
    
    static void add(int a, int b) {
        System.out.println(a + b); 

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter Second Number: ");
        int b = sc.nextInt();

        add(a, b);
    }
}
