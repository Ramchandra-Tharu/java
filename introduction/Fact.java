
import java.util.Scanner;

//calculating the factorial using for loop

public class Fact {
    public static void Fact(int n){
        int fact = 1; 
        for(int i =1; i<=n; i++ ){
            fact = fact*i;
            
        }
        System.out.println("factorial of n is : " + fact);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Fact(n);
    }
    
}
