package com.prowings.polymorphism.overloading;

public class OverloadingDemo1 {

//	private static int m1(int a) {
//
//		System.out.println("inside m1 (int a) method");
//		return 20;
//	}

	public static void m1(int i) {
		System.out.println("inside m1 (Long a) method");

	}
//
//	public static void m1(Number a) {
//		System.out.println("inside m1 (Number a) method");
//
//	}

//	public static void m1(Object a) {
//		System.out.println("inside m1 (Object a) method");
//
//	}
//
//	public static void m1(double a) throws RuntimeException {
//		System.out.println("inside m1 (double a) method");
//
//	}

	public static void main(String[] args) {

		System.out.println("main started");
		OverloadingDemo1 obj = new OverloadingDemo1();
		int i = 10;
		OverloadingDemo1.m1(i);
		System.out.println("main ended");
	}
}
