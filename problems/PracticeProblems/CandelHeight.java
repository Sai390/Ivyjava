//You are in charge of the cake for a child's birthday. You have decided the cake will have one candle for each year of their total age. They will only be able to blow out the tallest of the candles. Count how many candles are tallest.

       /* Example
        Candles = [4,4,1,3]
        The maximum height of candles is 4 units high. There are 2 of them, so return 2.

        Function Description
        Method birthdayCakeCandles() has the following parameter(s):
        •	int candles[n]: the candle heights
        Returns
        •	int: the number of candles that are tallest

        Input Format
        The first line contains a single integer, n, the size of candles[].
        The second line contains n space-separated integers, where each integer i describes the height of candles[i].

        Sample Input 0
        4
        3 2 1 3
        Sample Output 0
        2

        Explanation 0
        Candle heights are [3,2,1,3]. The tallest candles are 3 units, and there are 2 of them.*/

package com.ivy.problems.PracticeProblems;
import java.util.*;
class Abcd
{
    void birthdayCakeCandles()
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter no of candels");
        int n = sc.nextInt();
        int maximum =0;int count=0;int num;
        for(int i =0; i < n; i++){
            System.out.println("Please enter the height of candels one by one");
            num = sc.nextInt();
            if(num > maximum){
                count=1;
                maximum = num;
            }else if(num == maximum){
                count++;
            }
        }
        System.out.println(count);

    }

}

public class CandelHeight {

    public static void main(String[] args) {
        Abcd obj=new Abcd();
        obj.birthdayCakeCandles();


    }
}