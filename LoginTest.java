package co.darwin.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class LoginTest {

	WebDriver driver;
	
	public void munculkanbroswer() {
		
		try {
			System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver(); 
			
			// command untuk membuat browser menunggu sampai waktu yang ditentukan 
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
			
			driver.get("http://automationpractice.com/");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		FirefoxOptions opsi = new FirefoxOptions();
		opsi.setPageLoadStrategy(PageLoadStrategy.NORMAL);
		carielement();
		
	}
	
	public void carielement() {
		
		
		driver.findElement(By.linkText("Sign in")).click();
		driver.findElement(By.id("email")).click();
	    driver.findElement(By.id("email")).sendKeys("email@email.com");
	    driver.findElement(By.id("passwd")).sendKeys("pass");
	    driver.findElement(By.cssSelector("#SubmitLogin > span")).click();
	    
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LoginTest test = new LoginTest();
		test.munculkanbroswer();

	}

}
