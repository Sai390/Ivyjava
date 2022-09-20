package com.ivy.problems.PracticeProblems;

interface Duck1
{
    void shape();
    void sell();
}
interface Duck2
{
    void floa();
}
class Duck implements Duck1,Duck2
{
    void fly(){
        System.out.println("I can fly");
    }

    @Override
    public void floa() {
        System.out.println("I can float");
    }

    @Override
    public void sell() {
        System.out.println("it can be sold");
    }

    @Override
    public void shape() {
        System.out.println("All the ducks are same shape");
    }

    void swim()
    {
        System.out.println("I can swim");
    }
    void noise()
    {
        System.out.println("I can make noise");
    }
    void walk()
    {
        System.out.println("I can walk");
    }
    void squeeze()
    {
        System.out.println("I can be  squeezed");
    }
    void decorate()
    {
        System.out.println("I can be used for decorate");
    }

}
class Mallard extends Duck
{
    @Override
    public void floa() {
        super.floa();
    }

    @Override
    void fly() {
        super.fly();
    }

    @Override
    void swim() {
        super.swim();
    }

    @Override
    void noise() {
        super.noise();
    }

    @Override
    void walk() {
        super.walk();
    }

    @Override
    public void shape() {
        super.shape();
    }

    @Override
    public void sell() {
        super.sell();
    }
}
class Rubber extends Duck{
    @Override
    public void floa() {
        super.floa();
    }

    public void shape() {
        super.shape();
    }

    @Override
    public void sell() {
        super.sell();
    }
    @Override
    void noise() {
        super.noise();
    }

    @Override
    void squeeze() {
        super.squeeze();
    }
}
class Wooden extends Duck
{
    public void shape() {
        super.shape();
    }

    @Override
    public void sell() {
        super.sell();
    }
    @Override
    void decorate() {
        super.decorate();
    }
}

public class ExampleDuck {
    public static void main(String args[])
    {
        Duck obj=new Mallard();
        obj.fly();obj.decorate();obj.walk();obj.swim();obj.shape();obj.sell();obj.floa();
    }
    }
