import java.util.Scanner;

public class NumberSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int nums = sc.nextInt();

        int sum = 0;

        if (nums % 2 == 0) {
            // even number → sum of even numbers
            for (int i = 2; i <= nums; i += 2) {
                sum += i;
            }
            System.out.println("Sum of even numbers = " + sum);

        } else {
            // odd number → sum of odd numbers
            for (int i = 1; i <= nums; i += 2) {
                sum += i;
            }
            System.out.println("Sum of odd numbers = " + sum);
        }
    }
}
