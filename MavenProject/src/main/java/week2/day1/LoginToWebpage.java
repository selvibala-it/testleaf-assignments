package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginToWebpage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		//driver.manage().window().maximize();
		driver.findElement(By.id("email")).sendKeys("selvi_bala@hotmail.com");
			driver.findElement(By.id("pass")).sendKeys("123selvi");
			driver.findElement(By.name("login")).click();
			
		
		//driver.close();
	}

}
