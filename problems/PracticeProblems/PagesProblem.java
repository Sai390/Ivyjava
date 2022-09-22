package com.ivy.problems.PracticeProblems;


import java.util.Scanner;

class Example4
{
    int p,n;
    void pageCount()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter number of pages in the book");
        n=sc.nextInt();
        System.out.println("please enter the page number to turn");
        p=sc.nextInt();
        int mid= (n + 1) / 2;
        if(p < mid)
        {
            System.out.println(p / 2);
        }
        else {
            System.out.println((n - p) / 2);
        }
    }
}
public class PagesProblem
{
    public static void main(String args[])
    {
        Example4 obj=new Example4();
        obj.pageCount();
    }
}
