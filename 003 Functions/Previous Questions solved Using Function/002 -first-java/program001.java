package functions002;

import java.util.Scanner;
public class program001 {
    static int num;

    public static void main(String[] args) {
        check();
    }    
    static void check(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a numebr: ");
        num = sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
    }
}
