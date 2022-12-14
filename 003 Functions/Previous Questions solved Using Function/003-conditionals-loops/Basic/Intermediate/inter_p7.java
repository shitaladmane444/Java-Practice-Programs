// Power in Java
import java.util.Scanner;

public class inter_p7 {

    static void Power(int n, int p){
        int prod=1, count=0;

        while (count!=p){
            prod *= n;
            count++;
        }
        System.out.println("Power is: "+prod);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = sc.nextInt();
        System.out.print("Enter p: ");
        int p = sc.nextInt();

        Power(n, p);
    }
}
