package Bollywood;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {

	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // Browser Launch
		
		driver.get("https://www.saucedemo.com/"); // URL Launch
		
		driver.manage().window().maximize(); //maximzie 
		
	WebElement username=driver.findElement(By.xpath("//input[@id='user-name']"));
	
	   username.sendKeys("standard_user");
	   Thread.sleep(3000);
	
WebElement password=driver.findElement(By.xpath("//input[@id='password']"));

  password.sendKeys("secret_sauce");

  WebElement loginBtn= driver.findElement(By.xpath("//input[@id='login-button']"));
  
  Thread.sleep(3000);
		
	    loginBtn.click();	
	    
	    driver.quit();
		
		
	}
}
