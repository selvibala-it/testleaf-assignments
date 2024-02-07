package week1.day2;
import java.util.Arrays;



public class FindMissingNumber
{

public static void main(String[] args)
{
	int[] num= {1,3,2,4,6};
	Arrays.sort(num);
	System.out.println("The missing number is:");
	
	for(int i= num[0] ;i<num.length;i++)
	{
	if(i+1 != num[i]) {
		System.out.println(i+1);
	}
		
	}
}	
}
		
		       
		   
		
	

		// TODO Auto-generated method stub

	

