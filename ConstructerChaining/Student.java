package ConstructerChaining;

public class Student {
	
	public Student(String name , int roll){
		
		System.out.println("Student name is : "+name);
		System.out.println("Student Roll Number is : "+roll);
	}

	public Student(String name , int roll , String address) {
		this(name,roll);
		
		System.out.println("Student Address is : "+address);
		
	}
	
	public Student(String name , int roll , String address,long mobile) {
		this (name,roll,address);
		
		System.out.println("Parent Mobile Number is : "+mobile);
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student("Jon maxwell",7,"flat 81 @USA",8854584l);
	}

}
