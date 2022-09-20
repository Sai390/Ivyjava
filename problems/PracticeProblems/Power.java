package com.ivy.problems.PracticeProblems;


import java.util.Scanner;
class Power
{
    public static void main(String[] args)
    {
        int first_num,sec_num,power;
        Scanner a = new Scanner(System.in);
        first_num=a.nextInt();
        sec_num=a.nextInt();
        power=1;
        if(sec_num>=1)
        {
            for(int i=1;i<=sec_num;i++)
            {
                power=power*first_num;

            }
            System.out.println(power);
        }
    }
}

