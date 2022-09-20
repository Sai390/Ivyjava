package com.ivy.problems.PracticeProblems;


import java.util.Scanner;
public class StringEqual
{
    public static void main(String args[])
    {
        String sentence1,sentence2;
        Scanner a =new Scanner(System.in);
        sentence1=a.nextLine();
        sentence2=a.nextLine();
        boolean var=sentence1.equals(sentence2);
        System.out.println(var);
    }
}


