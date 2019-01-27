package com.meena;

public final class ImmutableEX {
	private final int a;
    private final String s;
    private final Chirag ss;
    public ImmutableEX (int a1, String s1, Chirag ss1){
        this.a = a1;
        this.s = s1;
        this.ss = ss1;         
    }
    public Integer geta() {
        return a;
    }
    public String gets() {
        return s;
    }
     
    public String toString() {
        return a + " - " + s + " - " + ss.age;
    }
    private static void modification(int a2, String s2, Chirag ss2){
        a2 = 20;
        ss2.age = 11;
        s2 = "changed";
    }
    public static void main(String[] args){
        ImmutableEX im = new ImmutableEX(14, "age", new Chirag(20));
        System.out.println(im);
        modification(im.a, im.s, im.ss);
       System.out.println(im);

}
}

class Chirag
{
   public int age;
    
   Chirag(int s)
   {
       this.age = s;
   }

}
