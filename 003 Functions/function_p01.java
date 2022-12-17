import java.util.Scanner;

// Find largest and smallest among three user input numbers
public class function_p01 {
    static int first, second, third, large, small;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        first = in.nextInt();
        second = in.nextInt();
        third = in.nextInt();

        max();
        min();

    }

    static void max(){
        large = first;
        if (second > large) {
            large = second;
        }
        if (third > large){
            large = third;
        }
        System.out.println("Largest Number: "+large);
    }

    static void min(){
        small = first;
        if(small > second){
            small = second;
        }
        if (small > third){
            small = third;
        }
        System.out.println("Smallest Number: "+small);
    }
}