package functions002;

public class program009 {
    
    static int armstrong(int num){
        int x, a=0;
        while (num != 0){
            x = num % 10;
            a = a + (x * x * x);
            num /= 10;
        }
        return a;
    }
    public static void main(String[] args) {
        int i=100, arm;
        System.out.println("Armstrong numbers between 100 to 99");
        while (i < 1000) {
            arm = armstrong(i);
            if (arm == i) 
                System.out.println(i);
            i++;
        }
    }
}
