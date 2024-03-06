package week5.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead2 extends BaseClass {
	
	@DataProvider(name="getData")
	public String[][] sentData(){
		String[][] data=new String[3][4];
		data[0][0]="TestLeaf";
		data[0][1]="Aravind";
		data[0][2]="R";
		data[0][3]="98";
		
		data[1][0]="TeatLeaf";
		data[1][1]="Gokul";
		data[1][2]="s";
		data[1][3]="97";
		
		data[2][0]="TeatLeaf";
		data[2][1]="Vinoth";
		data[2][2]="s";
		data[2][3]="98";
		return data;
	}
	
	
	@Test(dataProvider="getData")
	public  void Runcreatelead(String cName,String fName,String lName,String ph) {
		
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(cName);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(fName);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lName);
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys(ph);
		driver.findElement(By.name("submitButton")).click();
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();
		if (text.contains("Testleaf")) {
			System.out.println("Lead created successfully");
		}
		else {
			System.out.println("Lead is not created");
		}
		


	}

}
