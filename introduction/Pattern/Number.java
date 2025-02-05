package Pattern;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {
        
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = Scan.nextInt();
        for(int i = 1; i<=num; i++){
            for(int j =1; j<=i; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    
}
