package CollectionList;

import java.util.ArrayList;
import java.util.Iterator;

public class IntegerArray {

	public static void main(String[] args) {


		ArrayList<Integer> num=new ArrayList<Integer>();
		
		num.add(10);
		num.add(20);
		num.add(30);
		num.add(40);
		System.out.println(num);
		
//		for(int n:num)                    //using foreach loop to print arrayelements
//		{
//			System.out.println(n);
//		}
//		
		Iterator<Integer> it=num.iterator();   //iterator() is a method
		while(it.hasNext())                     //hasNext() methor to check if it has next element
		{             
			System.out.println(it.next());
		}
	}

}
