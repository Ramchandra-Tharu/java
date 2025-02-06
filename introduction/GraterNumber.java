
import java.util.Scanner;

public class GraterNumber {
    public static void findGraternum (int n1 , int n2){
        if( n1>n2){
            System.out.println("grater number is:: " + n1);
        }
        else {
            System.out.println("Grater number is " + n2);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first numbers: ");
        int n1 = sc.nextInt();
        System.out.println("Enter the second number: ");
        int n2 = sc.nextInt();
        findGraternum(n1,n2);



    }
}
