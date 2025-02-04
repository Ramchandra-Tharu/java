
// ***********Multiply table of a number input by the user.************************

import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int n = Scan.nextInt();
        // using for loop
       for(int i = 1; i<=10; i++){
            System.out.println(n + "x" + i + " = "  + n*i);

            // using while loop
//        int i = 1;
//        while ( i<= 10){
//            System.out.println(n + "x" + i + " = "  + n*i);
//            ++i;
//        }

    }
}
}
