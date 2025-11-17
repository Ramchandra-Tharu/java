
import java.util.Scanner;

public class FivePrinter {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter range number: ");
        int num = scan.nextInt();
        for(int i = 1; i<=num; i++){
            if(i % 5 == 0 && i % 3 == 0){
                System.out.println("five and Three");
            }
            else{
                System.out.println(i);
            }
        }



}
}
