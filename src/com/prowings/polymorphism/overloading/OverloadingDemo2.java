package com.prowings.polymorphism.overloading;

public class OverloadingDemo2 {
	
	   
	    public static void testMethod(double d) {
	        System.out.println("double");
	    }

	    public static void testMethod(float f) {
	        System.out.println("float");
	    }

	    public static void testMethod(Number n) {
	        System.out.println("Number");
	    }
	    
	    public static void main(String[] args) {
	    	testMethod(5.5);
	    }

	}


