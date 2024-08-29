package com.prowings.polymorphism.overloading;

public class OverloadingDemo3 {
	
	public static void main(String[] args) {
        testMethod('a');
    }
//
//    public static void testMethod(char c) {
//        System.out.println("char");
//    }

    public static void testMethod(int i) //char can be converted to int by implicit promotion
    {
        System.out.println("int");
    }

}
