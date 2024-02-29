package week4.day2;



import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionClassAmazonAssignment {

	public static void main(String[] args) throws IOException, InterruptedException,NumberFormatException{
		ChromeDriver driver=new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
        driver.manage().window().maximize();      
        driver.get("https://www.amazon.in/");
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("oneplus 9 pro",Keys.ENTER);
        String price=driver.findElement(By.className("a-price-whole")).getText();
        System.out.println("First Phone Price : "+price);
        String price1=price.replaceFirst(",","");
        //System.out.println(price1);
        String rating=driver.findElement(By.xpath("//span[@class='a-size-base s-underline-text']")).getText();
        System.out.println("Number of Customer Rating : "+rating);
        WebElement movetoelement=driver.findElement(By.xpath("//span[contains(@class,'a-size-medium a-color-base')]"));
        Actions act=new Actions(driver);
        act.click(movetoelement).perform();      
        Set<String> WindowHandles=driver.getWindowHandles();
        List <String> Window=new ArrayList<String>(WindowHandles);
        driver.switchTo().window(Window.get(1));
        WebElement we=driver.findElement(By.id("landingImage"));
        File src=we.getScreenshotAs(OutputType.FILE);
        File dst=new File("./Snapshot/img1.png");
        FileUtils.copyFile(src, dst);   
        driver.findElement(By.xpath("(//input[@id='add-to-cart-button'])[2]")).click();
        Thread.sleep(3000);
        String subtotal= driver.findElement(By.id("attach-accessory-cart-subtotal")).getText();
        String subtotal2=subtotal.replaceFirst(",","");
        String subtotal1=subtotal2.replaceAll("\\u20B9","");
        float sub=Float.parseFloat(subtotal1);
        int round=Math.round(sub);
        System.out.println("Subtotal of the product: "+round); 
        int a=Integer.parseInt(price1);
        if(a==round)
        {
        	System.out.println("Price of the product and the subtotal are same");
        }
        else
        {
        	System.out.println("Price of the product and the subtotal are not same");
        }
        driver.close();
        driver.switchTo().window(Window.get(0));
        driver.close();
	}

}

