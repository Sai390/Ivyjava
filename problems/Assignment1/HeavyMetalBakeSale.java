package com.ivy.problems.Exam1;

import java.util.Scanner;

abstract class Bakery
        {
            abstract void billGenerator();
        }

class Example12 extends Bakery
{
    @Override
    void billGenerator() {



    Scanner sc=new Scanner(System.in);
        String[] str=new String[] {"Muffin","Brownie","CakePop","Water","NA"};
        float[] rate=new float[] {1.0f,0.5f,1.35f,1.50f,0};
        int[] Quantitiy=new int[5];
        int sum=0;
        boolean quit=true;
        do {
            System.out.println("Bakery ITems"+"\t\t\tPrice");
            System.out.println("_________________________________________________________________________");
            for(int i=0;i<5;i++)
            {
                System.out.println((i+1)+"."+str[i]+"\t\t\t\t\t"+rate[i]);
            }
            System.out.println("Please choose the above list items :");
             int ch=sc.nextInt();
            if(ch>0 && ch<5)
            {
                System.out.println("Enter the no of quantities"+str[ch-1]);
                int q=sc.nextInt();
                Quantitiy[ch-1]+=q;
            } else if (ch>5)
            {
                System.out.println("Please enter valid item to buy");
            } else {
                quit = false;
            }
        }while (quit);
        System.out.println("Your are ordered food from bakery is : \n");

        for(int i=0;i<5;i++)
        {
            if(Quantitiy[i]!=0)
            {
                sum+=Quantitiy[i]*rate[i];
                System.out.println(str[i]+" *"+Quantitiy[i]+"=="+Quantitiy[i]*rate[i]+"$");
            }

        }
        System.out.println("Total bill to be paid ="+sum+"$");
    }

}
class HeavyMetalBakeSale extends Example12
{
    public static void main(String args[])
    {
        Example12 obj=new HeavyMetalBakeSale();
        obj.billGenerator();

    }
}

