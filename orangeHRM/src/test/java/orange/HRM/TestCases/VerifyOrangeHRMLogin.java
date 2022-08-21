/**
 * 
 */
package orange.HRM.TestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import orange.HRM.Pages.LoginPage;

/**
 * @author Mallesh
 *
 */
public class VerifyOrangeHRMLogin 
{
	@Test
	public void VerifyValidLogin()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\mallesh.appaiah\\Documents\\softwares\\selenium\\chromedriver_win32 (2)\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		LoginPage login = new LoginPage(driver);
		
		login.loginToOrangeHRM("Admin","admin123");
	
		
		driver.findElement(By.className("oxd-userdropdown-name")).click();
		driver.findElement(By.linkText("Logout")).click();
		System.out.println(driver.getCurrentUrl());
		
		driver.quit();
	}
	
}
