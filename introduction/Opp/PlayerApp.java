package Opp;

import java.util.Scanner;

class Player{
    String name;
    int age;
    String position;

    void play(){
         System.out.println(name + " is playing as " + position +  " in under " + age);
         

    }
   
}
public class PlayerApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Player p = new Player();
        System.out.println("enter your name: ");
        p.name = sc.nextLine();
        System.out.println("enter player name: ");
        p.age =sc.nextInt();
        System.out.println("player position: ");
        p.position = sc.next();

        System.out.println("player name is :" + p.name);
        System.out.println("players age is : " + p.age);
        System.out.println("playerr position is " + p.position);
        p.play();
    }

    
}
