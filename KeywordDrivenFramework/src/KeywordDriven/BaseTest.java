package KeywordDriven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseTest implements IAutoConsts {
	public static WebDriver driver;
	public void OpenBrowser() throws Throwable
	{
		FileLib flib=new FileLib();
		String browser = flib.getPropKeyValue(Prop_path,"browser" );
		if(browser.equals("chrome"))
		{
		System.setProperty(Chrome_key, Chrome_path);
		driver=new ChromeDriver();
		
		}
		else if(browser.equals("firefox"))
		{
			System.setProperty(Firefox_key ,Firefox_path);
			driver=new FirefoxDriver();
			
		}
		driver.manage().window().maximize();
        String appUrl = flib.getPropKeyValue(Prop_path, "url");
        driver.get(appUrl);
	}

}
