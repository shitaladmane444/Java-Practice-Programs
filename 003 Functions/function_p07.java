<<<<<<< HEAD
import java.util.Scanner;
// Prime or not
public class function_p07 {
    static int num;
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        isPrime();
    }
    static void isPrime(){
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0){
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
=======
import java.util.Scanner;
// Prime or not
public class function_p07 {
    static int num;
    static boolean flag = false;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        num = sc.nextInt();

        isPrime();
    }
    static void isPrime(){
        for (int i = 2; i <= num/2; i++) {
            if (num % i == 0){
                flag = true;
                break;
            }
        }
        if(!flag)
            System.out.println(num + " is a prime number");
        else
            System.out.println(num + " is not a prime number");
    }
>>>>>>> b93e3a3e1d55f550b50eae113b1980b2faa60357
}