package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLeadAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement((By.xpath("//span[text()='Phone']"))).click();
		driver.findElement(By.name("phoneCountryCode")).sendKeys("91");
		driver.findElement(By.name("phoneAreaCode")).sendKeys("01");
		driver.findElement(By.name("phoneNumber")).sendKeys("9866557699");
		driver.findElement(By.linkText("Find Leads")).click();
		
		//WebElement headingTable = driver.findElement(By.cssSelector("table.x-grid3-row-table"));
		//WebElement link = headingTable.findElement(By.tagName("a")); 
		
		WebElement txt = driver.findElement((By.xpath("//table[@class = 'x-grid3-row-table']"))).findElement(By.tagName("a"));
		String leadId =  txt.getText();
		
		driver.findElement(By.linkText(leadId)).click();
		driver.findElement(By.linkText("Delete")).click();
		driver.findElement(By.linkText("Find Leads")).click(); 
		
		driver.findElement(By.name("id")).sendKeys(leadId);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		Thread.sleep(5000);
	    String leadRecords= driver.findElement(By.xpath("//div[@class='x-paging-info']")).getText();
	    
	   // System.out.println(leadRecords);
	    
		if(leadRecords.equals("No records to display")) {
			System.out.println("Records deleted successfully");
		}
		else {	
			System.out.println("Error in deleting records");
		}
		

		
		
	}

}
