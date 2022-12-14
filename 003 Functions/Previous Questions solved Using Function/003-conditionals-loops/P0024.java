import java.util.Scanner;

public class P0024 {
    
    static void run(int num) {
        int temp=0;
        Scanner sc = new Scanner(System.in);
        while (num != 0) {
            System.out.println("Enter number: ");
            num = sc.nextInt();
            System.out.println("Enter 0 to exit loop");
            temp += num; 
        }
        System.out.println(temp);
    }
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Enter number: ");
        int num = in.nextInt();
        run(num);
    }
}
