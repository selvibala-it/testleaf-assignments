package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.opentelemetry.exporter.logging.SystemOutLogRecordExporter;

public class CheckBoxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		driver.findElement(By.id("j_idt87:j_idt89")).click();
		driver.findElement(By.id("j_idt87:j_idt91")).click();
		
		driver.findElement(By.xpath("//label[text()='Python']")).click();
		
		Boolean triState = driver.findElement(By.id("j_idt87:ajaxTriState_input")).isSelected();
		if(triState==true) {
			
			System.out.println("Tribox is selected");
		}
		else{
			System.out.println("Tribox is  not selected");
			//driver.findElement(By.id("j_idt87:ajaxTriState_input")).click();
		
		}
		
		//driver.findElement(By.id("j_idt87:j_idt100_input")).click();
		
		   driver.findElement(By.xpath("//div[@id='j_idt87:j_idt100']//div[2]")).click();
		
		Boolean chkState = driver.findElement(By.id("j_idt87:j_idt102_input")).isEnabled();
		if(triState==true) {
			
			System.out.println("Checkbox is enabled");
		}
		else{
			System.out.println("Checkbox is disabled");
		
		}
		
 		
		driver.findElement(By.id("j_idt87:multiple")).click();
	       driver.findElement(By.xpath("//div[@id='j_idt87:multiple_panel']/div[1]/div[1]/div[2]")).click();     
	       driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-close']")).click();
 		
 		
 		
 		 
 				
 				
 		 
//		driver.findElement(By.xpath("//label[text()='Paris'][1]")).click();
		
		
		
		 
		
		
		
		
	}

}
