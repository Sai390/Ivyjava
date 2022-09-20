package com.ivy.problems.PracticeProblems;

public class RegionMatches {


    public static void main(String args[]) {
        String sentence1, sentence2;

        sentence1 = "Hdouse";
        sentence2 = "Houses";
        boolean var = sentence1.regionMatches(2, sentence2, 1, 4);
        System.out.println(var);
    }
}
