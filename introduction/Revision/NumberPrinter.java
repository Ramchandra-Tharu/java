
import java.util.Scanner;

public class NumberPrinter {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        System.out.println("enter the number range: ");
        int num = scan.nextInt();

        for(int i = 1; i<= num; i++){
            if( i % 5 == 0 && i % 3 ==0){
                System.out.println("FiveThree");
            }
        else if (i % 3 == 0){
            System.out.println("Three");
        }

        else if(i % 5 == 0){
            System.out.println("Five");
        }
        else{
            System.out.println(i);
        }
        }
    }
}
