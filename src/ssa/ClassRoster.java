package ssa;

import java.util.ArrayList;
import java.util.Collections;

public class ClassRoster {

	public void classRosterReport() {
		ArrayList<String> classList = new ArrayList<String>();
		classList.add("Joshua");
		classList.add("Michael S");
		classList.add("Jarrett");
		classList.add("Karen");
		classList.add("Shaquil");
		classList.add("Aisha");
		classList.add("Evan");
		classList.add("Daniel");
		classList.add("Kevin");
		classList.add("Joseph");
		classList.add("Li");
		classList.add("Steven");
		classList.add("Stephen");
		classList.add("Peter");
		classList.add("Michael C.");
		classList.add("Reuben");
		classList.add("Dax");
		classList.add("Arun");
		classList.add("Gabriel");
		classList.add("Jonathan");
		classList.add("Kyle");

		Collections.sort(classList);
		System.out.println("The Class Roster in Alphabetical order is: ");
		System.out.println("\n");
		
		for(String cl : classList) {
			System.out.println(cl);
		}
		System.out.println("\n");
		System.out.println("*******************************************");
		
		int classCount = classList.size();
		System.out.println("Total number of students is " + classCount + ".");
		System.out.println("*******************************************");

		Collections.sort(classList, Collections.reverseOrder());
		System.out.println("The Class Roster in Reverse Alphabetical order is: ");
		System.out.println("\n");
		
		for(String lc : classList)
		System.out.println(lc);
		System.out.println("\n");
		System.out.println("*******************************************");
	}
	
			
	}
	