package com.ivy.problems.PracticeProblems;


class Area
{

    public int area(int a)
    {
        return a*a;

    }
    public double area(int a,double pi)
    {
        return a*a*pi;
    }

}

public class overloades {

    public static void main(String args[]) {
        Area obj=new Area();
        int Square=obj.area(2);
        Double circle=obj.area(2,3.14);
        System.out.println(Square);
        System.out.println(circle);

    }
}
