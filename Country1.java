/*1)Develop a java class with a instance variable H1 (HashSet) add a method saveCountryNames(String CountryName) ,

the method should add the passed country to a HashSet (H1) and return the added HashSet(H1).

Develop a method getCountry(String CountryName) which iterates through the HashSet and

returns the country if exist else return null.*/

import java.util.*;
class Country{
	HashSet<String> h = new HashSet<>();
	public HashSet<String> saveCountryNames(String CountryName){
		h.add(CountryName);
		return h;
	}
	public String getCountry(String CountryName) {
		
		Iterator<String> it = h.iterator();
		
		while(it.hasNext()) {
		if(it.next().equals(CountryName))
			return CountryName;
		}
		return null;
	}

}


public class Country1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Country con = new Country();
		con.saveCountryNames("India");
		con.saveCountryNames("USA");
		con.saveCountryNames("Russia");

		System.out.println(con.getCountry("India"));
		System.out.println(con.getCountry("USA"));
		System.out.println(con.getCountry("China"));

	}

}
