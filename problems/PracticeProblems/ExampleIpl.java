package com.ivy.problems.inheretence;

class Ipl
{
    public String iplCup()
    {
        return "This is Indian premier league";
    }

}
class Mumbai extends Ipl

{
    @Override
    public String iplCup() {
        return "MI has won 2013, 2015, 2017, 2019, 2020 editions of ipl";

    }
}
class Chennai extends Ipl{
    @Override
    public String iplCup() {
        return "CSK has won 2010, 2011, 2018, 2021,";
    }

}
class Rcb extends Ipl{
    @Override
    public String iplCup() {
        return "Rcb has won 0 cups";
    }
}
public class ExampleIpl {
    public static void main(String args[])
    {
        Mumbai Mi=new Mumbai();
        String mum= Mi.iplCup();
        System.out.println(mum);
        Chennai ch=new Chennai();
        String csk=ch.iplCup();
        System.out.println(csk);
    }
}
