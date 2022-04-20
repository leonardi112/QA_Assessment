package co.darwin.selenium.webdriver.basic;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SignupTest {

	WebDriver driver;
	
	public void munculkanbroswer() {
		
		try {
			System.setProperty("webdriver.gecko.driver","D:\\Selenium\\Driver\\geckodriver.exe");
			driver = new FirefoxDriver(); 
			
			// command untuk membuat browser menunggu sampai waktu yang ditentukan 
			driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(1000, TimeUnit.SECONDS);
			
			driver.get("http://automationpractice.com/index.php/");
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
		driver.findElement(By.id("email_create")).click();
	    driver.findElement(By.id("email_create")).sendKeys("testingasd@email.com");
	    driver.findElement(By.cssSelector("#create-account_form > .form_content")).click();
	    driver.findElement(By.cssSelector("#SubmitCreate > span")).click();
	    driver.findElement(By.id("id_gender1")).click();
	    driver.findElement(By.id("customer_firstname")).click();
	    driver.findElement(By.id("customer_firstname")).sendKeys("asd");
	    driver.findElement(By.id("customer_lastname")).click();
	    driver.findElement(By.id("customer_lastname")).sendKeys("asd");
	    driver.findElement(By.id("email")).click();
	    driver.findElement(By.cssSelector(".form-group > .row")).click();
	    driver.findElement(By.id("passwd")).click();
	    driver.findElement(By.id("passwd")).sendKeys("password");
	    driver.findElement(By.id("days")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("days"));
	      dropdown.findElement(By.xpath("//option[. = 'regexp:6\\s+']")).click();
	    }
	    driver.findElement(By.cssSelector("#days > option:nth-child(7)")).click();
	    driver.findElement(By.id("months")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("months"));
	      dropdown.findElement(By.xpath("//option[. = 'regexp:July\\s']")).click();
	    }
	    driver.findElement(By.cssSelector("#months > option:nth-child(8)")).click();
	    driver.findElement(By.id("years")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("years"));
	      dropdown.findElement(By.xpath("//option[. = 'regexp:2013\\s+']")).click();
	    }
	    driver.findElement(By.id("address1")).click();
	    driver.findElement(By.id("address1")).sendKeys("street asdasd");
	    driver.findElement(By.id("city")).click();
	    driver.findElement(By.id("city")).sendKeys("asd");
	    driver.findElement(By.id("id_state")).click();
	    {
	      WebElement dropdown = driver.findElement(By.id("id_state"));
	      dropdown.findElement(By.xpath("//option[. = 'Alaska']")).click();
	    }
	    driver.findElement(By.cssSelector("#id_state > option:nth-child(3)")).click();
	    driver.findElement(By.id("postcode")).click();
	    driver.findElement(By.id("postcode")).sendKeys("11111");
	    driver.findElement(By.id("id_country")).click();
	    driver.findElement(By.cssSelector("#id_country > option:nth-child(2)")).click();
	    driver.findElement(By.id("phone")).click();
	    driver.findElement(By.id("phone_mobile")).click();
	    driver.findElement(By.id("phone_mobile")).sendKeys("123123");
	    driver.findElement(By.id("alias")).click();
	    driver.findElement(By.id("address_alias")).click();
	    driver.findElement(By.id("phone")).click();
	    driver.findElement(By.id("phone")).sendKeys("123123");
	    driver.findElement(By.cssSelector("#submitAccount > span")).click();
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SignupTest test = new SignupTest();
		test.munculkanbroswer();

	}

}
