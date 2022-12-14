import java.util.Scanner;

public class P0022 {
    
    static void ProdSum(int n1) {
        int product = n1 * n1;
        int sum = n1 + n1;
        int subtract = product - sum;
        System.out.println(subtract);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n1 = sc.nextInt();

        ProdSum(n1);
    }
}
