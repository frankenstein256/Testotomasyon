package pageclass;



import TestBasePackage.TestBase;






public class loginpage extends TestBase{
	
	pathadress path = new pathadress();
	//sınıfın yapıcı metodu yeni nesne oluturlarak çağırılır
	
	
	
	public void login(String email1, String password1) throws InterruptedException{
//ilk açılışta karşımıza gelen pencereyi kapatır
		path.close.click();
		Thread.sleep(3000);
		Thread.sleep(3000);
		//giriş butona basar
		path.giris.click();
		Thread.sleep(3000);
		//email verisini gönderir
		path.email.sendKeys(email1);
		Thread.sleep(3000);
		//şifreyi gönderir
		path.password.sendKeys(password1);
		Thread.sleep(3000);
		path.buton.click();
		    	
		
	}
	
	public String logincontrol() throws InterruptedException
	{
		Thread.sleep(3000);
		path.myaccountBtn.click();
		Thread.sleep(3000);
		path.myaccountname.click();
		return path.loginpathcontrol.getAttribute("value");
	}
	
	
}
