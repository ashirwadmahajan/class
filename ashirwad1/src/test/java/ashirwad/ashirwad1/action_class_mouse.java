package ashirwad.ashirwad1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class action_class_mouse extends dynamic_code{

	public static void main(String[] args) throws Throwable {
		open_browser("chrome");
		screenshot("browser launch");

		hiturl("https://jqueryui.com/slider/");
		screenshot("homepage jquery");
		
		Actions action = new Actions(driver);
		
      /*  WebElement draggable = driver.findElement(By.xpath("//a[text()=\"Draggable\"]"));
        action.moveToElement(draggable).click().build().perform();
        
        WebElement Themes = driver.findElement(By.xpath("//a[text()=\"Themes\"]"));
		action.moveToElement(Themes).contextClick().build().perform();                // for right click : contexclick();     */
		
		//WebElement frame = driver.findElement(By.cssSelector("iframe.demo-frame"));             // to enter in frame
		//driver.switchTo().frame(frame);
		
		switch_to_frame("css","iframe.demo-frame");
		
	//	WebElement slider = driver.findElement(By.xpath("//span[@tabindex=\"0\"]"));            // to move slider
		//action.moveToElement(slider).dragAndDropBy(slider, 400, 0).build().perform();
		
		move_slider("xpath", "//span[@tabindex=\"0\"]", 500, 0);
		
		
		Thread.sleep(3000);
		
		//action.dragAndDropBy(slider, -300, 0).build().perform();
		
		//driver.switchTo().defaultContent();            // use to come out of frame to previous location where it was
		
		 //WebElement droppable = driver.findElement(By.xpath("//a[text()=\"Droppable\"]"));
		//action.moveToElement(droppable).click().build().perform();
		
		//WebElement frame1 = driver.findElement(By.cssSelector("iframe.demo-frame"));
		//driver.switchTo().frame(frame1);
		
		//WebElement drag = driver.findElement(By.cssSelector("div#draggable"));
		
		//WebElement drop = driver.findElement(By.cssSelector("div#droppable"));
		
		//action.moveToElement(drag).clickAndHold().moveToElement(drop).release().build().perform();
		
		//action.clickAndHold(drag).moveToElement(drop).release().build().perform();
		
	//	action.dragAndDrop(drag, drop).release().build().perform();
		
		//drag_drop("div#draggable", "div#droppable");
		
		
		
	
	}

}
