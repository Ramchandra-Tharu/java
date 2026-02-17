package Opp;
class Person{
    String name; 
    int age; 

    Person(String n, int a){
        name = n;
        age = a;
    }
    void display(){
        System.out.println(name + " your name and age is " + age);
    }
}
public class Constructor {
    public static void main(String[] args) {
        Person p = new Person("ramchandra" , 20);

        p.display();
    }
    
}
