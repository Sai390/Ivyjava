package com.ivy.problems.PracticeProblems;
class abcdef
{
    int[][] matrix={{1,3,4},{2,4,3},{3,4,5}};
    public boolean isMagicSquare() {
         int len = matrix.length;
         Integer sum = null;
         for (int i = 0; i < len; i++) {
             int rowSum = 0;
             for (int j = 0; j < len; j++) {
                 rowSum += matrix[i][j];
             }
             if (sum == null) {
                 sum = rowSum;
             } else {
                 if (rowSum != sum) {
                     return false;
                 }
             }
         }
         for (int i = 0; i < len; i++)
         {                         int colSum = 0;
             for (int j = 0; j < len; j++) {
                 colSum += matrix[j][i];
             }
             if (colSum != sum) {
                 return false;
             }
         }
         int diaGonalSum = 0;
         for (int i = 0; i < len; i++) {
             diaGonalSum += matrix[i][i];
         }                 if (diaGonalSum != sum) {
             return false;                 }
         diaGonalSum = 0;
         for (int i = 0; i < len; i++)
         {
             diaGonalSum += matrix[i][len - 1 - i];
         }                 if (diaGonalSum != sum) {
             return false;
         }
         return true;
    }


}
public class Magic {
    public static void main(String args[])
    {
        abcdef obj=new abcdef();
        System.out.println(obj.isMagicSquare());
    }
}
