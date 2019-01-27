package com.meena;

public final class Immutable{
	 private final int a;
	    private final String name;

	    public Immutable(int a, String name) {
	        this.a = a;
	        this.name = name;
	    }
	  
	    public int getName(){
	        return a;
	    }
	  
	    public String getname(){
	        return name;

}
}
