import java.util.Scanner;

public class TicketDis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int basePrice = 300;
        float discount = 0;
        float finalPrice;
        
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        scan.nextLine();
        
        System.out.println("Enter the day of the week:");
        String day = scan.nextLine();

        if(age <= 12) {
            discount += basePrice * 50 / 100.0f;
        } else if(age >= 60) {
            discount += basePrice * 30 / 100.0f;
        }

        if(day.equalsIgnoreCase("wednesday")) {
            discount += basePrice * 20 / 100.0f;
        }

        finalPrice = basePrice - discount;

        System.out.println("Total discount: " + discount);
        System.out.println("Final ticket price: " + finalPrice);
    }
}
