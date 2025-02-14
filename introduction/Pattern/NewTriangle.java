package Pattern;
import java.util.Scanner;

public class NewTriangle {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int n = scan.nextInt();
        scan.close();

        int width = 2 * n - 1; // Calculate the width of the last row

        for (int i = 1; i <= n; i++) {
            int numWidth = 2 * i - 1; // Width of the current row
            int spaces = (width - numWidth) / 2; // Spaces to center the row
            
            // Print leading spaces
            for (int j = 0; j < spaces; j++) {
                System.out.print(" ");
            }
            // Print numbers
            for (int j = 0; j < numWidth; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}

