package lpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccountDashBoard {

    public void account() {
          
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://magento.softwaretestingboard.com/");
        
        // Locate the dashboard element
        WebElement dashboard = driver.findElement(By.id("Dashboard"));
        
        // Assert if the dashboard is displayed
        assert dashboard.isDisplayed() : "Account Dashboard Test Failed";
        
        driver.close();
    }
}
