package ashirwad.ashirwad1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class makemytrip extends dynamic_code {

	public static void main(String[] args) throws Throwable {

		open_browser("edge");
		hiturl("https://www.easemytrip.com/");
		
        Actions act=new Actions(driver);
		WebElement from = driver.findElement(By.cssSelector("input#FromSector_show"));
		from.click();
		entertext("nag");

	
		List<WebElement> from_option = driver.findElements(By.xpath("//*[@id=\"fromautoFill_in\"]//span"));	
		
		
		
			 
		for(int i=0; i< from_option.size(); i++){
			
		//	System.out.println(from_option.get(i).getText());
			 if(from_option.get(i).getText().contains("Nagpur(NAG)")) {
				 
				from_option.get(i).click();
				
               break;
	          }

            }
		screenshot("easmytrip", "source");
		
		
		
		
		WebElement to = driver.findElement(By.cssSelector("input#Editbox13_show"));
		to.click();
		entertext("de");
		
		   List<WebElement> to_option = driver.findElements(By.xpath("//*[@id=\"toautoFill\"]//span"));
		   
		   
		System.out.println(to_option.size());
		
		for(int j=0; j< to_option.size(); j++) {
			
			System.out.println(to_option.get(j).getText());
		 if(to_option.get(j).getText().contains("Delhi(DEL)")) {
			 
			 to_option.get(j).click();
		     break;
		 }
		}
		screenshot("easmytrip", "destination");   
		
	
		 
	Thread.sleep(4000);	  
	WebElement date = driver.findElement(By.cssSelector("li.active-date"));
	act.moveToElement(date).click().build().perform();

	WebElement search = driver.findElement(By.cssSelector("button.srchBtnSe"));
	act.moveToElement(search).click().build().perform();
	Thread.sleep(3000);
	screenshot("easmytrip", "aftersearch");
	
	driver.close();



	}}


  
