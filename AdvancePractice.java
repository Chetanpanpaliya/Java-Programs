package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class AdvancePractice {

	public static void main(String[] args) {
ArrayList<String> ListofCountries = new ArrayList<String>();
ListofCountries.add("India");
ListofCountries.add("Us");
ListofCountries.add("China");
ListofCountries.add("Canada");
System.out.println("Brfore sorting...!!!");
for(String counter:ListofCountries) {
	System.out.println(counter);
}
Collections.sort(ListofCountries);
System.out.println("after sorting");
for(String counter : ListofCountries) {

System.out.println(counter);
	}
}}
