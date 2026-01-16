package CollectionList;

import java.util.ArrayList;
import java.util.Collections;

public class ArryListSample {

	public static void main(String[] args) {
		
		ArrayList<String> fruits=new ArrayList<String>();
		
		fruits.add("banana");     //add elements to arraylist
		fruits.add("apple");
		fruits.add("orange");
		fruits.add("mango");
		
		System.out.println(fruits);
		
		fruits.add(0,"kiwi");    //add elements based on index
		System.out.println(fruits);
		
		System.out.println(fruits.get(2));  //get elements from arraylist
		
		fruits.set(2,"grapes");    //replace elements in arraylist
		System.out.println(fruits);
		
		fruits.remove(3);     //remove based on index
		System.out.println(fruits);
		
		System.out.println(fruits.size());   //to return size. number of elements in a list
		
		//fruits.clear();       //clear elements in a a list
		//System.out.println(fruits);
		Collections.sort(fruits);
		System.out.println(fruits);
		
		for(int i=0;i<fruits.size();i++)
		{
			System.out.println(fruits.get(i)); //To print arraylist elements we use get method
		}
		
		for(String f:fruits)              //foreach loop
		{
			System.out.print(f+",");
		}
		
		
	}

}
