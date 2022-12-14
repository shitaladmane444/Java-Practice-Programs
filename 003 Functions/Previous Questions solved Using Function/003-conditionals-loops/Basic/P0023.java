import java.util.Scanner;
public class P0023 {

    static void factorsOfaNumber(int num) {
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        int num = sc.nextInt();

        factorsOfaNumber(num);
    }
}
