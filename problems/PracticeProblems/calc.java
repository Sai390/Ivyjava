package com.ivy.problems.PracticeProblems;

import java.util.Scanner;

interface sample
{
    void method();
    default void msg()
    {
        System.out.println("Thank you");
    }
}
class calcu implements sample{
    Scanner sc=new Scanner(System.in);
    int a,b;
    char op;
    public void method() {
        System.out.print("enter the number :");
        a = sc.nextInt();
        System.out.print("Enter the number :");
        b = sc.nextInt();

        System.out.println(" + --> to perform addition ");
        System.out.println(" - --> to perform subtraction ");
        System.out.println(" * --> to perform multiplication ");
        System.out.println(" / --> to perform division");
        System.out.print("Enter the symbols to perform operation: ");
        op = sc.next().charAt(0);
        switch (op) {
            case '+':
                System.out.println(a + b);
                break;
            case '-':
                System.out.println(a - b);
                break;
            case '*':
                System.out.println(a * b);
                break;
            case '/':
                System.out.println(a / b);
                break;
            default:
                System.out.println("enter valid operation");
        }
    }


}


public class calc
{
    public static void main(String args[])
    {
        calcu obj=new calcu();
        obj.method();
        obj.msg();

    }
}
