import java.util.Scanner;

public class P0021 {

    static void fibo(int num) {
        int a=0, b=1, i=0;

        while (i < num) {
            System.out.print(a + " ");
            int temp = b + a;
            a = b;
            b = temp;
            i = i + 1;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();

        fibo(num);
    }
}