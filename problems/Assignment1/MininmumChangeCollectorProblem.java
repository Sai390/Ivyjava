package com.ivy.problems.Exam1;

class MinimumChangeCollector
{

    int minimum(int coins[],int a,int change)
    {
        if(change==0)
            return 0;
        int Result=Integer.MAX_VALUE;
        for(int i=0;i<a;i++)
        {
            if(coins[i]<=change)
            {
                int Result2=minimum(coins,a,change-coins[i]);
                if(Result2 !=Integer.MAX_VALUE && Result2+1<Result)
                    Result=Result2+1;

            }

        }
        return Result;
    }
}
public class MininmumChangeCollectorProblem{
    public static void main(String args[]) {

        int coins[] = {1,2,5,10};
        int a = coins.length;
        int change = 11;
        MinimumChangeCollector obj = new MinimumChangeCollector();
        System.out.println(obj.minimum(coins, a, change));
    }

}

