import java.util.Scanner;

public class function_p14 {
    static int NaturalSum(int num){
        int sum=0;
        for (int i = 1; i <= num; i++) 
            sum = num + i;
        return sum;       
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Number");
        int num = in.nextInt();
        System.out.println(NaturalSum(num));
    }
}
