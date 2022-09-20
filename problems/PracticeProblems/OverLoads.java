//package com.ivy.problems.polymorphisam;

package com.ivy.problems.PracticeProblems;

class o
{
    public int m1(int a,int b)
    {
        return a+b;
    }
    public int m1(int a,int b,int c)
    {
        return a+b+c;
    }
}
class Overloads
{
    public static void main(String[] args) {
        o obj = new o();
        System.out.println(obj.m1(1,2));
        System.out.println(obj.m1(1,2,3));
    }

}
