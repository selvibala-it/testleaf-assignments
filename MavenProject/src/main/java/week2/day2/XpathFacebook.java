package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathFacebook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		//driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("selvi_bala@hotmail.com");
			driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("123selvi");
			driver.findElement(By.xpath("//button[@name='login']")).click();
			
	}

}
