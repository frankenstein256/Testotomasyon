package pageclass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import TestBasePackage.TestBase;



public class pathadress  extends TestBase{
	//sitedeki tüm xpathlar bu classta tanımlanır tanımlanır
	
	Actions action = new Actions(driver);
	
	public pathadress(){
		PageFactory.initElements(driver, this);
	}
	public String urlvalue = "C:\\Users\\Nergi\\eclipse-workspace\\testiniumtestotmasyontest\\src\\main\\java\\configpages\\value.properties";


	

	@FindBy(xpath="//*[@id=\"auto-complete-app\"]/div/div/input")
	WebElement search;
	

    	@FindBy(xpath="//*[@id=\"search-app\"]/div/div/div[2]/div[2]/div/div[3]/div[1]/a/div[1]/div/img")
		WebElement urun;
		
	@FindBy(xpath="//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[2]/div[5]/button[1]/div[1]")
		WebElement sepetekle;
		
	@FindBy(xpath="/html/head/title")
	WebElement titles;
		
	
	@FindBy(xpath="/html/body/div[7]/div/div/a")
	WebElement close;
	
	
	@FindBy(xpath="//*[@id=\"accountBtn\"]/div[1]")
	WebElement giris;
	@FindBy(id="email")
	WebElement email;
	@FindBy(id="password")
	WebElement password;
	@FindBy(xpath="//*[@id=\"loginSubmit\"]")
	WebElement buton;
	
	
	
	@FindBy(xpath="//*[@id=\"accountBtn\"]")
	WebElement myaccountBtn;
	
	@FindBy(xpath="//*[@id=\"account\"]/div[1]/ul/li[5]/a")
	WebElement myaccountname;
	

	@FindBy( xpath="//*[@id=\"UserModel_Email\"]")
	WebElement loginpathcontrol;
	
	@FindBy( xpath="//*[@id=\"auto-complete-app\"]/div/div/i")
	WebElement searchbuton;
	
	@FindBy( xpath="//*[@id=\"auto-complete-app\"]/div/div/input")
	WebElement searchcomputer;
	
	
	@FindBy( xpath="//*[@id=\"search-app\"]/div/div/div[2]")
	WebElement searchlist;
	
	@FindBy( xpath="//*[@id=\"partial-basket\"]/div/div[3]/div[2]/div[3]/div[1]/div/input")
	WebElement price;
	
	@FindBy( xpath="//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[2]/div[1]/button[1]/div[1]")
	WebElement addbasket;
	
	@FindBy( xpath="//*[@id=\"myBasketListItem\"]/div[1]/a/i")
	WebElement basket;
	
	@FindBy( xpath="//*[@id=\"partial-basket\"]/div/div[3]/div[2]/div[3]/div[1]/div/button[2]")
	WebElement 	increase;
	
	
	@FindBy( xpath="//*[@id=\"partial-basket\"]/div/div[3]/div[2]/div[3]/div[1]/div/input")
	WebElement 	incraseaddcont;
	

	
	
	@FindBy( xpath="//*[@id=\"partial-basket\"]/div/div[3]/div[2]/div[3]/button")
	WebElement delete;
	
	@FindBy( xpath="//*[@id=\"ngdialog1\"]/div[2]/form/div/div[2]/div/button[2]")
	WebElement deletecntrl;
	
	@FindBy( xpath="//*[@id=\"product-detail-app\"]/div/div[2]/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/span[2]")
	WebElement productprice;
	
	@FindBy( xpath="//*[@id=\"basketAside\"]/div/div/dl/dd[4]")
	WebElement basketproductprice;

	@FindBy( xpath="//*[@id=\"basketNoProductPage\"]/div[2]/div/div[1]")
	WebElement basketempty;
	

}
