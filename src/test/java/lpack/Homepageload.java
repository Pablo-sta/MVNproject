package lpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Homepageload {
@Test
	public void homepage() {
	WebDriver driver = new ChromeDriver();
	driver.manage().window().maximize();
	
	//VERIFYING HOME PAGE IS LOADING PROPERLY OR NOT.
	
	
driver.get("https://magento.softwaretestingboard.com/");
assert driver.getTitle().contains("Home Page") : "Home page did not load correctly.";
    }
	@AfterClass
    public void teardown() {
        WebDriver driver = new ChromeDriver();
		driver .quit();

	}

}
