package Recursion;

public class SumOfNumber {
   public static void SumCal(int i, int n, int Sum){
    if(i==n){
        Sum = Sum+i;
        System.out.println(Sum);
        return;

    }
        Sum = Sum+i;
        SumCal(i+1, n, Sum);
        
    

   }
   public static void main(String[] args) {
       SumCal(1, 5, 0);
   }

    
}
