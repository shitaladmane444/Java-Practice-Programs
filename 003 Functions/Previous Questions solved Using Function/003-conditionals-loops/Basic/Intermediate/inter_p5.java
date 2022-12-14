// Calculate distance between two points
import java.util.Scanner;

public class inter_p5 {

    static void CalculateDistanceBetweenTwoPoints(){
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter coordinates of x1 and y1: ");
        int x1 = in.nextInt();
        int y1 = in.nextInt();

        System.out.print("Enter coordinates of x2 and y2: ");
        int x2 = in.nextInt();
        int y2 = in.nextInt();

        System.out.print("Distance is: "+Math.sqrt( Math.pow((x1-x2),2) + Math.pow((y1-y2),2) ) );
    }
    public static void main(String[] args){

       CalculateDistanceBetweenTwoPoints();
    }
}
