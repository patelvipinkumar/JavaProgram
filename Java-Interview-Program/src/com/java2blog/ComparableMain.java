package com.java2blog;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Country implements Comparable{
    int countryId;
    String countryName;
   
   
    public Country(int countryId, String countryName) {
        super();
        this.countryId = countryId;
        this.countryName = countryName;
    }


	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		Country c=(Country) o;
		
		if(this.countryId==c.countryId) {
			return 0;
		}
		else if(this.countryId>c.countryId) {
			return 1;
			
			}
		else 
			return -1;
	}
    
}
public class ComparableMain {
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		Country indiaCountry=new Country(1, "India");
		Country chinaCountry=new Country(4, "China");
		Country nepalCountry=new Country(3, "Nepal");
		Country bhutanCountry=new Country(2, "Bhutan");
		
		List<Country> listOfCountries = new ArrayList<>();
		listOfCountries.add(indiaCountry);
		listOfCountries.add(chinaCountry);
		listOfCountries.add(nepalCountry);
		listOfCountries.add(bhutanCountry);
		Collections.sort(listOfCountries);
		 
		System.out.println("After Sort  : ");
		for (int i = 0; i < listOfCountries.size(); i++) {
			Country country=(Country) listOfCountries.get(i);
			System.out.println("Country Id: "+country.countryId+"|| "+"Country name: "+country.countryName);
		}
	}

}
