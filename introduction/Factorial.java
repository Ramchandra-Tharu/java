import java.util.Scanner;

public class Factorial {
     public static  void calculateFact( int num)

   {
       if(num <=0){
           System.out.println("please ! Enterr valid number");
           return;
       }

         int fact = 1;
         for (int i = num; i>=1; i--){
             fact = fact * i;

         }
       System.out.println(fact);

     }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the num:");
        int num = sc.nextInt();
       calculateFact(num);
    }
}
