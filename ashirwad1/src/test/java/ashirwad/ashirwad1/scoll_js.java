package ashirwad.ashirwad1;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class scoll_js extends dynamic_code {

	public static void main(String[] args) throws Throwable {
		
		open_browser("chrome");
		screenshot("launch browser");
		
		hiturl("https://www.jeevansathi.com/");
		screenshot("jeevansathi homepage");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("window.scroll(0,800)");   // window.scroll()
		screenshot("after scroll");
		
		jse.executeScript("window.scroll(0,document.body.scrollHeight)");     //- for scroll at bottom of page
		screenshot("bottom scroll");
	
		jse.executeScript("window.scroll(0,0)");
		screenshot("top scroll");
		
		driver.findElement(By.linkText("About Us")).click();
		screenshot("on clicking about us");
		
		jse.executeScript("window.history.back()");
		screenshot("after hiting back button");
		
		jse.executeScript("window.history.forward()");
		screenshot("after hiiting forward button");
		
		jse.executeScript("window.history.go(0)");
		screenshot("after refresh");
		
		
		
		
		
		
		driver.close();
	}
}
