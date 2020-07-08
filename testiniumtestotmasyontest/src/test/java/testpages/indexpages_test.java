package testpages;

import org.apache.commons.configuration.ConfigurationException;

import org.testng.Assert;
import org.testng.annotations.Test;



import TestBasePackage.TestBase;
import pageclass.indexpages;



public class indexpages_test extends TestBase {

	indexpages indexpage;

	
	public indexpages_test() {
		super();
		initialization();
		indexpage = new indexpages ();
	}
	
	@Test(priority=1)
	public void HomePageTitleTest() throws ConfigurationException{
	//ilk test anasayfa testi testpage clasındaki geri dndürülen title değeri buradaki title değişkenine atanır
		String title = indexpage.validateLoginPageTitle();
	//değer kaşılaştırması yapılır okunan değer ile olması gereken değerlerin paratreleri alınır
		Assert.assertEquals(title,"En Trend Ürünler Türkiye'nin Online Alışveriş Sitesi Trendyol'da");
		
	}
	@Test(priority=2)
	public void close() throws InterruptedException, ConfigurationException, javax.naming.ConfigurationException{
		Thread.sleep(3000);
	    //karşımıza çıkan reklamı kapatmak için tanımlamıştır
		indexpage.closeadvertisement();
		
	}
	
	
	
	
	
	
	
	
	

}

