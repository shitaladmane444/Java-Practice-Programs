// Calculate distance between two points
import java.util.Scanner;

public class inter_p5 {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        int x1, x2, y1, y2;
        System.out.print("Enter coordinates of x1 and y1: ");
        x1 = in.nextInt();
        y1 = in.nextInt();

        System.out.print("Enter coordinates of x2 and y2: ");
        x2 = in.nextInt();
        y2 = in.nextInt();

        System.out.print("Distance is: "+Math.sqrt( Math.pow((x1-x2),2) + Math.pow((y1-y2),2) ) );
    }
}
