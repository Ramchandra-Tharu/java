package Opp;
class Account{
    long accountNumber; 
    String holderName;
    long balance;
    void deposit(){
        System.out.println("amount is deopsit");
    } 
    void withdraw(){
        System.out.println("amount is withdraw: ");
    }

}
 class savingAccount extends Account{
    void display(String holderName, long balance){
        this.holderName = holderName;
        this.balance = balance;

    }

}

public class Ineritence { 
    public static void main(String[] args) {
         savingAccount sa = new savingAccount();
     sa.display("sirzan" , 338473);
        
    }
   


    
}
