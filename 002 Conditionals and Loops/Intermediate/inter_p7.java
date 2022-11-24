// Power in Java
import java.util.Scanner;

public class inter_p7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int prod=1, count=0;
        int n = sc.nextInt();
        int p = sc.nextInt();

        while (count!=p){
            prod *= n;
            count++;
        }
        System.out.println("Power is: "+prod);
    }
}
