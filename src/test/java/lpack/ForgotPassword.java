package lpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ForgotPassword {
	
	WebDriver driver;
	  @BeforeClass
	  public void setup() {
	      driver = new ChromeDriver();
	  }
@Test
	public  void f() {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
	driver.findElement(By.xpath("//div[@class='panel header']//a[contains(text(),'Sign In')]")).click();
	driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[4]/div[2]/a/span")).click();
	driver.findElement(By.xpath("//input[@id='email_address']")).sendKeys("head.travis@example.com");
	  driver.findElement(By.xpath("//span[normalize-space()='Reset My Password']")).click();
	  Assert.assertTrue(driver.getPageSource().contains("If there is an account associated with head.travis@example.com you will receive an email with a link to reset your password."), "Password reset failed.");
}

@AfterClass
public void teardown() {
   
}
	  
	  

	
}
