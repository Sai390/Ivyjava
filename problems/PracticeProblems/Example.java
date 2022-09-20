
package com.ivy.problems.PracticeProblems;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Example {
    public static void main(String[] args) {

        System.out.println("1. Creation of ArrayList(color_list): ");
        ArrayList <String> color_list = new ArrayList<String>();
        color_list.add("Blue");
        color_list.add("Red");
        color_list.add("Green");
        color_list.add("Orange");
        color_list.add("Maroon");
        color_list.add("White");
        System.out.println(color_list);
        System.out.println("\n");

        System.out.println("2.Iterate through array list: ");
        for(String i : color_list){
            System.out.println(i);
        }
        System.out.println("\n");

        System.out.println("3.Insert into 1st pos: ");
        color_list.add(1,"Sky-Blue");
        System.out.println(color_list);
        System.out.println("\n");

        System.out.println("4.Retrieve a specific element: ");
        System.out.println(color_list.get(0));
        System.out.println("\n");

        System.out.println("5.Update specific array element: ");
        color_list.set(3, "Brown");
        System.out.println(color_list);
        System.out.println("\n");

        System.out.println("6.Remove third element of array list: ");
        System.out.println("Removed element is: "+color_list.get(3));
        color_list.remove(3);
        System.out.println(color_list);
        System.out.println("\n");

        System.out.println("7.Search an element in array list: ");
        int x = color_list.indexOf("Sky-Blue");
        System.out.println("Element found at index:"+x);
        System.out.println("\n");

        System.out.println("8.Sort an array list: ");
        color_list.sort(Comparator.naturalOrder());
        System.out.println(color_list);
        System.out.println("\n");


        System.out.println("9.Copy one array list into other: ");
        ArrayList <String> colors = new ArrayList<String>();
        colors.addAll(color_list);
        System.out.println(colors);
        System.out.println("\n");

        System.out.println("10.Shuffle elements in array list: ");
        Collections.shuffle(color_list);
        System.out.println(color_list);
        System.out.println("\n");

        System.out.println("11.Reverse elements in array list: ");
        color_list.sort(Comparator.reverseOrder());
        System.out.println(color_list);
        System.out.println("\n");

        System.out.println("12.Extract position of array list: ");
        color_list.subList(0,4);
        System.out.println(color_list);
        System.out.println("\n");


        System.out.println("13.Compare 2 array lists: ");
        ArrayList <String> color1 = new ArrayList<String>();
        color1.addAll(color_list);
        System.out.println(color1);
        System.out.println(color_list.equals(color1));
        System.out.println(color_list.equals(colors));
        System.out.println("\n");


        System.out.println("14.Swap 2 elements in array list: ");
        Collections.swap(color_list,0,1);
        System.out.println(color_list);
        System.out.println("\n");

        System.out.println("15.Join 2 array list: ");
        colors.addAll(color1);
        System.out.println(colors);
        System.out.println("\n");

        System.out.println("16.Clone an array list: ");
        System.out.println(color_list.clone());
        System.out.println("\n");

        System.out.println("17.Empty an array list: ");
        colors.clear();
        System.out.println(colors);
        System.out.println("\n");

        System.out.println("18.Check whether array list is empty: ");
        System.out.println(colors.isEmpty());
        System.out.println("\n");


        System.out.println("19.Trim capacity of array list: ");
        ArrayList <String> Color_Trim = new ArrayList<String>();
        Color_Trim.addAll(color_list.subList(1,4));
        System.out.println(Color_Trim);
        Color_Trim.trimToSize();
        System.out.println(Color_Trim.size()); // Trims the capacity of list to current size of list
        System.out.println("\n");


        System.out.println("20.Increase Size of array list: ");
        Color_Trim.ensureCapacity(4);
        Color_Trim.add("Pink");
        System.out.println(Color_Trim);
        System.out.println("\n");

        System.out.println("21.Replace 2nd element with specified element: ");
        color_list.set(1,"Grey");
        System.out.println(color_list);
        System.out.println("\n");


        System.out.println("22.Print array list elements using position: ");
        for (int i=0;i<color_list.size();i++) {
            System.out.println(color_list.get(i));
        }
        System.out.println("\n");




    }
}
