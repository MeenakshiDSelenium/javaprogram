package com.java;



class Derived 
{
    public void getDetails()
    {
        System.out.printf("Derived class ");
    }
}
 
public class Demo extends Derived
{
    public void getDetails()
    {
        System.out.printf("Test class ");
        super.getDetails();
    }
    public static void main(String[] args)
    {
        Derived obj = new Demo();
        obj.getDetails();
    }



	}


