package week3.day2;
import java.util.*;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("phones",Keys.ENTER);
		 
		List<WebElement> phPrice = driver.findElements(By.className("a-price-whole"));

		List<Integer> minPrice=new ArrayList<Integer>();
		
		for (WebElement b:phPrice) {
			String text = b.getText();
			String replaceAll = text.replaceAll(",", "");
			int parseInt = Integer.parseInt(replaceAll);
			minPrice.add(parseInt);
			
		}
		Collections.sort(minPrice);
	    System.out.println(minPrice);
		System.out.println("lowest price value :"+ minPrice.get(0));
	}
		

	}


