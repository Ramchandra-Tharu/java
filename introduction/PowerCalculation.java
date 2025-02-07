import java.util.Scanner;

public class PowerCalculation {
    public static double calculatepower(int x, int n ){
        return Math.pow(x,n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your base (x)");
        int x = sc.nextInt();
        System.out.println("Enter power:");
        int n = sc.nextInt();
        double result = calculatepower(x,n);
        System.out.println(result);

    }
}