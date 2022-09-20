package com.ivy.problems.PracticeProblems;



import java.util.ArrayList;
        import java.io.*;
        import java.util.*;

public class StackList  {
    public static void main(String[] args) {
        Stack<String> cars = new Stack<String>();
        cars.push("Volvo");
        cars.push("BMW");
        cars.push("Ford");
        cars.push("Mazda");
        System.out.println(cars);
        cars.pop();
        System.out.println(cars);
    }
}
