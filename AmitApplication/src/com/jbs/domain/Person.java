package com.jbs.domain;

public class Person {




	protected String firstName;
	private String lastName;
	private int age;
	private int phone;


	public Person() {
// can not  be private or protected
	}

	 public Person (String newName) {

		firstName=newName ;

	}
	 
	
	/*	public  Person(double newAge) {


	}*/


	public void printIfo() {
		System.out.println("name:" + firstName);

	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPhone() {
		return phone;
	}

	public void setPhone(int phone) {
		this.phone = phone;
	}

	/*public void setAllAttributes(String newfirstName , String newlastName , int newage , int newphone){

			this.firstName=newfirstName;
			this.lastName=newlastName;
			this.age=newage;
			this.phone=newphone;


		}*/






}
