
import java.util.Scanner;

public class CI {
    public static void main(String[] args) {
        
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter your Pricnipal");
    float principal = scan.nextFloat();
    System.out.println("Enter the rate");
    float rate = scan.nextFloat();
    System.out.println("enter Time ");
    float time = scan.nextFloat();

    double Amout = principal * Math.pow((1 + rate/100), time);
    System.out.println("your amout is : " + Amout);
    double ci = Amout - principal;
    System.out.println("your Coumpont intrest is : " + ci);


} 
}
