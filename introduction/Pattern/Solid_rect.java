package Pattern;

import java.util.Scanner;

public class Solid_rect {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.print("Enter the number of row: ");
        int row = Scan.nextInt();
        System.out.print("Enter the number of col:");
        int col = Scan.nextInt();
        for(int i = 1; i<=row; i++){
            for(int j = 1; j<=col; j++){
                System.out.print("X");
            }
            System.out.println();
        }

    }
    
}
