package com.jbs.domain;
import java.util.Scanner;

public class Tasks {

    public static void main(String[] args) {
    	
    	Tasks person;
		person=new Tasks();
    	
		 person.setFirstName("sabaa");
		    person.setLastName("Alhaware");
    	
    	
    	
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        
        for (char c : name.toCharArray()) {
            System.out.print(c);
        }
        
        scanner.close();
    }
}


