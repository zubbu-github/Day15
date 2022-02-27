package day15;

import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {

	public static void main(String[] args) {
          Vector<String> vector = new Vector<>();
          
          vector.add("ABC");
          vector.add("DEF");
          vector.add("GHI");
          vector.add("JKL");
          vector.add("MNO");
          
          Enumeration<String> elements = vector.elements();
          while(elements.hasMoreElements()) {
        	  String  n = elements.nextElement();
              System.out.println(n);
              if(n == "MNO")
            	  vector.remove("MNO");
                  
          }
          System.out.println("************************");
          System.out.println(vector);
	}
}
