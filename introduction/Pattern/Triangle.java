package Pattern;

import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the no of star");
        int n  = Scan.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.out.print("x");
            }
            System.out.println();
        }
    }
    
}
