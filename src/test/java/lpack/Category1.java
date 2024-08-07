package lpack;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

		public class Category1 {
		    WebDriver driver;

		    @BeforeClass
		    public void setup() {
		        driver = new ChromeDriver();
		    }

		    @Test
		    public void verifyProductCategoriesAccessible() {
		        driver.get("https://magento.softwaretestingboard.com/");
		        driver.findElement(By.linkText("Women")).click();
		        assert driver.getTitle().contains("Women") : "Product category is not accessible.";
		    }

		    @AfterClass
		    public void teardown() {
		        driver.quit();
		    }
		


	}


