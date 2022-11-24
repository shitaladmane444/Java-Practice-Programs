// Calculate Batting Average
import java.util.Scanner;

public class inter_p9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t_runs, t_outs;
        System.out.print("Total Number of Runs Scored: ");
        t_runs = sc.nextDouble();// Total Number of Runs

        System.out.print("Total Number of outs: ");
        t_outs = sc.nextDouble();// Total Number of Outs

        System.out.println("Batting Rate: "+t_runs/t_outs);
    }
}
