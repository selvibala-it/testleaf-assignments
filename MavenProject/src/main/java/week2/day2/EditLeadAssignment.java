package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLeadAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Savitha");
		driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Raman");
		driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("Tleaef");
		driver.findElement(By.xpath("//input[@id='createLeadForm_departmentName']")).sendKeys("Testing");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Good Company");
		driver.findElement(By.xpath("//input[@id='createLeadForm_primaryEmail']")).sendKeys("Testleaf@gmail.com");
		//Thread.sleep(1000);
		Select selState = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
	    selState.selectByVisibleText("New York");
	    driver.findElement(By.name("submitButton")).click();
	    driver.findElement(By.linkText("Edit")).click();
	    driver.findElement(By.name("description")).clear();
	    driver.findElement(By.name("importantNote")).sendKeys("Good Company");
	    driver.findElement(By.name("submitButton")).click();
	    String title=driver.getTitle();
	    System.out.println(title);
	    
		
		

	}

}
