package Assign.Amazon_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Amazon_Homepage {

	public static WebElement searchbox(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("twotabsearchtextbox"));
	  return element;
	}
	
	
	public static WebElement searchphone(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='result_2']/div/div[3]/div[1]/a/h2"));
	  return element;
	}
	
	
	public static WebElement submit(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='nav-search']/form/div[2]/div/input"));
	  return element;
	}
	

	
}
