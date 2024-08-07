package lpack;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class ProductPage {
@Test
	public  void P()  {
		class ProductPageTest {
		    WebDriver driver = new ChromeDriver();

		    @Test
		    public void testProductPageQuality() {
		        driver.get("(https://magento.softwaretestingboard.com/)");
		        WebElement productQuality = driver.findElement(By.cssSelector("div.product-quality"));
		        assertTrue(productQuality.isDisplayed());
		    }

		}
		}
}


	
