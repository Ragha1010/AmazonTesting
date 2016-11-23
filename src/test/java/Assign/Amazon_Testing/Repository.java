package Assign.Amazon_Testing;


import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;





public class Repository {

	public static WebDriver driver;
	
	public void setup() throws InterruptedException
	{
	    driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.co.uk");
		Thread.sleep(2000);		
		
	}
	
	public void Home() throws InterruptedException
	{
		Amazon_Homepage.searchbox(driver).sendKeys("iphone 6s phone");
		Amazon_Homepage.submit(driver).click();
		Amazon_Homepage.searchphone(driver).click();
		Thread.sleep(2000);	
	}
	
	public void Product() throws InterruptedException
	{
		ProductDetailsPage.Buyingoptions(driver).click();
		Thread.sleep(2000);	
	}
	
	
	public void AddItem() throws InterruptedException
	{
		AddtoCart.addtocart(driver).click();
		AddtoCart.Editbasket(driver).click();
		AddtoCart.Quantity(driver).click();
		Actions a=new Actions(driver);
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.DOWN).build().perform();
		a.sendKeys(Keys.ENTER).build().perform();
		Thread.sleep(1000);
		AddtoCart.checkout(driver).click();
		Thread.sleep(1000);	
		
	}
	
	public  void Registration()
	{
		RegistrationPage.CreateAccount(driver).click();
		RegistrationPage.Name(driver).sendKeys("jkl");
		RegistrationPage.Email1(driver).sendKeys("jkl@mailimate.com");
		RegistrationPage.paswrd(driver).sendKeys("mailimate");
		RegistrationPage.paswrd1(driver).sendKeys("mailimate");
		RegistrationPage.create(driver).click();
	}
	
	public void Delivery() throws InterruptedException
	{
		DeliveryPage.address(driver).click();
		Thread.sleep(1000);	
		DeliveryPage.dispatch(driver).click();
	}
	
}
