package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortingString {

	public static void main(String[] args) {
		 List<String> arrayList = new ArrayList<String>(); 
	     arrayList.add("HCL");
	     arrayList.add("WIPRO");
	     arrayList.add("ASPIRE SYSTEMS");
	     arrayList.add("CTS");
	     System.out.println("Elements in the Array: "+arrayList);
	     Collections.sort(arrayList); 
	     System.out.println("Sorted Array is: "+arrayList);
	     System.out.println("Array List Size: "+arrayList.size());
	     System.out.println("Reverse Order of the Array:");
	     int a=arrayList.size()-1;
	     for(int i=a;i>=0;i--)
	        {
	        	System.out.print("\t"+arrayList.get(i));
	        }

	}

}