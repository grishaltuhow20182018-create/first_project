package com.company;


class animal{
    String name;
    int height;
    int weight;
    String color;
    void eat(){
        System.out.println("SexLabs Created!!!");
    }
    void sleep(){
        System.out.println("SexLabs Created!!!");
    }
    void makeSound(){
        System.out.println("MISHA is a DAUN");
    }
    public animal(String name, int height, int weight, String color){
        this.name=name;
        this.height=height;
        this.weight = weight;
        this.color = color;
    }

}
class cow extends animal{
    public cow(String name, int height, int weight, String color){
        super(name, height, weight, color);
    }
}
class cat extends animal{
    public cat(String name, int height, int weight, String color){
        super(name, height, weight, color);
    }
}


public class Main {


    public static void main(String[] args) {
        cow misha = new cow("dolbaeb misha", 100, 200, "black");
        System.out.println(misha.name + " his dick s length is " + misha.height + "nm");
        misha.makeSound();
        misha.sleep();
    }
}
