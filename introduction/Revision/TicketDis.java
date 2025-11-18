import java.util.Scanner;

public class TicketDis {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        int basePrice = 100;  // base ticket price
        float discount = 0;   // total discount
        float finalPrice;     // final ticket price
        
        // Input age
        System.out.println("Enter your age:");
        int age = scan.nextInt();
        scan.nextLine(); // consume leftover newline
        
        // Input day of the week
        System.out.println("Enter the day of the week:");
        String day = scan.nextLine();
        
        // Input student status (optional if you want to add)
        // System.out.println("Are you a student? true/false");
        // boolean isStudent = scan.nextBoolean();

        // Age-based discount
        if(age <= 12) {
            discount += basePrice * 50 / 100.0f; // 50% discount
        } else if(age >= 60) {
            discount += basePrice * 30 / 100.0f; // 30% discount
        }

        // Wednesday discount
        if(day.equalsIgnoreCase("wednesday")) {
            discount += basePrice * 20 / 100.0f; // 20% discount
        }

        // Final price calculation
        finalPrice = basePrice - discount;

        // Output
        System.out.println("Total discount: " + discount);
        System.out.println("Final ticket price: " + finalPrice);
    }
}
