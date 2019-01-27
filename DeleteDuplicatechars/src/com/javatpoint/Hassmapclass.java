package com.javatpoint;



public class Hassmapclass {

	public static void main(String[] args) {
/**HashMap <Integer,String> m=new HashMap<Integer,String>();
		
		
		m.put(1,"aaaa");
		m.put(2,"bbb");
		m.put(3,"ccc");
		m.put(4,"eee");
		
		//System.out.println(m);
		Iterator it=m.entrySet().iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
			
		}
		**/
		
		String s="hai meena how are u";
		String [] words=s.split(" ");
		for(int i=0;i<words.length;i++) {
			String word=words[i];
			for(int j=0;j<word.length();j++) {
				if(j==1) {
					String s1="";
					s1=s1+word.charAt(j);
					System.out.println(s1);
				}
				
			}
			
		}
		
	}

}
