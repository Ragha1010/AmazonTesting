package Assign.Amazon_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationPage {
	
	public static WebElement CreateAccount(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.partialLinkText("Create your"));
	  return element;
	}
	
	
	public static WebElement Name(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ap_customer_name"));
	  return element;
	}
	
	public static WebElement Email1(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ap_email"));
	  return element;
	}
	
	public static WebElement paswrd(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ap_password"));
	  return element;
	}
	
	public static WebElement paswrd1(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("ap_password_check"));
	  return element;
	}
	
	public static WebElement create(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("continue"));
	  return element;
	}
	

}
