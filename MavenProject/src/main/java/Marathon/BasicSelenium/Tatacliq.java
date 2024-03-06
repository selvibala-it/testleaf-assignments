package Marathon.BasicSelenium;



import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

public class Tatacliq{

	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver(options);
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.get(" https://www.tatacliq.com/");
		Actions act=new Actions(driver);
		WebElement brand = driver.findElement(By.xpath("(//div[@class='DesktopHeader__categoryAndBrand'])[2]"));
		act.moveToElement(brand).perform();
		Thread.sleep(3000);
		act.pause(10000);
		//Actions act1=new Actions(driver);
		WebElement watch = driver.findElement(By.xpath("//div[text()='Watches & Accessories']"));
		Thread.sleep(3000);
		act.moveToElement(watch).perform();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//div[text()='Casio']")).click();
		driver.findElement(By.xpath("//option[text()='New Arrivals']")).click();
		driver.findElement(By.xpath("(//div[@class='FilterDesktop__newFilName'])[1]")).click();
		Thread.sleep(2000);
		 List<WebElement> price = driver.findElements(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));

		for (WebElement i : price) {
			String text = i.getText();
			 System.out.println("All The prices Are: " +text);
		}
		WebElement least = price.get(0);
		String pricelist = least.getText();
		driver.findElement(By.xpath("//div[@class='ProductModule__dummyDiv']")).click();
		WebElement lowest = driver.findElement(By.xpath("//div[@class='ProductDescription__priceHolder']/h3"));
		if(pricelist.equals(lowest)) {
			System.out.println("The price of Watches Are Equal:");
		}else {
			System.out.println("The price of Watches Are Not Equal:");
		}
		Set<String> window = driver.getWindowHandles();
		List<String> window1=new ArrayList<String>(window);
		driver.switchTo().window(window1.get(1));
		driver.findElement(By.xpath("//span[text()='ADD TO BAG']")).click();
		String text = driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).getText();
		System.out.println("The Cout From The Cart icon: " +text);
		driver.findElement(By.xpath("//span[@class='DesktopHeader__cartCount']")).click();
		File scr = driver.getScreenshotAs(OutputType.FILE);
		File trg=new File("./Screenshot/img2.png");
		FileUtils.copyFile(scr, trg);
		driver.close();
		driver.switchTo().window(window1.get(0));
		driver.close();	
		

	}


}



