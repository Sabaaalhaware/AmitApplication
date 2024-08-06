package com.jbs.domain;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.Path;
import java.util.List;

public class ReadFiles {
	  

	public static void main(String[] args) {
		
		String filePath = "C:\\Users\\sabaa\\git\\repository\\AmitApplication\\src\\com\\jbs\\main\\Main.java";
	        Path path = Paths.get(filePath);
	        
	        try {
	            List<String> lines = Files.readAllLines(path);
	            for (String line : lines) {
	                System.out.println(line);
	            }
	        }
	       catch (IOException e) {
	            e.printStackTrace();
	        }
	    	
	

	}

}
