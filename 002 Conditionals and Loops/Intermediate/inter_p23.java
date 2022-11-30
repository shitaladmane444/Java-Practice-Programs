import java.util.Scanner;

public class inter_p23 {
    public static void main(String[] args) {
        int year;
        System.out.print("Enter a Year: ");
        Scanner in = new Scanner(System.in);
        year = in.nextInt();

        if((year%4==0) && (year%100!=0)){
            System.out.println(year+" is a leap year");
        }
        else{
            System.out.println(year+" is not a leap year");
        }
    }
}
