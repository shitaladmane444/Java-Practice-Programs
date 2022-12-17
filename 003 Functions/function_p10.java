import java.util.Scanner;
public class function_p10 {
// Write a function to find if a number is a palindrome or not. Take number as parameter.

    static int reversedNum;
    static void palindromeORnot(int og_num){
        int num = og_num;
        
        while (num != 0) {
            int remainder = num % 10;
            reversedNum = reversedNum * 10 + remainder;
            num /= 10;
        }
        if(og_num == reversedNum) {
            System.out.println(og_num +" is Palindrome.");
        }
        else {
            System.out.println(og_num+" is not a Palindrome.");
        }
    }
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("Enter number");
        int og_num = in.nextInt();

        palindromeORnot(og_num);
    }

}
