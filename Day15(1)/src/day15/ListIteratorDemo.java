package day15;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorDemo {

	public static void main(String[] args) {
		
		List<Student> stdList = new ArrayList<>();
		
		stdList.add(new Student( 1 , "Zubeir", 86.52, "zubbu@email.com"));
		stdList.add(new Student( 2 , "Manoj", 70.00, "manoj@email.com"));
		stdList.add(new Student( 3 , "Tariq", 65.50, "tariq@email.com"));
		stdList.add(new Student( 4 , "Vaishali", 85.2, "vaishali@email.com"));
		stdList.add(new Student( 5 , "Goldie", 88.32, "goldie@email.com"));
		
		iterateListUsingListIterator(stdList);
		//additerateListUsingListIterator(stdList);
	}
	private static void iterateListUsingListIterator(List<Student> stdList) {
		     ListIterator<Student> listIterator = stdList.listIterator();
		     System.out.println("Forward Direction");
		     while(listIterator.hasNext()) {
		    	 Student student = listIterator.next();
		    	 System.out.println(student);
		     }
		     System.out.println("**********************************");
		     System.out.println("Backward Direction");
		     while(listIterator.hasPrevious()) {
		    	 Student student = listIterator.previous();
		    	 System.out.println(student);
		     }
	}
	private static void additerateListUsingListIterator(List<Student> stdList) {
		 ListIterator<Student> listIterator = stdList.listIterator();
		 while(listIterator.hasNext()) {
	    	 Student student = listIterator.next();
	    	 if(!student.getName().equalsIgnoreCase("Mansi")) {
	    		 listIterator.add(new Student( 6, "Mansi", 90.0, "mansi@gmail.com"));
	    		 break;
	    	 }
         }
		 for(Student student : stdList) {
    		 System.out.println(student);
    	 }
}
}