package Recursion;

import java.util.Scanner;

public class Factorial {

    public static int fact(int n) {
        if (n == 0 || n == 1) {
            return 1; // Base case
        }
        return  n * fact(n - 1); // Recursive call
        
    }
    

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = sc.nextInt();
       System.out.println(" factorial of "+ n + " is " + fact(n));
        
    }
}
