package com.ivy.problems.PracticeProblems;


import java.util.*;
        import java.util.Stack;
        import java.lang.String;
public class ParenthisisStackProblem {
    public static void main(String[] args) {
        char index;
        Stack<Character> stk  = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        String str= sc.nextLine();
        for(int i=0;i<str.length();i++){
            index=str.charAt(i);
            if((index == '{') || (index == '(') || (index == '[')) {
                stk.push(index);
            }
            else if((index == '}') || (index == ')') || (index == ']'))
                stk.pop();
        }
        if(stk.isEmpty())
        {
            System.out.println("Balanced Parenthesis");
        }
        else {
            System.out.println("Un-balanced Parenthesis");
        }
    }

}