package Collections;
import java.util.*;
public class ListCollection {
	
	public void ListColl()
	{
		//ListArray Adding Objects to it in disorder and Indexing them to store in ordered manner
		ArrayList<Object> AL=new ArrayList<Object>();
		AL.add("Hello");
		AL.add(new Integer(180002));
		AL.add(1, "Well Come to the ListCollection");
		AL.add(2, "Kiran");
		
		System.out.println("Size of the ArrayList is: " +AL.size());
		System.out.println("Elements of the ArrayList are");
		System.out.println(AL);
		System.out.println("");
		
		//Adding one extra element to the existing list and displaying both results(lists)
		AL.add("is your login id");
		System.out.println("After Adding an element to the existing ArrayList");
		System.out.println(AL);
		System.out.println("");
		
		//Removing the one element from ListCollection
		AL.remove("Kiran");
		System.out.println("After removing an element to the existing ArrayList");
		System.out.println(AL);
		System.out.println("");
		System.out.println("");
		
		//Getting/displaying only one element from the entire list
		String str=new String();
		str=(String)AL.get(1);
		System.out.println(str);
		System.out.println("");
		
		//Boolean function for finding an element in the list
		System.out.print("Containing the given word in updated list is:");
		System.out.println(AL.contains("Hello"));
		System.out.println("");
		
		//Checking whether the list is empty??
		boolean b = AL.isEmpty();
		System.out.print("List is Empty? ");
		System.out.println(b);
		//
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ListCollection Lc=new ListCollection();
		Lc.ListColl();
	}

}
