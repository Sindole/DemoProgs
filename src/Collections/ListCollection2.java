package Collections;
import java.util.*;

public class ListCollection2 {

	public void List()
	{
	ArrayList<Object> list=new ArrayList<Object>();
	list.add("Hello");
	list.add(new Integer(180002));
	list.add(1, "Well Come to the ListCollection");
	list.add(2, "Kiran");
	
	System.out.println("Size of the ArrayList is: " +list.size());
	System.out.println("Elements of the ArrayList are");
	System.out.println(list);
	System.out.println("");
	
	//Adding elements from other class and displaying all together
	list.add(new Employee (1001,"Sindole"));
	System.out.println(list);
	System.out.println("");
	
	System.out.println("Displaying Elements using Traversars-Adv.ForLoop");
	System.out.println("******------------------------------------******");
	for(Object obj:list)
	{
		System.out.println(obj);

	}
	System.out.println("");
	
	//Iterator 
	System.out.println("Displaying Elements using Traversars-Iterator");
	System.out.println("******------------------------------------******");
	
	Iterator itr=list.iterator();
	while(itr.hasNext())
	{
		System.out.println(itr.next());
	}
	System.out.println("");
	
	System.out.println("Displaying Elements using Traversars-List.Iterator");
	System.out.println("******------------------------------------********");
	ListIterator litr=list.listIterator();
	while(litr.hasNext())
	{
		System.out.println(litr.next());
	}
	
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ListCollection2 lc=new ListCollection2();
lc.List();
	}

}
