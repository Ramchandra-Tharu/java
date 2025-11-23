
import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt(); 
        int i = 1;
            if(n % 2 == 0){
                System.out.println( "even number:" + n );
                while(i<=n){
                    if(i%2 ==0){
                        System.out.println(i);
                    }
                    i++;

                }
                
                }
            else{
                System.out.println("odd number" + n);
                while( i<=n){
                    if(i% 2 !=0){
                        System.out.println(i);
                    }
                    i++;
                }
            }
            
        
        }
       
    }
    

