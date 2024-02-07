package week1.day2;

public class IsPrimeNumber {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
int number=11; 
int  count=0; 
 
 
	
for(int i=1;i<=number;i++){ 
	
    if(number%i==0){  
    	count++;
    }    
   }  
if(count == 2) {
	System.out.println("Given number is Prime");
}
else {
	System.out.println("Given number is Not a Prime");
}
 


}
	}

