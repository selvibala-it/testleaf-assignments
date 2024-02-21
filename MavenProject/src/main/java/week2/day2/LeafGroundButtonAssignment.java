package week2.day2;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.chrome.ChromeDriver;


public class LeafGroundButtonAssignment {

	public static void main(String[] args) {
				ChromeDriver driver=new ChromeDriver();
		        driver.manage().window().maximize();      
		        driver.get("https://leafground.com/button.xhtml");
		        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		        driver.findElement(By.id("j_idt88:j_idt90")).click();
		        String title=driver.getTitle();
		        System.out.println(title);
		        if(title.contains("Dashboard"))
		        {
		        	System.out.println("Dashboard page opened");
		        }
		        else
		        {
		        	System.out.println("Dashboard page not opened");
		        }
		        driver.navigate().back();
		        boolean disabled=driver.findElement(By.id("j_idt88:j_idt92")).isDisplayed();
		        System.out.println("Confirm if the button is disabled: " +disabled);
		        Point position=driver.findElement(By.id("j_idt88:j_idt94")).getLocation();
		        System.out.println("The Position of Submit button: " +position);
		        String Color=driver.findElement(By.id("j_idt88:j_idt96")).getCssValue("color");
		        System.out.println("The Save button color: "+Color);
		        Dimension heightwidth=driver.findElement(By.id("j_idt88:j_idt98")).getSize();
		        System.out.println("Find the height and width of this button: " +heightwidth);
		        driver.close();
			}

	}


