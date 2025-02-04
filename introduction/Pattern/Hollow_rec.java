package Pattern;

import java.util.Scanner;

public class Hollow_rec {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the number of row: ");
        int row = Scan.nextInt();
        System.out.println("Enter the number of col: ");
        int col = Scan.nextInt();

        for(int i = 1; i<=row; i++){
            for (int j = 1; j<=col; j++){
                if(i == 1 || j == 1 || i == row || j == col){
                    System.out.print("x");
                }
                else{
                    System.out.print(" ");
                }
            }
              System.out.println();
        }
    }
}
