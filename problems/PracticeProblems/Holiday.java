package com.ivy.problems.PracticeProblems;
public class Holiday {
    private String name;     private int day;     private String month;
    public Holiday(String name, int day, String month)
    {         this.name = name;this.day = day;this.month = month;
    }

    static Boolean inSameMonth(Holiday h1,Holiday h2)
    {         if(h1.getMonth().equals(h2.getMonth()))
        return true;         return false;     }
    static double avgDate(Holiday h1[])
    {         double avg=0.0;
        for(int i=0;i<h1.length;i++)
        {             avg+=h1[i].getDay();          }
        return avg/h1.length;     }
    public String getName() {
        return name;     }
    public void setName(String name)
    {         this.name = name;
    }
    public int getDay()
    {         return day;
    }
    public void setDay(int day)
    {         this.day = day;
    }      public String getMonth()
    {         return month;
    }
    public void setMonth(String month)
    {         this.month = month;     }
    @Override
    public String toString()
    {         return  name + " : " + month + " : " +day  ;      }
    public static void main(String arg[])
    {
        Holiday [] holidays=new Holiday[5];
        holidays[0]=new Holiday("May Day",1,"may");
        holidays[1]=new Holiday("Independence Day",4,"july");
        holidays[2]=new Holiday("Happy Day",1,"jun");
        holidays[3]=new Holiday("Kushan Day",1,"may");
        holidays[4]=new Holiday("Womans Day",4,"jan");
        for (int i=0;i<holidays.length;i++)
        {             System.out.println(holidays[i]);
        }
        System.out.println(inSameMonth(holidays[0],holidays[3]));
        System.out.println(avgDate(holidays));
    } }



