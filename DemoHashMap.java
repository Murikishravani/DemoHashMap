package collections;
import java.util.HashMap;
public class DemoHashMap {
	public static void main(String args[]) {
		//creating a HashMap to store countries and their codes
		HashMap<String,Integer> countryCodes=new HashMap<String,Integer>();
		//Inserting the country codes with their corresponding countries
		countryCodes.put("US",1);
		countryCodes.put("India",91);
		countryCodes.put("China",86);
		countryCodes.put("Australia",61);
		countryCodes.put("Egypt",20);
		System.out.println(countryCodes);
		//Using the isEmpty()method to check the countryCode is empty
		System.out.println(countryCodes.isEmpty());
		countryCodes.put("Brazil",55);
		countryCodes.put(null, 0);
		//To Print the CountryCodes
		System.out.println(countryCodes.values());
		//To Print the CountryCode of "US"
		System.out.println(countryCodes.get("US"));
		//To Print the size of the HashMap
		System.out.println(countryCodes.size());
		//Using remove() method removing the country and countryCode
		System.out.println(countryCodes.remove("Egypt",20));
		//To Print the countryCodes and countries
		System.out.println(countryCodes);
	}

	}


