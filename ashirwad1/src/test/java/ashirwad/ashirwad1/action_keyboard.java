package ashirwad.ashirwad1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class action_keyboard extends dynamic_code {

	public static void main(String[] args) throws Throwable {
		open_browser("chrome");
		
		hiturl("https://www.jeevansathi.com/");
		
		Actions action = new Actions(driver);
		
		WebElement email = driver.findElement(By.cssSelector("input#email"));
		action.moveToElement(email).click().sendKeys("mahajanashirwad1995@gmail.com").build().perform();
		
		action.keyDown(Keys.CONTROL).sendKeys("a").sendKeys("c").keyUp(Keys.CONTROL).build().perform();
		
		action.keyDown(Keys.TAB);
	
		action.keyDown(Keys.TAB);
	
	//	action.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		rightclick();
		
		
		Thread.sleep(5000);
		driver.close();
		
		
		
		
		
		
	}

}
