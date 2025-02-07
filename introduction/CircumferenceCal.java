

import java.util.Scanner;

public class CircumferenceCal     {
   public static double circumference(int r){
       return 2 * Math.PI * r;
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter radius of circle:");
        int radius = sc.nextInt();
        double result = circumference(radius);
        System.out.println(result);

    }
}
