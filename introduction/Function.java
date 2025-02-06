
import java.util.Scanner;

public class Function {
    // Function declaration
    public static int Calculate(int a, int b){
        int sum = a+b;
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of y");
        int y = sc.nextInt();
        System.out.println("Enter the value of x");

        int x = sc.nextInt();
        // Function Call
        int sum = Calculate(x, y);
        System.out.println(sum);
    }

}

