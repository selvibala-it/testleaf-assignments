package week1.day2;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input=343;
		int output=0;
		int reminder;
		int temp=input;
		
	
		while(input>0)
		{
			reminder=input%10;
			output=(output*10)+reminder;
			input=input/10;
		}
			if(output==temp) {
				System.out.println("The number is palindrom");
			}
			else {
				System.out.println("The number is not palindrom");
			}
		}

	}


