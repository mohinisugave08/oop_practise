package com.prowings.polymorphism.overriding;

public class OverridingChild extends OverridingParent {
public static void m1() {
	System.out.println("Inside child - m1()");
	
		
	}
// Co-varient return type
	public Integer m2() {
		System.out.println("Inside child - m2()");
		return 3;
		
	}
	
	public static void main(String[] args) {
		OverridingParent parent = new OverridingParent();
		parent.m1();
		OverridingChild child = new OverridingChild();
	
		child.m2();
	}
}
