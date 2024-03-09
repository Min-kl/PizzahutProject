package pageObjectpack;

import java.time.Duration;
import java.util.List;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ObjectClass {
	
	public WebDriver ldriver;

	public ObjectClass(WebDriver rdriver) {
		ldriver=rdriver;
		PageFactory.initElements(ldriver,this);
	}
	
	@FindBy(xpath="//*[@placeholder=\"Enter your location for delivery\"]")
	WebElement enterlocation;
	
	@FindBy(xpath="//button[contains(@role,\"option\")]")
	List<WebElement> selectlocation;
	
	@FindBy(xpath="//a[@data-synth=\"link--pizzas--side\"]")
	WebElement selectpizza;
	
	@FindBy(xpath="//div[@class=\"cursor-pointer flex\"]/span[2]/span[1]")
	WebElement vegbutton;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div[2]/div[2]/span/div[1]/a[1]/div[3]/div/button")
	WebElement firstoptionpizza;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div[2]/div[2]/span/div[1]/a[1]/div[3]/div/button/span[2]")
	WebElement pizzaprice;
	
	@FindBy(xpath="//div[@class=\"flex lg:flex-col\"]/div[1]/div[1]/a[5]")
	WebElement drinkoption;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div[2]/div[2]/span/div/a[1]/div[3]/div/button/span[1]/span")
	WebElement selectdrink;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div[1]/div[3]/div[2]/div[2]/span/div/a[1]/div[3]/div/button/span[2]")
	WebElement drinkprice;
	
	@FindBy(xpath="//*[@id=\"basket\"]/div[3]/div/div[1]/button[2]")
	WebElement removepizza;
	
	@FindBy(xpath="//*[@id=\"app\"]/div/div[1]/div[2]/div/div[2]/div[3]/div[2]/div/div/button/span[2]/span")
	WebElement checkout;
	
	@FindBy(xpath="//button[@class=\"icon-remove--md absolute top-0 right-0 mr-10 mt-10\"]")
	WebElement closeicon;
	
	public void locationselection() throws InterruptedException
	{
		enterlocation.sendKeys("Aurangabad");
		Thread.sleep(2000);
		List<WebElement> LIST = selectlocation;
		  

	    for (WebElement e:LIST)
	    {
	       String name=e.getText();
	       if(name.contains("Aurangabad Railway Station"))
	       {
	    	   e.click();
	       }
	       break;
	    }
		Thread.sleep(1000);
	}
	
	public void itemselection() throws InterruptedException  {
		Thread.sleep(3000);
		selectpizza.click();
		vegbutton.click();
		Thread.sleep(3000);
		firstoptionpizza.click();
		Thread.sleep(1000);
		drinkoption.click();
		Thread.sleep(2000);
		selectdrink.click();
		Thread.sleep(2000);
		
	}
	
	public void removeitems() throws InterruptedException {
		removepizza.click();
		Thread.sleep(1000);
		checkout.click();
		Thread.sleep(2000);
		closeicon.click();
		
		Thread.sleep(4000);
	}

}
