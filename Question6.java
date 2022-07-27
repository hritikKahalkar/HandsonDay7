/*Employee details by vector*/
import java.util.*;

class Employee {
	private int id;
	private String name;
	private String address;
	private Double salary;
	
	public Employee(int id,String name,String address,Double salary) {
		this.id = id;
		this.name = name;
		this.address = address;
		this.salary = salary;
	}
	
	public int getId() {
		return id;
	}
	
	public String toString() {
		return ("Employee ID : "+id+" | name : "+name+" | address : "+address+" | salary : "+salary);
	}
	
}

public class Question6 {

  public static void main(String a[]) {

    Vector<Employee> emp = new Vector<>();


    emp.add(new Employee(101,"Ram","Delhi",200000.0)); 
    emp.add(new Employee(102,"Shyam","Mumbai",500000.0)); 

    System.out.println("Employee Details : ");
    
    Iterator<Employee> it = emp.iterator();
    int searchID = 101;
    while(it.hasNext()) {
    	Employee e = it.next();
    if(e.getId() == searchID) {
    	System.out.println(emp);
    }
    }

  }

}





