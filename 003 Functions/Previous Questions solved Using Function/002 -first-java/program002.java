package functions002;

import java.util.Scanner;

public class program002 {
    
    static void greeting(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name: ");
        String name = sc.next();
        System.out.println("Hello "+name);
    }
    
    public static void main(String[] args) {
        greeting();
    }
    
 }
