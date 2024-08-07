package lpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Category {
@Test
	public void c() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(05));
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.linkText("Men")).click();
		assert driver.getTitle().contains("Men"):  "Product category is not accessible.";
	}
	
	 @AfterClass
	    public void teardown() {
		WebDriver driver = new ChromeDriver();
	        driver.quit();
	    }

}

