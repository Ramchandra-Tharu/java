
import java.util.Scanner;

public class loginPage {

public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int username = 1234;
    int Password = 1431;
    System.out.println("Enter the username :");
    int uname = sc.nextInt();
    System.out.println("Enter your password");
    int pass = sc.nextInt();
    if( username == uname && Password == pass){
        System.out.println("login successful:");
        System.out.println("Thankyou👍");
    }
        else {
        if(username !=uname){
            System.out.println("Your username is incorrect");
            System.out.println("Try agian");
        }
        else if(Password !=pass){
            System.out.println("Your password is incorrect");
            System.out.println("Try again");
        }
     }
    
   

    

}



    
}
