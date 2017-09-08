
import static org.junit.Assert.*;

import java.io.File;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

	public class AppTest
	{
		
	 static WebDriver driver;
		 
	   // Writing before annotation so that the method run before execution of any other method
	  
	   // Writing test annotation to convert the open method as a test condition
	   @Test
	   public void Open()
	   {
		   driver=new FirefoxDriver();
		   	driver.get("http://google.co.in");
			Point point=driver.findElement(By.id("hplogo")).getLocation();
			driver.findElement(By.name("q")).sendKeys("sulaxman");
			driver.findElement(By.name("btnK")).click();
			driver.navigate().refresh();
			driver.close();
		}
	}

