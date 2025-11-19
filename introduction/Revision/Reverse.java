
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner (System.in);
        System.out.println("Enter number digit");
        long num = scan.nextInt();
        int reverse = 0;
         while( num != 0){
            long digit = num % 10; // get last digit
            reverse = (int) (reverse * 10 + digit); //type casting;
            num = num / 10;


         }
         System.out.println("your number digit  reversed is :  " + reverse);
    }
    
}
