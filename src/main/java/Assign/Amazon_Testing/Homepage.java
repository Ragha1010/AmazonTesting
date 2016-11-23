package Assign.Amazon_Testing;

import org.openqa.selenium.By;


public class Homepage {
	public static By searchbox =By.id("twotabsearchtextbox");
	public static By searchphone =By.xpath(".//*[@id='result_2']/div/div[3]/div[1]/a/h2");
	public static By submit =By.xpath(".//*[@id='nav-search']/form/div[2]/div/input");
	
	public static By Buyingoptions =By.id("buybox-see-all-buying-choices-announce");
	
public 	static By addtocart =By.xpath(".//*[@id='a-autoid-9']/span/input");
public 	static By Editbasket =By.xpath(".//*[@id='hlb-view-cart-announce']");
public 	static By Quantity =By.xpath(".//*[@id='activeCartViewForm']/div[2]/div/div[4]/div[2]/div[3]/div/div/span/span/span/span");

public 	static By Quantity_Selection =By.xpath(".//*[@id='dropdown3_2']");

public 	static By checkout =By.xpath(".//*[@id='sc-buy-box-ptc-button']/span");



public 	static By Name =By.id("ap_customer_name");
public 	static By Email1 =By.id("ap_email");
public 	static By paswrd =By.id("ap_password");
public 	static By paswrd1 =By.id("ap_password_check");
public 	static By create =By.id("continue");

public static By address=By.xpath(".//*[@id='address-book-entry-0']/div[2]/span/a");

public static By dispatch=By.xpath(".//*[@id='shippingOptionFormId']/div[1]/div[2]/div/span[1]/span/input");









}
