/*Iterating the months by enum*/

import java.util.Enumeration;
import java.util.Vector;

public class Question5 {

  public static void main(String a[]) {

    Vector v = new Vector();


    v.add("January"); 
    v.add("February");
    v.add("March");
    v.add("April");
    v.add("May");
    v.add("June");
    v.add("July");
    v.add("August");
    v.add("September");
    v.add("October");
    v.add("November");
    v.add("December");


    Enumeration e = v.elements();

    while(e.hasMoreElements()) {

      System.out.println(e.nextElement());

    }

  }

}





