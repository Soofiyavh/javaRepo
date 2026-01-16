package CollectionList;

import java.util.HashSet;
import java.util.Set;

public class SetSample {

	public static void main(String[] args) {

		Set<String> names=new HashSet<>();

		names.add("Vinisha");
		names.add("Athira");
		names.add("Soofiya");
		names.add("Nithya");
		
		System.out.println(names);
		
		names.add("Nithya");   //duplicates not allowed in sets
		
		System.out.println(names.contains("Soofiya"));  //returns true if it contains the string
		
		names.remove("Vinisha");    //To remove a string from set
		System.out.println(names);
		
		for(String s:names)
		{
			System.out.println(s);
		}
		
		System.out.println(names.isEmpty());  //to check if set is empty or not.
		
		
		System.out.println(names.size());  //To get size of set
		
		Set<String> moreNames=new HashSet<>();
		
		moreNames.add("Athira");
		moreNames.add("Shilpa");
		
		names.addAll(moreNames);    //Adds both sets into names
		System.out.println("After adding bothe sets: "+names);
		
		Set<String> temp=new HashSet<>(names);
		temp.retainAll(moreNames);            //keeps only common elements
		System.out.println("After retainall(): "+temp);
	
		Set<String> temp2=new HashSet<>(names);
		temp2.removeAll(moreNames);            //removes common elements
		System.out.println("After removeall(): "+temp2);
		
		names.clear();               //to clear sets
		System.out.println("After clear(),is names empty? "+names.isEmpty());
		
		
		
	}

}
