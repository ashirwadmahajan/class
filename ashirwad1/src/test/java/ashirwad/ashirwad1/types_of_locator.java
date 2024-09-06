package ashirwad.ashirwad1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;


public class types_of_locator {

	public static void main(String[] args) {
		
	WebDriver driver = new ChromeDriver();
	

	
	
	driver.manage().window().maximize();
	
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));       // implicit wait of 10 sec applicable globally for each steps
	                                                                         // declare only once 
	
	driver.get("https://www.snapchat.com/?original_referrer=www.google.com ");
	
	
	// explicit wait      1]  webdriver wait (class)
	//                    2]  fluentwait  (class)
	
	
	//  1st webdriverwait
	
	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
	wait.until(ExpectedConditions.visibilityOfElementLocated(locator));    // it will wait until element visibility
	
	
	FluentWait<WebDriver> wait1 = new FluentWait<WebDriver>(driver).withTimeout(Duration.ofSeconds(30))
			.pollingEvery(Duration.ofSeconds(10)).ignoring(NoSuchElementException.class);
	
	
	driver.findElement(By.id("PING_CONTENT_AUTOPLAY_DETECTION"));
	
	driver.findElement(By.className("_3sdu8W emupdz"));
	
	driver.findElement(By.linkText("Sling Bags"));
	
	driver.findElement(By.partialLinkText("Sling B"));
	
	driver.findElement(By.tagName("div"));
	
	// css combination  tagname#idvalue
	driver.findElement(By.cssSelector("script#__LOADABLE_REQUIRED_CHUNKS__"));
	
	// css combination  tagname.idvalue  and use . for space
	driver.findElements(By.cssSelector("div._2nl6Ch"));
	
	driver.findElements(By.cssSelector("div.css-175oi2r.r-13awgt0.r-1iqfa7g.r-60vfwk"));
	
	// css attribute 
	
	driver.findElement(By.cssSelector("div[id=\"portal--container\"]"));
	
	
	
//	System.out.println(driver.getCurrentUrl());
	
//	driver.navigate().refresh();
    driver.close();

	}

}
