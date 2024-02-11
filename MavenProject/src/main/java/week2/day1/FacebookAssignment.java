package week2.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebookAssignment {

	public static void main(String[] args)throws InterruptedException  {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		Thread.sleep(1000);
		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(1000);
		driver.findElement(By.name("firstname")).sendKeys("selvi"); 
		Thread.sleep(1000);
		driver.findElement(By.name("lastname")).sendKeys("balamurugan");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email__")).sendKeys("selvibala1.it@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_email_confirmation__")).sendKeys("selvibala1.it@gmail.com");
		Thread.sleep(1000);
		driver.findElement(By.name("reg_passwd__")).sendKeys("Selvibala@123");
		
		Thread.sleep(1000);
		
		Select selBirthDay = new Select(driver.findElement(By.name("birthday_day")));
	    Thread.sleep(1000);
		selBirthDay.selectByVisibleText("12");

	    Select selBirthMonth = new Select(driver.findElement(By.name("birthday_month")));
	   Thread.sleep(1000);
	    selBirthMonth.selectByValue("5");

	    Select selBirthYear = new Select(driver.findElement(By.name("birthday_year")));
	    Thread.sleep(1000);
	    selBirthYear.selectByValue("1993");    
	    
	    driver.findElement(By.xpath("//input[@name='sex'][@value='1']")).click();
	    
	    Thread.sleep(1000);  
	    
	    driver.findElement(By.name("websubmit")).click();   
		    
	    
	    
	    
		
		
	}

}
