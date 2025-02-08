
import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of an array:"); // take size of arry from the user.
        int size = sc.nextInt();
        int [] marks = new int[size];
        // element input
        System.out.println("Enter elements:"); // 
        for(int i = 0; i<size; i++){

            marks[i]= sc.nextInt();
        }
        // element output
        for(int i = 0; i<marks.length; i++){
            System.out.println(marks[i]);
        }

    }
}
