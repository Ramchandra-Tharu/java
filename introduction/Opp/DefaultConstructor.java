package Opp;

class PersonDetails{
    String name; 
    int age; 

    public PersonDetails() {
        name ="sirzan";
        age = 20;

    }
    void display(){
        System.out.println("your name is " + name + "and age is " + age);
    }

    
}

public class DefaultConstructor {
    public static void main(String[] args) {
        PersonDetails p = new PersonDetails();
        p.display();
    }
    
}
