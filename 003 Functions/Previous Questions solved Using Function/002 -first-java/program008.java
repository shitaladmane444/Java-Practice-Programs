package functions002;

public class program008 {
    static void palindrome(){
        int reminder, sum=0, temp, num=4554;
    
        temp = num;
        while(num > 0){
            reminder = num % 10;
            sum = (sum * 10) + reminder;
            num = num / 10;
        }
        if(temp == sum)
            System.out.println("Palindrome Number");
        else
            System.out.println("Not a palindrome");    
    }

    public static void main(String[] args) {
        palindrome();    
    }
}
