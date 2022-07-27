/*
4)Implement the assignment 1 using TreeSe*/

import java.util.*;

public class TreeSet4{

 public static void main(String args[]){

 TreeSet <String> al = new TreeSet<>(); 

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