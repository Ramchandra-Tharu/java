
import java.util.Scanner;

public class IF_Else {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you marks");
        int marks = scan.nextInt();
        if(marks > 50){
            System.out.println("student is pass:");
        }
        else{
            System.out.println("student is fail");
        }
    }
    
}
