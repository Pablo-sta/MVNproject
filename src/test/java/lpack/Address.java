package lpack;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Address {

	public  Address() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		@SuppressWarnings("unused")
		class A{
			  WebDriver driver;

			  @BeforeClass
			  public void setup() {
			      driver = new ChromeDriver();
			  }

			  @Test
			  public void verifyHomePageLoadsCorrectly() throws InterruptedException {
				  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			      driver.get("https://magento.softwaretestingboard.com/");
			      driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
			      driver.findElement(By.xpath("//input[@id='email']")).sendKeys("head.travis@example.com");
			      driver.findElement(By.xpath("//fieldset[@class='fieldset login']//input[@id='pass']")).sendKeys("Password@123456");
			      driver.findElement(By.xpath("//fieldset[@class='fieldset login']//button[@id='send2']")).click();
			      Thread.sleep(5000);
			      driver.findElement(By.xpath("//div[@class='panel header']//button[@type='button']")).click();
			     // Thread.sleep(3000);
			      driver.findElement(By.xpath("//div[@aria-hidden='false']//a[normalize-space()='My Account']")).click();
			      driver.findElement(By.xpath("//a[normalize-space()='Address Book']")).click();
			      driver.findElement(By.xpath("//span[normalize-space()='Add New Address']")).click();
			      driver.findElement(By.xpath("//input[@id='street_1']")).sendKeys("Street 11c");
			      driver.findElement(By.xpath("//input[@id='city']")).sendKeys("London ");
			      WebElement stateDropdown = driver.findElement(By.xpath("//select[@id='region_id']"));
			      
			      
			      Select selectState = new Select(stateDropdown);
			      selectState.selectByVisibleText("London");
			      
			      driver.findElement(By.xpath("//input[@id='telephone']")).sendKeys("949335425");
			      driver.findElement(By.xpath("//input[@id='zip']")).sendKeys("515635");
			      driver.findElement(By.xpath("//input[@id='primary_billing']")).click();
			      driver.findElement(By.xpath("//span[normalize-space()='Save Address']")).click();
			      
			      Assert.assertTrue(driver.getPageSource().contains("You saved the address."), "Saving Address failed.");

			      
			      
			      
		}
			  @AfterClass
			  public void teardown() {
			     driver.quit();
			 }
		}
	}

}
