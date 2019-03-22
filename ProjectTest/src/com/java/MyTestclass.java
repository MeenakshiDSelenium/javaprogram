package com.java;


 abstract class MyAbstractClass {
    private String name;

    public MyAbstractClass(String name)
    {
        this.name = name;
    }

    public String getName(){
        return this.name;
    }


}



public class MyTestclass extends MyAbstractClass  {

    public MyTestclass(String name) {
		super(name);
		
	}

	public static void main(String [] args)
    {
        MyAbstractClass ABC = new MyAbstractClass("name") {
        };

        System.out.println(ABC.getName());
    }




	}


