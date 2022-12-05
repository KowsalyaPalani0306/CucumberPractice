package com.stepdefinition.practice;

import java.awt.Window;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.SendKeysAction;

import com.app.base.BaseClass;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class FlipkartStepDefinition extends BaseClass {

	@Given("Launch Flipkart URL")
	public void launch_flipkart_url() {
		browserOpen("chrome");
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		click(findElementByXpath("//*[text()='✕']"));
	
	}

	@When("Search for {string} Product")
	public void search_for_product(String string) {
		WebElement element = findElementByXpath("//*[@title=\"Search for products, brands and more\"]");
		element.sendKeys("Oppo");
		click(findElementByXpath("//*[@width=\"20\"]"));
	}
	@When("Click on the First Product")
	public void click_on_the_first_product() {
    	driver.navigate().to("https://www.flipkart.com/search?q=Oppo&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off"); 
		String window = driver.getWindowHandle();
		System.out.println(window);
		Thread.sleep(3000);
		driver.navigate().to("https://www.flipkart.com/oppo-k10-black-carbon-128-gb/p/itm6205e7e72fe0c?pid=MOBGCFUHMDFSCM9W&lid=LSTMOBGCFUHMDFSCM9WSL0U8O&marketplace=FLIPKART&q=Oppo&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=3882110f-2cbf-4b2f-aef1-4f55ffa9c737.MOBGCFUHMDFSCM9W.SEARCH&ppt=sp&ppn=sp&ssid=2kuz9w32rk0000001668930515125&qH=c1e8e7e7170ee9d9");
		Set<String> childWindow=driver.getWindowHandles();
		for(String newwindows: childWindow) {
			if(!window.equals(childWindow)) {
				driver.switchTo().window(newwindows); 
	   System.out.println(newwindows);
    	click(findElementByXpath("//*[@class='_4rR01T'])[1]"));
		driver.navigate().to("https://www.flipkart.com/oppo-k10-black-carbon-128-gb/p/itm6205e7e72fe0c?pid=MOBGCFUHMDFSCM9W&lid=LSTMOBGCFUHMDFSCM9WSL0U8O&marketplace=FLIPKART&q=Oppo&store=tyy%2F4io&srno=s_1_1&otracker=search&otracker1=search&fm=Search&iid=3b4eb2ef-4c85-4ab9-a648-efa51d1eed2b.MOBGCFUHMDFSCM9W.SEARCH&ppt=sp&ppn=sp&ssid=59xfk3uueo0000001668930362624&qH=c1e8e7e7170ee9d9");
		click(findElementByXpath("//*[@class='_2KpZ6l _2U9uOA _3v1-ww']")); //add to cart
	}
		}
//	@When("Click on Go to Cart")
//	public void click_on_go_to_cart() throws Throwable {

//	}
//		}
//		}
//		
//	@And("get next window")	
//	public void go_to_the_addToCart_Page() {	
//		click(findElementByXpath("//*[@class='_4rR01T']"));
//		click(findElementByXpath("//*[text()=\"ADD TO CART\"]"));
//	    click(findElementByXpath("//*[@class='_2KpZ6l _2U9uOA _3v1-ww']"));
//	}
//
//	@Then("Get the Product Price")
//	public void get_the_product_price() throws InterruptedException {
//		System.out.println("Total Amount ");
//		driver.navigate().to("https://www.flipkart.com/viewcart?exploreMode=true&preference=FLIPKART");
//		Thread.sleep(7000);
//		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[2]/div[1]/div/div/div/div[5]/div/span/div/div/span")).getText();

	}
}
