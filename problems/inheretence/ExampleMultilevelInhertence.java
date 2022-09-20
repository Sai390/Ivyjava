package com.ivy.problems.inheretence;



class Grandfather
{
    String swims()
    {
        return "Swims in well";
    }
}
class Father extends Grandfather
{
    String swims()
    {
        return "Swims in river";
    }
}
class Son extends Father
{
    String swims()
    {
        return "Swims in pool";
    }
}


public class ExampleMultilevelInhertence {
    public static void main(String args[])
    {
        Grandfather obj1=new Grandfather();
        String Grand= obj1.swims();
        System.out.println(Grand);
        Grandfather obj2=new Father();
        String Fath= obj2.swims();
        System.out.println(Fath);
        Father obj3=new Son();
        String Son=obj3.swims();
        System.out.println(Son);
    }
}

