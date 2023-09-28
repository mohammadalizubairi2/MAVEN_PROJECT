package com.learn_Abstraction;

public interface Abstract_Methods {
	default void sectret() {} //non static methods have to have default access modifier.
	
	public static void brake() {} // All modifiers other than default, has to have a static keyword for bodied methods.
	
	private static void game() {} // private was allawed after java 9.



}
