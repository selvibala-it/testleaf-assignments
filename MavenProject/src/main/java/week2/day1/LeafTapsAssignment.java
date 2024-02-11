package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class LeafTapsAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps");
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.id("accountName")).sendKeys("selvi");
		driver.findElement(By.name("groupNameLocal")).sendKeys("selvi");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		Select industryEnumId = new Select(driver.findElement(By.name("industryEnumId")));
		industryEnumId.selectByValue("IND_SOFTWARE");
		
		
		Select ownershipEnumId = new Select(driver.findElement(By.name("ownershipEnumId")));
		ownershipEnumId.selectByValue("OWN_SCORP");
		
		Select indusdataSourceIdtry = new Select(driver.findElement(By.name("dataSourceId")));
		indusdataSourceIdtry.selectByValue("LEAD_EMPLOYEE");
		
		Select marketingCampaignId = new Select(driver.findElement(By.name("marketingCampaignId")));
		marketingCampaignId.selectByValue("9000");
		
		Select generalStateProvinceGeoId = new Select(driver.findElement(By.name("generalStateProvinceGeoId")));
		generalStateProvinceGeoId.selectByValue("TX");
		driver.findElement(By.className("smallSubmit")).click();
		
		    
	}
	
}
 