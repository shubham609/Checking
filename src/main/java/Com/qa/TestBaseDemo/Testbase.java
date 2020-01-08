package Com.qa.TestBaseDemo;

import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testbase 
{
	public static WebDriver driver;
	public static Properties prop;
	
public Testbase() 
{
		try
		{
	    	FileInputStream ip=new FileInputStream("F:\\selenium\\OrangeHRM\\src\\main\\java\\Com\\Orange\\Configration\\Config.properties");
		    prop=new Properties();
		    prop.load(ip);
		}
		catch(Exception e)
		{
		System.out.println(e.getMessage());
		}
	}

public static void initialization()
{
	String browserName=prop.getProperty("browser");
	if(browserName.equalsIgnoreCase("Chrome"))
	{
		System.setProperty(prop.getProperty("Systemproperty_1"),prop.getProperty("Systemproperty_2"));
		driver=new ChromeDriver();
	}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
}

}
