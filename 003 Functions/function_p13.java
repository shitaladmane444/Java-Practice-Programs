import java.util.Scanner;

public class function_p13 {

    static void Prime(int a, int b){
        while (a < b) {
            boolean flag = false;

            for (int i = 2; i <= a/2; ++i) {
                // condition for non prime number
                if(a % i == 0) {
                    flag = true;
                    break;
                }
            }
            if(!flag && a!=0 && a!=1)
            System.out.print(a+" ");
            ++a;
        }
        
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number from which you want to start: ");
        int a = in.nextInt();
        System.out.println("Enter the number from where you want to stop: ");
        int b = in.nextInt();

        System.out.println("Prime numbers between "+a+" and "+b+" are: ");
    
        Prime(a, b);
    }

}
