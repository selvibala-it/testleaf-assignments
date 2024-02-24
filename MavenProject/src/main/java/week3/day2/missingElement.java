package week3.day2;

import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class missingElement 
	{
		public static void main(String[] args)
		{
		     List<Integer> arrayList = new ArrayList<Integer>(); 
		     List<Integer> newlist=new ArrayList<Integer>();
		     arrayList.add(1);
		     arrayList.add(2);
		     arrayList.add(3);
		     arrayList.add(4);
		     arrayList.add(10);
		     arrayList.add(6); 
		     arrayList.add(8); 
		     System.out.println("Elements in the Array: "+arrayList);
		     Collections.sort(arrayList); 
		     System.out.println("Sorted Array is: "+arrayList);
		     for (int j = 1; j <=10; j++)
		     {
		    	   if (!arrayList.contains(j))
		    	   {
		    	      newlist.add(j);
		    	   }
		    }
		     System.out.println("Missed Numbers are: "+newlist);      
		     
	        }		
			}
	             
		

		
