package week3.day2;



	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class secondLargestNumber  {

		public static void main(String[] args) {
			 int temp = 0;
		     List<Integer> arrayList = new ArrayList<Integer>(); 
		     arrayList.add(3);
		     arrayList.add(2);
		     arrayList.add(11);
		     arrayList.add(4);
		     arrayList.add(6);
		     arrayList.add(7); 
		     System.out.println("Elements in the Array: "+arrayList);
		     Collections.sort(arrayList); 
		     System.out.println("Sorted Array is: "+arrayList);
		     temp=arrayList.get(arrayList.size()-2);
		     System.out.print("Second Largest Number in An Array : ");
		     System.out.print(temp);

		}

	}
