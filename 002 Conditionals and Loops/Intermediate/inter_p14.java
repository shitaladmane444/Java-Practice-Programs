// Armstrong Number
import java.util.Scanner;

public class inter_p14 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int num = in.nextInt();
        int temp_num = num;
        int r, sum=0;

        while(num!=0){
            r = num%10;
            sum+=Math.pow(r, 3);
            num/=10;
        }
        if(sum == temp_num){
            System.out.println(temp_num + " is an Armstrong Number");
        }else{
            System.out.println(temp_num + " is not an Armstrong Number");
        }
    }
}