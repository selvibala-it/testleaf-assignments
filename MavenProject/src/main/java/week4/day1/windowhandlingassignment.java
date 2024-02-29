package week4.day1;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class windowhandlingassignment {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver=new ChromeDriver();
        driver.manage().window().minimize();
        driver.manage().window().maximize(); 
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(100));
        //System.out.println("Window Handling");
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.findElement(By.id("username")).sendKeys("DemoSalesManager");
        driver.findElement(By.id("password")).sendKeys("crmsfa");
        driver.findElement(By.className("decorativeSubmit")).click();
        driver.findElement(By.partialLinkText("CRM")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//a[text()='Contacts']")).click();
        driver.findElement(By.xpath("//a[text()='Merge Contacts']")).click();
        driver.findElement(By.xpath("//img[@alt='Lookup']")).click();
        Set<String> WindowHandles=driver.getWindowHandles();
        List <String> Window=new ArrayList<String>(WindowHandles);
        Thread.sleep(3000);
        driver.switchTo().window(Window.get(1));      
        String Childtitle1=driver.getTitle();
        System.out.println("Child Window Name: "+Childtitle1);
        driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']")).click();
        Thread.sleep(3000);   
        driver.switchTo().window(Window.get(0));
        String Parenttitle=driver.getTitle();
        System.out.println("Parent Window Name: "+Parenttitle);
        driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
        Set<String> WindowHandles1=driver.getWindowHandles();
        List <String> Window1=new ArrayList<String>(WindowHandles1);
        driver.switchTo().window(Window1.get(1));
        String Childtitle=driver.getTitle();
        System.out.println("Child Window Name: "+Childtitle);
        driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[2]")).click();
        Thread.sleep(3000);
        driver.switchTo().window(Window1.get(0));
        String Parenttitle1=driver.getTitle();
        System.out.println("Parent Window Name: "+Parenttitle1);
        driver.findElement(By.xpath("//a[text()='Merge']")).click();
        Alert alert = driver.switchTo().alert();
        String text=alert.getText();
        System.out.println("Alert Message: "+text);
        alert.accept();
        String title=driver.getTitle();
        System.out.println("The title of the page: "+title);
	}

}
