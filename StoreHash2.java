/*2)Write a program to store a group of employee names into a HashSet, retrieve the elements one by one using an Iterator.
*/

import java.util.*;
public class StoreHash2 {

	public static void main(String[] args) {
		
		HashSet<String> h = new HashSet<>();
		
		h.add("Rahul");
		h.add("Ram");
		h.add("Ramesh");
		h.add("Rakesh");

 Iterator<String> it = h.iterator();
		
		while(it.hasNext()) {
			
			System.out.println(it.next());

		} 
	}

}
