
import java.util.Scanner;

public class Even {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int number = scan.nextInt();

        if( number % 2 == 0){
            System.out.println("Given number is even: " + number);
        }
        else{
            System.out.println("Given number is odd" + number);
        }
    }
    
}
