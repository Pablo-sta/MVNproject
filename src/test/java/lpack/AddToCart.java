package lpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class AddToCart {
@Test
	public  void A() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://magento.softwaretestingboard.com/");
		driver.findElement(By.linkText("Sign In")).click();
		
		//WebElement LoginField
		driver.findElement(By.id("email")).sendKeys("head.travis@example.com");
		driver.findElement(By.id("pass")).sendKeys("Password@12323");
		
		//Click LoginButton
	//	driver.findElement(By.cssSelector("Send2")).click();
		
	}
	@BeforeClass
	public void setup() {
	}

	public void verifyAddToCart() throws InterruptedException {
    	WebDriver driver = new ChromeDriver();
		driver .manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.findElement(By.linkText("Radiant Tee")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//div[@id='option-label-size-143-item-167']")).click();
        driver.findElement(By.xpath("//div[@id='option-label-color-93-item-50']"));
        driver.findElement(By.xpath("//span[normalize-space()='Add to Cart']")).click();
        driver.findElement(By.xpath("//a[@class='action showcart']")).click();
        assert driver.getPageSource().contains("Radiant Tee") : "Add to cart functionality failed.";
    }

  @AfterClass
    public void teardown() {
        WebDriver driver = new ChromeDriver();
		driver .quit();
	
	}

}
