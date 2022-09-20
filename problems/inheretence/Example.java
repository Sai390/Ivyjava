package com.ivy.problems.inheretence;


class Arithmetic{
}

class Adder extends Arithmetic {
    public int add(int a, int b){
        return a+b;
    }
}

public class Example{
    public static void main(String []args){

        Adder obj = new Adder();


        System.out.println( obj.getClass().getSuperclass().getName());


        System.out.print(obj.add(1,2));
    }
}
