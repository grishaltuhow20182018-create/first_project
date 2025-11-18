package com.company;
import com.company.Creature;


public class Human extends Creature{
    public void bear(String name) {
        this.name = name;
        this.isAlive = true;
        System.out.println("The human " + name + " was born");
    }
    public void die(){
        this.isAlive=false;
        System.out.println("The human "+ name +" has died");
    }
}