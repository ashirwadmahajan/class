package ashirwad.ashirwad1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webelementmethods {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		 driver.get("https://www.flipkart.com/");
		 System.out.println(driver.getCurrentUrl());
		 
		 WebElement searchbox = driver.findElement(By.cssSelector("input.Pke_EE"));
		 
		 //click method to click
		 searchbox.click();   
		 
		 //sendkeys to provide value in searchbox
		 searchbox.sendKeys("laptops");
		 
		 Thread.sleep(500);
	
		 //to clear the provides value
		 searchbox.clear();
		 
		 searchbox.sendKeys("earphones");
	
	     System.out.println(searchbox.getAttribute("value"));    // it will gives what we search in seachbox
	
	// to get x y coordinates
	     System.out.println("the coordinates of x and y : "+searchbox.getLocation().x + "  "+searchbox.getLocation().y);
	
	     
	     //size of searchbox
	     
	     System.out.println(searchbox.getSize());
	     
	     
	     
	     //tagname
	     System.out.println(searchbox.getTagName());
	     
	     //isdisplay
	     
	     //isenable
	     
	     // is selected
	     
	    //gettext() 
	     
	     
	     driver.findElement(By.cssSelector("input.Pke_EE")).click();
	     
	     
	     driver.close();
	
	}

}
