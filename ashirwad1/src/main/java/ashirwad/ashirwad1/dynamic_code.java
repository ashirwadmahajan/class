package ashirwad.ashirwad1;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class dynamic_code {

	public static WebDriver driver;
	
	public static void open_browser(String browser) {
		
		if(browser.equalsIgnoreCase("chrome")) {
		          driver =new ChromeDriver();
		}else if(browser.equalsIgnoreCase("edge")) {
	              driver =new EdgeDriver();
		}else if(browser.equalsIgnoreCase("firefox")) {
		          driver =new FirefoxDriver();
	    }
        System.out.println("the browser open is : "+ browser);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	 }
	
	public static void hiturl(String url) {
		
		driver.get(url);
		System.out.println(driver.getCurrentUrl());
	}
	
    public static void screenshot(String folder,String scname) throws Throwable {
    	
    	TakesScreenshot ts = (TakesScreenshot) driver;
    	File source = ts.getScreenshotAs(OutputType.FILE);
    	File target = new File("./"+folder+"/"+scname+".png");
    	FileUtils.copyFile(source, target);
    	
    	/*  TakesScreenshot sc=(TakesScreenshot) r;
          File source = sc.getScreenshotAs(OutputType.FILE);
          File target = new File("./proof/example.png");
          FileHandler.copy(source, target);        */
    }
    
    //enter text using action class
	public static void entertext(String text) {
		Actions action = new Actions(driver);
		action.sendKeys(text).build().perform();
	}
	
	//for select and copy
	public static void select_copy_paste(String operation) {
		Actions action = new Actions(driver);
		if(operation.equalsIgnoreCase("selectall")) {
			action.keyDown(Keys.CONTROL).sendKeys("a").keyDown(Keys.CONTROL).build().perform();	
		
		}else if(operation.equalsIgnoreCase("copy")) {
			action.keyDown(Keys.CONTROL).sendKeys("c").keyDown(Keys.CONTROL).build().perform();
	   
		}else if(operation.equalsIgnoreCase("paste")) {
		action.keyDown(Keys.CONTROL).sendKeys("v").keyDown(Keys.CONTROL).build().perform();
		}
	}

	// for right click
	public static void rightclick() {
		Actions action = new Actions(driver);
		action.contextClick().build().perform();
	}
	
	//for double click
	public static void doubleclick() {
		Actions action = new Actions(driver);
		action.doubleClick().build().perform();
	}
	
   // to drag and drop
	public static void drag_drop(String dragpath,String droppath) {
		Actions action = new Actions(driver);
        WebElement drag1 = driver.findElement(By.cssSelector(dragpath));
		WebElement drop1 = driver.findElement(By.cssSelector(droppath));
		action.dragAndDrop(drag1, drop1).release().build().perform();
	}
	
	// to move slider
	public static void move_slider(String locator,String path,int x,int y) {
		Actions action = new Actions(driver);
		
		if(locator.equalsIgnoreCase("xpath")) {
		WebElement slider = driver.findElement(By.xpath(path));
		action.moveToElement(slider).dragAndDropBy(slider, x, y).release().build().perform();
		}else if(locator.equalsIgnoreCase("css")) {
		WebElement slider = driver.findElement(By.cssSelector(path));
		action.moveToElement(slider).dragAndDropBy(slider, x, y).release().build().perform();
		}
		
	}
	
	// switch to frame
	public static void switch_to_frame(String locator,String path) {
	
		if(locator.equalsIgnoreCase("xpath")) {
			
			WebElement frame = driver.findElement(By.xpath(path));
			driver.switchTo().frame(frame);
			
		}else if(locator.equalsIgnoreCase("css")) {
			
		WebElement frame = driver.findElement(By.cssSelector(path));
	    driver.switchTo().frame(frame);
		}
    }
	
	// back to window 
	public static void back_to_window() {
		driver.switchTo().defaultContent();
	}
	
	// to navigate backward ,forward,refresh
	public static void navigate(String action) {
		
		if(action.equalsIgnoreCase("backward")) {
		driver.navigate().back();
		
	  }else if(action.equalsIgnoreCase("forward")) {
		  driver.navigate().forward();
		  
	  }else if(action.equalsIgnoreCase("refresh")) {
		  driver.navigate().refresh();
	  }
	
	}
	
	
	//scroll by offset
		public static void scroll_byoffsets(int x,int y) {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scrollBy("+x+","+y+")");
			
		}
		
	// scroll to bottom
		public static void scroll_to_bottom() {
			JavascriptExecutor jse = (JavascriptExecutor) driver;
			jse.executeScript("window.scroll(0,document.body.scrollHeight)");
			
		}
	// scroll by page up
		public static void pageup() {
			Actions action = new Actions(driver);
			action.keyDown(Keys.PAGE_UP).build().perform();
		}
	
	// scroll by page down
		public static void pagedown() {
			Actions action = new Actions(driver);
			action.keyDown(Keys.PAGE_DOWN).build().perform();
		}
			
		public static void tab() {
			Actions action = new Actions(driver);
			action.keyDown(Keys.TAB).build().perform();
		}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	
	
