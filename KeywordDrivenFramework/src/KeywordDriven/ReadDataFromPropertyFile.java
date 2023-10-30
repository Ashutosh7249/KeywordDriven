package KeywordDriven;

import java.io.FileInputStream;
import java.util.Properties;

public class ReadDataFromPropertyFile implements IAutoConsts  {
	public static void main(String[] args) throws Throwable {
		FileInputStream fis =new FileInputStream(Prop_path);
		Properties prop=new Properties();
		prop.load(fis);
		String prpVal = prop.getProperty("browser");
		Thread.sleep(3000);
		System.out.println(prpVal);
	}

}
