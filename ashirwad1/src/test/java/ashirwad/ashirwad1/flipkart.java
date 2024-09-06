package ashirwad.ashirwad1;

import java.io.File;
import java.nio.file.FileSystem;
import java.nio.file.Files;
import java.time.Duration;

import org.apache.commons.io.CopyUtils;
import org.apache.commons.io.FileSystemUtils;
import org.apache.commons.io.FileUtils;
import org.checkerframework.framework.qual.TargetLocations;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;

public class flipkart extends  dynamic_code {

	public static void main(String[] args) throws Throwable {
		open_browser("chrome");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    	screenshot("browser");
		hiturl("https://www.flipkart.com/");
		screenshot("site");
       
		 
	   WebElement searchbox = driver.findElement(By.cssSelector("input.Pke_EE"));
		 
		 //click method
		 searchbox.click();   
		 
		 
		 searchbox.sendKeys("apple mobile");
		 screenshot("search");
	     
		 driver.findElement(By.cssSelector("button._2iLD__")).click();
		 
		 driver.findElement(By.xpath("//div[text()=\"Apple iPhone 14 Plus (Blue, 128 GB)\"]")).click();
		 
		 screenshot("search output");
		 
		
		
		driver.quit();
	}

}
