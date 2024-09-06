package ashirwad.ashirwad1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class jeevansathi extends dynamic_code{
	
	public static void main(String[] args) throws Throwable {
		
		open_browser("chrome");
		hiturl("https://www.jeevansathi.com/");
		driver.findElement(By.cssSelector("svg[class=\"cursor-pointer\"]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//li[text()=\"Self\"]")).click();
		Thread.sleep(500);
		
		driver.findElement(By.xpath("//p[text()=\"Select\"]")).click();
		Thread.sleep(500);
		
		
		driver.findElement(By.xpath("//li[text()=\"Male\"]")).click();
		Thread.sleep(500);
		
	     Actions act = new Actions(driver);
	     WebElement email = driver.findElement(By.cssSelector("input#email"));
		act.moveToElement(email).click().sendKeys("mahajanashirwad1995@gmail.com").build().perform();
			
	    
	     act.keyDown(Keys.TAB).build().perform();
	     act.keyDown(Keys.TAB).build().perform();
	     Thread.sleep(500);
	     entertext("7507516457");
	     act.keyDown(Keys.TAB).build().perform();
	     Thread.sleep(500);
	     entertext("pass@123456789");
	     WebElement ckeckbox1 = driver.findElement(By.cssSelector("svg#custom-qa-policy-checkbox"));
	     act.moveToElement(ckeckbox1).click().build().perform();
	     Thread.sleep(500);
	     WebElement ckeckbox2 = driver.findElement(By.cssSelector("svg#custom-qa-receive-email"));
	     act.moveToElement(ckeckbox2).click().build().perform();
	     Thread.sleep(500);
	     
		WebElement submit = driver.findElement(By.linkText("Register for Free"));
		
		act.moveToElement(submit).build().perform();
		
		
		
	}

}
