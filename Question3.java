/*List to store numeric data*/

import java.util.ArrayList;
import java.util.List;

public class Question3 {
  public static void main(String a[]) {
    List <Number> al = new ArrayList<>();
    al.add(44); 
    al.add(58.66f);
    al.add(58.66f);
    al.add(3.14D);
    al.add(7000000);

    
    System.out.println(al);

    for(int i=0; i<al.size(); i++) {
      System.out.print(" "+al.get(i));
    }
  }
}