package com.ivy.problems.Abstract;
/*common functionality
        -open file
        - read file
        - abstract method  produce report()
        - send via email/slack*/

abstract class file {
    abstract void produceReport();

}


class open extends file{
    @Override
    void produceReport() {
        System.out.println("open file");
    }
}
class read extends file{
    @Override
    void produceReport() {
        System.out.println("Read file");
    }
}



public class ExampleFile {
    public static void main(String args[])
    {
        open obj1=new open();
        obj1.produceReport();
        read obj2=new read();
        obj2.produceReport();
    }
}


