package String;

import java.util.Scanner;

public class checkVowel {
    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int count = 0;
    System.out.println("Enter any word: ");
    String word = scan.next();
    for(int i = 0; i<word.length(); i++){
        char ch = word.charAt(i);
        if(ch == 'a' || ch == 'e' || ch=='i' || ch=='o' || ch =='u'){
            count++;
            System.out.println(ch );
            

        }
        
        
    }
    System.out.println("there are " + count + " vowel in you word.");

    }

}
