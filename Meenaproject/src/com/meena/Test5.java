package com.meena;

import java.util.ArrayList;
import java.util.Iterator;

public class Test5 {

	public static void main(String[] args) {
		Student s1=new Student(111,"meena",25);
		Student s2=new Student(112,"hema",30);
		Student s3=new Student(111,"obu",23);
		ArrayList<Student> al=new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		Iterator it=al.iterator();
		while(it.hasNext()){
			Student st=(Student)it.next();
			System.out.println(st.rollno+""+st.name+""+st.age);
				
		}

	}

}
