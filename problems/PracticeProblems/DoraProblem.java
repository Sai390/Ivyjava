package com.ivy.problems.PracticeProblems;


import java.util.Scanner;

public class DoraProblem

{

    public static void main(String args[])

    {

        Scanner s=new Scanner (System.in);

        int a=s.nextInt();

        int b=s.nextInt();

        int c=s.nextInt();

        if(c%a==1)

        {

            System.out.println("yes");

        }

        else

        {

            System.out.println("No");

        }

    }

}