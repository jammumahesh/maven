import static org.junit.Assert.*;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class SampleTest {
	
	static WebDriver driver;

	@Test
	public void test() {
		//fail("Not yet implemented");
		driver=new FirefoxDriver();
	   	driver.get("http://localhost:62895/DemoWebapp/");
		driver.findElement(By.linkText("Click Here")).click();
		//driver.navigate().refresh();
		//driver.close();
	}

}
