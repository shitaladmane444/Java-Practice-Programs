// Calculate Discount of Product
import java.util.Scanner;

public class inter_p4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Original Price: ");
        int og_price = sc.nextInt();
        System.out.print("Enter the discounted percentage: ");
        int dis_percentage = sc.nextInt();
        System.out.print("Discounted Price is: "+ (og_price/dis_percentage)*100);
    }
}
