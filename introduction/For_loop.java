
import java.util.Scanner;

public class For_loop {
    public static void main(String[] args) {
        
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the natural number number:");
        int n = Scan.nextInt();
        int sum = 0;
        for(int i = 1; i<=n; i++){
            sum = sum + i;

        }
        System.out.println("Sum of natural number is : " + sum);

    }
    
}
