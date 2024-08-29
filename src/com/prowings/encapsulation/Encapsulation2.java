package com.prowings.encapsulation;

public class Encapsulation2 {
	private String studentName;
	private int rollNumber;
	private int marks;
	private boolean result;

	public String getStudentName() {
		return studentName;

	}

	public void setStudentName(String name) {
		this.studentName = name;
	}

	public int getRollNumber() {
		return rollNumber;
	}

	public void setRollNumber(int rn) {
		this.rollNumber = rn;
	}

	public int getMarks() {
		return marks;

	}

	public void setMarks(int mrks) {
		this.marks = mrks;
	}

	public boolean getResult() {
		return result;
	}

	public void setResult(boolean res) {
		this.result = res;
		if (marks > 35) {
			System.out.println("You are Pass!!");
		} else {
			System.out.println("You are fail!!");
		}
	}

	public static void main(String[] args) {
		Encapsulation2 enc = new Encapsulation2();

		enc.setStudentName("Ram");
		enc.setRollNumber(17);
		enc.setMarks(88);
		enc.setResult(true);

		System.out.println(enc.getStudentName());
		System.out.println(enc.getRollNumber());
		System.out.println(enc.getMarks());
		System.out.println(enc.getResult());

	}

}
