

import java.util.Scanner;

public class Average {
    public static int calculateAverage(int num1, int num2, int num3){
        int avg = (num1 + num2 + num3)/2;
        return avg;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the  first number:");
        int num1 = sc.nextInt();
        System.out.println("enter the  second number:");
        int num2 = sc.nextInt();
        System.out.println("enter the  third number:");
        int num3 = sc.nextInt();
        int result = calculateAverage(num1, num2, num3);
        System.out.println("the average of three number is : " + result);


    }
}
