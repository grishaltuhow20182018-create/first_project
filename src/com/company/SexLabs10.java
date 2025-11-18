package com.company;


abstract class Creature{
    void bear(){};
    void die(){};
    String name = null;
    Boolean isAlive = false;

    public void shoutName(){
        if(name!=null){
            System.out.println(name);
        }
        else{
            System.out.println("Error: Name is null");
        }
    }
}

class Alien extends Creature{
    public void bear(String name){
        this.name = name;
        this.isAlive = true;
        System.out.println("The Alien " + name + " was born");
    }
    public void die(){
        this.isAlive = true;
        System.out.println("The Alien "+ name + "was died");
    }
}

class Dog extends Creature{
    public void bear(String name){
        this.name = name;
        this.isAlive = true;
        System.out.println("The dog "+ name +" was born");
    }
    public void die(){
        this.isAlive = false;
        System.out.println("The dog "+ name +" has died");
    }

    public void bark(){
        System.out.println("Woof!");
    }
}

public class lab10{
    public static void main(String[] args){
        Human h = new Human();
        h.bear("eblan");
        h.shoutName();
        h.die();
        System.out.println("next");

        Alien e = new Alien();
        e.bear("Irina love");
        e.die();

        Dog b = new Dog();
        b.bear("Irina");
        b.bark();
        b.die();
        System.out.println("next");
    }
}