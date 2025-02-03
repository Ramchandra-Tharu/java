
import java.util.Scanner;

public class IF_Else {

    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter your Marks: (0-100):");
        int Marks = Scan.nextInt();
        if(Marks >= 80 && Marks<=100){
            System.out.println("Outstanding marks");
        }
        else if( Marks>=60 && Marks<80){
            System.out.println("Excellent");
        }
        else if(Marks>=40 && Marks<60){
            System.out.println("Good");

        }
        else if(Marks<40){
            System.out.println("Fail and try again");
        }
        else{
            System.out.println("invalid marks");
        }

    }
    
}
