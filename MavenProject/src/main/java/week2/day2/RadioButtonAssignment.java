package week2.day2;

import org.openqa.selenium.By;
import java.awt.List;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonAssignment {

	public static void main(String[] args) {
				ChromeDriver driver=new ChromeDriver();
		        driver.manage().window().maximize(); 
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        driver.get("https://www.leafground.com/radio.xhtml");
		        driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[1]/div[1]/div[2]")).click();
		        driver.findElement(By.xpath("//table[@id='j_idt87:console1']/tbody[1]/tr[1]/td[1]/div[1]/div[2]")).click();
		        Boolean enable= driver.findElement(By.xpath("//table[@id='j_idt87:console2']/tbody[1]/tr[1]/td[3]/div[1]/div[2]/span[1]")).isDisplayed();
		        System.out.println("The radio button Enabled:"+enable);
		        String safari = driver.findElement(By.xpath("//label[@for='j_idt87:console2:2']")).getText();
		        System.out.println("The radio button Selected is:"+safari);
		        String years = driver.findElement(By.xpath("//label[@for='j_idt87:age:1']")).getText();
		        System.out.println("The Selected Age Group is: "+years);
		        Boolean select=driver.findElement(By.xpath("//div[@id='j_idt87:age']/div[1]/div[2]/div[1]/div[2]/span[1]")).isDisplayed();
		        if(select==true)
		        {
		        	System.out.println("The Radio button is Selected: "+select);    	
		        }
		        else
		        {
		        	System.out.println("The Radio button is not Selected: "+select);
		        }
		        driver.close();
			}

		
		

	}


