package testpages;

import org.testng.Assert;
import org.testng.annotations.Test;

import TestBasePackage.TestBase;
import pageclass.loginpage;

public class logainpage_test extends TestBase{
	
loginpage loginPage;
	
	
	public logainpage_test() {
		super();
		initialization();
		loginPage = new loginpage();
	}
	

	
	@Test(priority=1)
	public void loginTest() throws InterruptedException{
		//ana sayfaya erişilir ve burrada login işlemi gerçekleştirilir
		Thread.sleep(3000);
	    loginPage.login("nergin.turgut256@gmail.com", "Naciye.111");
	    //bu değerler login class içerisindeki metoda ulaşır ve değerleri gönderir
	    
		
	}
	
	@Test(priority=2)
	public void logincontrolTest() throws InterruptedException{

		//giriş yapılan sayfada hesap bilgilerine erişilip gmail kontrolü sağlanıyor
		//giriş başarılı mı kontrolü
		Thread.sleep(3000);
		//olması gereken değer ile okunan değer karşılaşır
	String title="nergin.turgut256@gmail.com";
	Assert.assertEquals(loginPage.logincontrol(),title); 
		
	}

}
