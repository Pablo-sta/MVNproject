package lpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest {

	
		    @BeforeClass
		    public void setup() {
		    }

		    @Test
		    public void verifyUserRegistration() {
		        WebDriver driver = new ChromeDriver();
				driver.get("https://magento.softwaretestingboard.com/");
		        driver.findElement(By.linkText("Create an Account")).click();
		        driver.findElement(By.id("firstname")).sendKeys("head");
		        driver.findElement(By.id("lastname")).sendKeys("travis");
		        driver.findElement(By.id("email_address")).sendKeys("head.travis@example.com");
		        driver.findElement(By.id("pass")).sendKeys("Password@12323");
		        driver.findElement(By.id("password-confirmation")).sendKeys("Password@12323");
		        driver.findElement(By.cssSelector(".submit")).click();
		        assert driver.getPageSource().contains("Thank you for registering") : "User registration failed.";
		    }

		   @AfterClass
		   public void teardown() {
		       WebDriver driver = new ChromeDriver();
			driver.quit();
		  }
		


	}


