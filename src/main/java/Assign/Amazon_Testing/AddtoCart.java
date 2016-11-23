package Assign.Amazon_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddtoCart {
	
	public static WebElement addtocart(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='a-autoid-9']/span/input"));
	  return element;
	}
	
	public static WebElement Editbasket(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='hlb-view-cart-announce']"));
	  return element;
	}
	
	public static WebElement Quantity(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='activeCartViewForm']/div[2]/div/div[4]/div[2]/div[3]/div/div/span/span/span/span"));
	  return element;
	}
	
	public static WebElement checkout(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.xpath(".//*[@id='sc-buy-box-ptc-button']/span"));
	  return element;
	}
	


}
