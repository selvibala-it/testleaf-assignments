package week4.day2;
     import java.io.File;
	import java.io.IOException;
	import java.time.Duration;

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;

	public class ActionClassSnapdealAssignment {

		public static void main(String[] args) throws InterruptedException, IOException {
			ChromeDriver driver=new ChromeDriver();
	        driver.manage().window().maximize();     
	        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	        driver.get("https://www.snapdeal.com/");
	        WebElement movetoelement=driver.findElement(By.xpath("//a[@class='menuLinks leftCategoriesProduct ']//span[2]"));
	        Actions act=new Actions(driver);
	        act.moveToElement(movetoelement).perform();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//span[@class='linkTest']")).click();
	        String items = driver.findElement(By.xpath("//span[@class='category-name category-count']")).getText();
	        System.out.println("Number of Sports Shoes: "+items);
	        driver.findElement(By.xpath("(//div[@class='child-cat-name '])[2]")).click();
	        driver.findElement(By.className("sort-selected")).click();
	        driver.findElement(By.xpath("//li[@class='search-li']")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.name("fromVal")).clear();
	        driver.findElement(By.name("fromVal")).sendKeys("500");
	        Thread.sleep(3000);
	        driver.findElement(By.name("toVal")).clear();
	        driver.findElement(By.name("toVal")).sendKeys("700");
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//div[text()[normalize-space()='GO']]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("//button[contains(@class,'view-more-button btn')]")).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath("(//input[@type='checkbox']/following-sibling::label)[2]")).click();
	        Thread.sleep(3000);
	        WebElement movetoelement1=driver.findElement(By.xpath("//img[@class='product-image wooble']"));       
	        Actions act1=new Actions(driver);
	        act1.moveToElement(movetoelement1).perform();
	        driver.findElement(By.xpath("//div[contains(@class,'center quick-view-bar')]")).click();
	        String disprice = driver.findElement(By.xpath("//div[contains(@class,'product-price pdp-e-i-PAY-l')]")).getText();
	        System.out.println("Discount price of the shoe: "+disprice);
	        Thread.sleep(3000);
	        WebElement we=driver.findElement(By.xpath("//img[@class='cloudzoom']"));
	        File src=we.getScreenshotAs(OutputType.FILE);
	        File dst=new File("./Snapshot/img2.png");
	        FileUtils.copyFile(src, dst);  
	        driver.findElement(By.xpath("(//i[@class='sd-icon sd-icon-delete-sign'])[3]")).click();
	        driver.close();
	        

		}

	}

