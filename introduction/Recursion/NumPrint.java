package Recursion;

import java.util.Scanner;

public class NumPrint {
    public static void Print(int n){
        if(n == 25){
            return;
        }
        System.out.println(n);
        
        Print(n+1);

    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number: ");
        int n = sc.nextInt();
        System.out.println("the output is:");
        Print(n);
    }
    
}
