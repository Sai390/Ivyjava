package com.ivy.problems.polymorphisam;
//Animal  Herbivores, Carnivores, and Omnivores eats(){//eats?} try to exhibit the Runtime polymorphism


class Animal
{
    public String eat()
    {
        return "Animals eats food for leaving";
    }
}
class Herbivores extends Animal
{
    @Override
    public String eat() {
        return "Eats plants";

    }
}
class Carnivores extends Animal
{
    @Override
    public String eat() {
        return "Eats meet only";

    }
}
class Omnivores extends Animal{
    @Override
    public String eat() {
        return "Eats both meet and plants";
    }
}
public class Runtimeply {
    public static void main(String args[])
    {
        Animal obj1=new Carnivores();
        System.out.println(obj1.eat());
        Animal obj2=new Herbivores();
        System.out.println(obj2.eat());
        Animal obj3=new Omnivores();
        System.out.println(obj3.eat());
    }
}
