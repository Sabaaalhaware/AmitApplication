package com.jbs.domain;

public class MyObj {
	
	private String name;
	
	public String getName(){
		return name;
		
	} 
	
	public void setName(String newName) {
		
		this.name = newName;
	}
	
	 public MyObj() {
		 z=40;
		
	 }
	int x = 5;
	int y = 4;
	int z ;
	
	static void myMethod() {
		System.out.print("hello");
	}

	public void myPbublicMethod() {
		System.out.print("welcome");
	}
	
	
	
	public static void main(String[] args) {
		 MyObj Main1 = new MyObj();
		 MyObj Main2 = new MyObj();
		 MyObj Main3 = new MyObj();
	
		 
		 Main1.x=50;
		 
		 System.out.println(Main1.x);
		 System.out.println(Main2.y);
		 System.out.println(Main3.z);

		 MyObj myMethod = new MyObj();
		 myMethod.myPbublicMethod();
		

	}

}
