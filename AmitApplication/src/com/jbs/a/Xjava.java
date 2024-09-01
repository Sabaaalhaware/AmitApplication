package com.jbs.a;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import org.w3c.dom.Node;
import org.w3c.dom.Element;
import java.io.File;


public class Xjava {
	//private static final String FILENAME ="C:\\Users\\sabaa\\Desktop\\java program\\Data.xml";
 
public static void main(String[] args){
	
	try {
		
	//File file = new File("C:\\Users\\sabaa\\Downloads\\sabaa.xml");
	
	DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
	DocumentBuilder builder = factory.newDocumentBuilder();
	
	Document document = builder.parse("C:\\\\Users\\\\sabaa\\\\Downloads\\\\sabaa.xml");
	
	
	//document.getDocumentElement().normalize();
	Element root = document.getDocumentElement();
	NodeList nodelist = root.getChildNodes();
	
	
	for(int i =0 ; i<nodelist.getLength();i++) {
		
		Node node = nodelist.item(i);
		
		if(node.getNodeType() == Node.ELEMENT_NODE) {
			Element element = (Element) node;
			String tagName=element.getTagName();
			String textContent=element.getTextContent();
			
			//String data = element.getElementsByTagName("").item(0).getTextContent();
			
		System.out.println("Tag Name:"+ tagName);
		System.out.println("Text Content:"+ textContent);
		
		
	}
		}
	}
	
	catch(Exception e )
	{
		e.printStackTrace();
	}
	
	}
	

}












  /*  public static void main(String[] args) throws IOException {
 
        FileReader in = null;
        FileWriter out = null;
 
        try {
            in = new FileReader("C:\\Users\\sabaa\\Desktop\\java program\\Data.xml");
            out = new FileWriter("C:\\MyFiles\\ouput.txt");
            int c;
 
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        }
        catch(IOException e) {
            System.out.println("There is IOException!");
        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
 
    }*/

