package Recursion;

import java.util.Scanner;

public class SumOfNumber {
    public  static void sum(int n){
        int sum = 0;
        if(n>0){
            for(int i = 0; i<=n; i++){
                sum = sum+i;
                System.out.println(sum);
            }
        }
        else{
            System.out.println("can't determine");
        }
    
            
    
        
      
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sum(n);
        

    }

    
}
