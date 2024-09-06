package ashirwad.ashirwad1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class redbus extends dynamic_code{

	public static void main(String[] args) throws Throwable {
		
		
		open_browser("edge");
		hiturl("https://www.redbus.in/");
		screenshot("redbus", "homepage");
		Actions act=new Actions(driver);
		
		WebElement to = driver.findElement(By.cssSelector("input#dest"));
		to.click();
		entertext("pune");

	
		List<WebElement> to_option = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]//child::li"));		 
		Thread.sleep(2000);		 
		for(int i=0; i< to_option.size(); i++){
			 if(to_option.get(i).getText().contains("Sangamwadi")) {
				 
				 to_option.get(i).click();
               break;
	          }

            }
		screenshot("redbus", "destination");
		Thread.sleep(2000);
		
		WebElement date = driver.findElement(By.xpath("(//span[text()=\"5\"])[1]"));
		act.moveToElement(date).click().build().perform();

		
		WebElement from = driver.findElement(By.cssSelector("input#src"));
		from.click();
		entertext("wardh");
		
		List<WebElement> from_option = driver.findElements(By.xpath("//ul[@class=\"sc-dnqmqq dZhbJF\"]//child::li"));
		Thread.sleep(2000);
		for(int i=0; i< from_option.size(); i++) {
		 if(from_option.get(i).getText().contains("Wardha ST Stand")) {
			 
			 from_option.get(i).click();
		     break;
		 }
		}
		screenshot("redbus", "source");
		
		
		Thread.sleep(5000);	  
		WebElement search = driver.findElement(By.id("search_button"));
		act.moveToElement(search).click().build().perform();
		
		

		
		
	}}