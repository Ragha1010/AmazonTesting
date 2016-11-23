package Assign.Amazon_Testing;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestExecution extends Repository{

	@BeforeTest
	public void verifysetup() throws InterruptedException
	{
		setup();
	}
	
	@Test
	public void verifyHomePage() throws InterruptedException
	{
		Home();
	}
	@Test(priority=1)
	public void verifyProductDeatilsPage() throws InterruptedException
	{
		 Product();
	}
	@Test(priority=2)
	public void verifyAddtocart() throws InterruptedException
	{
		 AddItem();
	}
	@Test(priority=3)
	public void verifyRegistration()
	{
		 Registration();
	}
	@Test(priority=4)
	public void verifyDeliveryPage() throws InterruptedException
	{
		 Delivery();
		
	}
	@AfterTest
	public void verifycloseapp() throws InterruptedException
	{
		Thread.sleep(2000);;
		driver.close();
	}
}
