package cucu;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class cucumbe {
	
	WebDriver driver;
	
	@Given("^Open firefox and start application$")
	public void Open_firefox_and_start_application() throws Throwable 
	{
	
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\New folder\\chromedriver.exe"); 
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://122.165.236.133/multihospital/");
	}

	@When("^I enter valid username and vaild password$")
	public void I_enter_valid_username_and_vaild_password() throws Throwable 
	{
	
		driver.findElement(By.linkText("Reception")).click();
		Thread.sleep(3000);
		driver.findElement(By.id("txtusername")).sendKeys("ram");
		driver.findElement(By.id("txtpassword")).sendKeys("ram");
		Thread.sleep(5000);
		
	}

	@Then("^user should be login successfully$")
	public void user_should_be_login_successfully() throws Throwable 
	{
	  
		WebElement submit=driver.findElement(By.id("btnSubmit"));
		Actions action=new Actions(driver);
		action.moveToElement(submit).click().perform();
		Thread.sleep(5000);
		
	}

}
