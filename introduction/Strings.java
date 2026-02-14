import java.util.Scanner;

public class Strings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your  name: ");
        String fName = sc.nextLine();
        String  name = new String ( "Ramchandra");
        System.out.println(name.charAt(3));
        System.out.println(name.toUpperCase());
        System.out.println("you index is :  " + name.indexOf("n"));
        System.out.println("yyour string start with: " + name.substring(1, 5));
        // System.out.println("your name length is  : " + fName.length());
        // System.out.println("your full name is :  " + fName  + " " + "tharu");

        // for (int i = 0; i<fName.length(); i++){
        //     System.out.println(fName.charAt(i)); //charAt(i) method is used in the program to extract individual characters from a string at specific positions (index i).
        // }

/*      System.out.println("Enter your last name: ");
        String lname = sc.nextLine();
        String Fname = "Sirzan";
        String Lname = "Tharu";
      // String concatenate
      String fullName = fName +" "+ lname;
       System.out.println("My name is : " + fullName);
       */
 
    }
}
