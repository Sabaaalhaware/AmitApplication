package com.jbs.b;


public class B {
	
	private String nameB;
	protected int age;
	public double phone;
	
	 public  void setNameB(String nameB) {
		 this.nameB=nameB;
	 }
	 
	 protected void setAge(int age) {
		 this.age=age;
	 }
	 
	 public void setphone(double phone) {
		 this.phone= phone;
		 
	 }
	 
	 public String  getNameB() {
		 return nameB;
	 }
	 
	public int getage() {
		return age;
	}
	 
    public double getphone() {
			return phone;
		}
    
    public static void main(String[] args) {
    
    	B b1 =new B();
    	
    	b1.setAge(10);
    	b1.setNameB("sabaa");
    	b1.setphone(778932171);
    	
    	
    	
    	
    	
    	
    	/*Superclass B1;
    	B1 = new Superclass();
    	
    	Subclass B2;
    	B2 =new Subclass();*/
    	
    }
    
     
     
     
     
    
    
		
	

}
