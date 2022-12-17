import java.util.Scanner;

public class function_p08 {
    static int marks;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Marks: ");
        marks = in.nextInt();

        grade();
    }
    static void grade(){
        if (marks <= 100 && marks >= 91){
            System.out.println("AA");
        } else if (marks <= 90 && marks >= 81) {
            System.out.println("AB");
        } else if (marks <= 80 && marks >= 71) {
            System.out.println("BB");
        } else if (marks <= 70 && marks >= 61) {
            System.out.println("BC");
        } else if (marks <= 60 && marks >= 51) {
            System.out.println("CD");
        } else if (marks <= 41 && marks >= 50) {
            System.out.println("DD");
        } else if (marks <= 40){
            System.out.println("Fail");
        } else {
            System.out.println("Enter valid marks");
        }
    }
}