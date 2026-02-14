import java.util.Scanner;

public class Variable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 12;
        int num2 = 14;
        int sum = num2 + num1;
        System.out.println(sum);

        System.out.println("Enter your name : ");
        String name = sc.nextLine();    // taking   (String) input from user .
        System.out.println("your name is : " + name);

        System.out.println("Enter  first number");
        int n1 = sc.nextInt();
        System.out.println("Enter second number");
        int n2 = sc.nextInt();
        int add = n1 + n2;
        System.out.println("Sum of n1 and n2: " + add);
        




    }
}
