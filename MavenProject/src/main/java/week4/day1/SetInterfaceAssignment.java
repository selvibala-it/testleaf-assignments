package week4.day1;

import java.util.LinkedHashSet;
import java.util.Set;

public class SetInterfaceAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String companyname="google";
		System.out.println("set interface");
		System.out.println("The Unique Charecter:");
		Set<Character> company= new LinkedHashSet<Character>();
		for(char i: companyname.toCharArray())
		{
			company.add(i);
		}
			

	
	for(char i:company) {
		System.out.println(i);
	}

}
}
