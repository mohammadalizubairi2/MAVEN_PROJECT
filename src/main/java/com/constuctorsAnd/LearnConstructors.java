package com.constuctorsAnd;

public class LearnConstructors {
	
	String name= "tom";
	int age = 10;
	int rollnumber = 101;

	public static void main(String[] args) {
		
		

		LearnConstructors s1 = new LearnConstructors("Tom",10,101);
		LearnConstructors s2 = new LearnConstructors("Harry", 12, 112);
		
		System.out.println(s1.age + "__" + s1.name + "__" + s1.rollnumber);
		System.out.println(s2.age + "__" + s2.name + "__" + s2.rollnumber);
		
		
		
		
		
		
		
		
	}
	public LearnConstructors(String name, int age, int rollnumber) {
		this.name = name;
		this.age = age;
		this.rollnumber = rollnumber;
		
	}

}
