package pageclass;


import java.util.List;
import java.util.Random;

import javax.naming.ConfigurationException;

import org.apache.commons.configuration.PropertiesConfiguration;
import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;


import TestBasePackage.TestBase;



public class stackpage extends TestBase{
	PropertiesConfiguration config ;

	pathadress path = new pathadress();
	//sınıfın yapıcı metodu yeni nesne oluturlarak çağırılır

public void searchcomputers () throws org.apache.commons.configuration.ConfigurationException, InterruptedException {
		
		
		config=new PropertiesConfiguration("C:\\Users\\Nergi\\eclipse-workspace\\testiniumtestotmasyontest\\src\\main\\java\\configpages\\value.properties");
	    driver.get((String) config.getProperty("url"));
	 //arama barına tıklanır metin girişi için
	    path.searchcomputer.click();
	    Thread.sleep(2000);
	    //bişgisayar valuesi gönderilir
	    path.searchcomputer.sendKeys("bilgisayar");
	    Thread.sleep(2000);
	    //arama bununa tıklanır
	    path.searchbuton.click();
	    Thread.sleep(2000);
	    
	    //sayfada çıkan arama sonuçlarını lis'e ekler
	    List<WebElement> links= driver.findElements(By.xpath("//*[@id=\"search-app\"]/div/div/div[2]"));
	   //list dizisinin uzunluğunu alır
	    int count=links.size();
	   // System.out.println("Number of links are:"+count); 
	    
	    Random r=new Random();
	    int linkNo=r.nextInt(count); //tanımlana random sayısının değer aralığı size kadardır
	    WebElement link=links.get(linkNo); //üretilen sayı gönderilir
	  //  System.out.println(link.getText());
	    Thread.sleep(2000);
	    link.click(); //gönderlilen sayıya ait link getirilir
	  //toplamda bilgisayar kelimesi arama sonuçlarına göre rast gelen bir ürün seçimi yapılır	    
	   
	
	}
	public void basket() throws InterruptedException, ConfigurationException, org.apache.commons.configuration.ConfigurationException{
	    
			
			    Thread.sleep(3000);
			    //çıkan ürün sayfasında ücret verisi alınır ve page.value sayfasına gönderilir
			    config.setProperty("pageprice", path.productprice.getText());
				   config.save();
				    Thread.sleep(3000);

				   //seçilen ürünün sepete eklenmesi
				    path.addbasket.click();
				    Thread.sleep(3000);
				    //sepet görüntülenir
				    path.basket.click();
				  
				   Thread.sleep(3000);
				   	   
	}
	public String basketproductprices() throws InterruptedException {
		//burada da sepetteki ürünün sepetteki fiyatı geri döndürülür
		return path.basketproductprice.getText();
	}
	
	public String priceincreasing() throws InterruptedException {
		
		Thread.sleep(3000);
		//sepete eklenen ürünün miktarının artışı gerçekleşir
		path.increase.click();
		Thread.sleep(3000);
	//ürün miktarı 2 adetmi anlamak için arttırılan ürünün miktarını geri döndürüyoruz
	   return path.incraseaddcont.getAttribute("value");
	}

public String deleteProduct() throws InterruptedException {

		Thread.sleep(3000);
		//sepeti temizlioyruz
		path.delete.click();
		Thread.sleep(3000);
		//onay penceresinde de sil seçeneğini seçiyor ve seperti boşaltıypr
		path.deletecntrl.click();
		Thread.sleep(3000);
	  // sepet boşmu diye ekrandaki textin valuesini geri döndürüyor
	  return path.basketempty.getText();
	}
	
	}