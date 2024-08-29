 package com.prowings.encapsulation;

public class Encapsulation {
	
	private int empId;
	private String empName;
	private String address;
	private int salary;
	
	public int getEmpId () {
		return empId;
			
	}
	public void setEmpId(int eid) {
		this.empId = eid;
	}
	
	public String getAddress() {
		return address;
	}
    public void setAddress(String addr) {
    	this.address = addr;	
    }
    
    public String getEmpName() {
    	return empName + " Shyam";
    }
    
    public void setEmpName(String name) {
    	this.empName = name;
    	
    }
    public int getSalary() {
    	return salary;
    }
    public void setSalary(int sal) {
    	this.salary = 10 + sal;
    }
    
    public static void main(String[] args) {
    	
		Encapsulation enc = new Encapsulation();
		
		//setting values using setter method:
		enc.setEmpId(10);
		enc.setAddress("Pune");
		enc.setEmpName("Ram");
		enc.setSalary(90000);
		
		//getting values using getter method:
		System.out.println(enc.getEmpId());
		
		System.out.println(enc.getEmpName());
		
		System.out.println(enc.getAddress());
		
		System.out.println(enc.getSalary());
		




		
	}
}
