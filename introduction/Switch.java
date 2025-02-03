
import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        int num1 = Scan.nextInt();
        System.out.println("Entere second number");
        int num2 = Scan.nextInt();
        System.out.println("choose the operation \n 1.Addition \n 2.Substration \n3.Multiply \n4.Division \n5.Modular");
        int operation = Scan.nextInt();
        switch(operation){
        case 1:
        System.out.println("Addition is : " + (num1+num2));
        break;
        case 2:
        System.out.println("Substration is : " + (num1 - num2));
        break;
        case 3:
        System.out.println("Multiply is : " + (num1*num2));
        break;
        case 4:
        System.out.println("Division is : " + (num1 / num2));
        case 5:
        System.out.println("Modular is : " + (num1 % num2));
        break;
        default:
        System.out.println("Enter the valid operations:");


       }
    }
}