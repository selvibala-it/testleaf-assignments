package week3.day1;

public class ChangeOddUppercase {

	public static void main(String[] args) {
	
		String companyName="changeme";
		 
		        char[] charArray=companyName.toCharArray();
		        
		  

		        for (int i = 0; i < charArray.length; i++) {
					if ((i%2)!=0) {
						System.out.print(Character.toUpperCase(charArray[i]));
					}
					else {
						System.out.print(charArray[i]);
					}
			}

		

	}
}

