package KeywordDriven;

import org.openqa.selenium.By;

public class ValidLoginTest extends BaseTest{
	public static void main(String[] args) throws Throwable {
		BaseTest bt=new BaseTest();
		bt.OpenBrowser();
		FileLib flib=new FileLib();
		String un = flib.getPropKeyValue(Prop_path, "username");
		String pwd = flib.getPropKeyValue(Prop_path, "password");
		Thread.sleep(3000);
		driver.findElement(By.id("username")).sendKeys(un);
		Thread.sleep(3000);
		driver.findElement(By.id("password")).sendKeys(pwd);
		Thread.sleep(3000);
		driver.findElement(By.id("submit")).click();
	}

}
