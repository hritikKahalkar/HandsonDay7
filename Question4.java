/*iterationg the months by iterator*/

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Question4{

 public static void main(String args[]){

 List <String> al = new LinkedList<>(); 

 al.add("January"); 
 al.add("February");
 al.add("March");
 al.add("April");
 al.add("May");
 al.add("June");
 al.add("July");
 al.add("August");
 al.add("September");
 al.add("October");
 al.add("November");
 al.add("December");
 
 Iterator<String> it= al.iterator();

 while(it.hasNext())

 {

 System.out.println(it.next());

 }
 }
}