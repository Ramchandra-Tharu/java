import java.util.Scanner;

public class TwoDarray  {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of row and column:");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int [][] numbers = new int[row][col];
        // element input
        for(int i = 0; i<row; i++){
            for(int j = 0; j<col; j++){
            
                numbers [row][col] =  sc.nextInt();

            }
        }
        // for output
        for (int i = 0; i<row; i++ ) {
            for (int j = 0; j<col; j++){
                System.out.println(numbers[i][j]);
            }


        }




    }
}
