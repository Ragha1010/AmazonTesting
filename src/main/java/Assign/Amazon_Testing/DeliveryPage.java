package Assign.Amazon_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DeliveryPage {

	public static WebElement address(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='address-book-entry-0']/div[2]/span/a"));
	  return element;
	}
	
	public static WebElement dispatch(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='shippingOptionFormId']/div[1]/div[2]/div/span[1]/span/input"));
	  return element;
	}
	
	

	
}
