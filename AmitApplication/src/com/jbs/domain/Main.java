package com.jbs.domain;

//import java.util.Hashtable;


public class Main {

	public static void main(String[] args) {
		
		
   for(int i=1 ; i<=10 ; i++) {
	   
	   if(i==3){
		   continue;
		   
	   }	
	   
	   System.out.println(i);
   }	
   
   for(int i=1 ; i<=10 ; i++) {
	   
	   if(i==3) {
		   break;
	   }
	   System.out.println("sabaa");
   }
   
   
   
   
   
   
   int y=1;
   while(y<=5) {
	   
	   if(y==3) {
		   break;
	   }
	   
	   System.out.println("Hello");
	   y++;
	   
   }
  
   
  int x=1;
   
   do {
	   
	   if(x==3) {
		   break;
	   }
	   System.out.println(x);
	   x++;  
   }
   
   while(x<=10);
   
		
    Person person;
    person=new Person();
    
    
   
    Person print;
    print = new Person();
    
    print.printIfo();
    
    
 
    
    
  //  person.age=15;  
    
   
    
   // person.setAllAttributes("sabaa", "alhaware", 22 , 778932171);
    
    person.setFirstName("sabaa");
    person.setLastName("Alhaware");
    person.setAge(22);
    person.setPhone(778932171);
    
    
    
   // person.toString();
    
    
    
    System.out.println("firstName :" + person.getFirstName()  + "\n"+
    "lastName: " + person.getLastName() +"\n"+
    "Age: "+person.getAge() +"\n"+
    "phone: "+person.getPhone());
    
    
    
    
	}

}
