package pageclass;




import javax.naming.ConfigurationException;


import TestBasePackage.TestBase;




public class indexpages extends TestBase{
		
	pathadress path = new pathadress();
//sınıfın yapıcı metodu yeni nesne oluturlarak çağırılır
		
		//Actions:
		public String validateLoginPageTitle() {
			
		//burada ana sayfa kontrolünü titleden aldığı değer ile sağlar
			return driver.getTitle();
		}
		

		public void closeadvertisement() throws InterruptedException, ConfigurationException{
			
			Thread.sleep(3000);
			//ilk açılıştıa pencereyi kapatır
			path.close.click();
		
			Thread.sleep(3000);
			
		}
		
	}
