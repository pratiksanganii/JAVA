// import bank.*;

class Pen{
    String color;
    String type;

    public void printColor(){
        System.out.println(this.color);
    }
}

class Shape{
    String color;
}

class Triangle extends Shape{
    // Single level Inheritance
}

class EquivalentTriangle extends Triangle{
    // Multi level Inheritance
}

class Circle extends Shape{
    // Hirearchical Inheritance
}

class Student{
    String name;
    static String school;// Common for all class objects
    int age;
    public void printInfo(){
        System.out.println(this.name);
        System.out.println(this.age);
    }
    Student(Student s1){
        this.name=s1.name;
        this.age=s1.age;
    }
    Student(){

    }
}

abstract class Animal{
    Animal(){
        System.out.println("Animal called....");
    }
    abstract void walk();
}

class Horse extends Animal{
    Horse(){
        System.out.println("Horse called.....");
    }
    public void walk(){
        System.out.println("Walking on 4 legs.");
    }
}

class Chicken extends Animal{
    public void walk(){
        System.out.println("Walking on 2 legs.");
    }
}

interface Animals{
    void walk();// By default public and abstracted
    // cannot create constructors in interface
}

interface Herbivore{

}

class Horses implements Animals,Herbivore{ // Multiple classes cannot be inherited by class but multiple interfaces can be inherited by classes..Multiple Inheritence.
    public void walk(){
        System.out.println("walks on 4 legs.");
    }
}

public class OOPS {
    public static void main(String[] args) {
        // Pen pen1 = new Pen();
        // Pen pen2 = new Pen();
        // pen1.color="blue";
        // pen2.color="black";
        Student.school="Gurukul";
        Student s2 = new Student();
        s2.name="Pratik";
        // s2.age=18;
        // Student S1 = new Student(s2);
        // S1.printInfo();
        // bank.Account account1 = new bank.Account();
        // account1.name="cust1";
        // Horse horse=new Horse();
        // horse.walk();
        // System.out.println(s2.school);
    }
}
