// Sum of digits of a number

public class inter_p24 {
    public static void main(String[] args) {

        int num=489846, sum=0, digit;
        while (num > 0){
            digit = num % 10;
            sum = sum + digit;
            num = num/10;
        }
        System.out.println(sum+" ");
    }
}
