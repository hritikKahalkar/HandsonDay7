/*3) Create a Collection called TreeSet which is capable of storing String objects. Then try these following operations :

a) Reverse the elements of the Collection.

b) Iterate the elements of the TreeSet using Iterator.

c) Check if a particular element exists or not.

*/

import java.util.*;
public class TreeSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> t = new TreeSet<>();
		
		t.add("Ram");
		t.add("Shyam");
		t.add("Tanu");
		
		System.out.println(t.descendingSet());
		 Iterator<String> it= t.iterator();

		 while(it.hasNext())

		 {

		 System.out.println(it.next());

		 }
		 
		 


	}

}
