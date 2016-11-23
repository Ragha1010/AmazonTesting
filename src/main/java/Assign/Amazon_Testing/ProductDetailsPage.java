package Assign.Amazon_Testing;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductDetailsPage {

	public static WebElement Buyingoptions(WebDriver driver)
	{
	  WebElement element =driver.findElement(By.id("buybox-see-all-buying-choices-announce"));
	  return element;
	}
	

	
}
