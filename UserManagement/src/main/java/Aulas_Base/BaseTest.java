package Aulas_Base;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.time.Duration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Util.TestUtil;

public class BaseTest {
	
	
	
	public static WebDriver driver;
	public static Properties prop;
	
	public BaseTest()
	{
		try
		{
			prop=new Properties();
			FileInputStream ip=new FileInputStream (System.getProperty("user.dir")+"\\src\\main\\java\\ConfigProperties");
			prop.load(ip);
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
		
	}
	
	
	
	public static void initilization() throws InterruptedException
	{
		String browserName=prop.getProperty("browser");
		if(browserName.equals("chrome"))
		{
			ChromeOptions options=new ChromeOptions();
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("download.default_directory", System.getProperty("user.dir")+"\\Downloads");
			options.setExperimentalOption("prefs", prefs);
			options.addArguments("--disable-notifications");
			System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver101\\chromedriver103.exe");
		    driver= new ChromeDriver(options);
		    
		   // options.addArguments("headless");  // without opening browser test cases run
		    
		}
		else if(browserName.equals("FF"))
		{
			/*	Proxy proxy = new Proxy();

			proxy.setHttpProxy("ipaddress:4444");

			options.setCapability("proxy", proxy); */
			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\Drivers\\geckodriver.exe");
		    driver= new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIME, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICT_WAIT, TimeUnit.SECONDS);
		//driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		WaitTil(4000);
		driver.get(prop.getProperty("url"));
		WaitTil(6000);
		
		
		
	}

	public void getScreenShotPath(String testCaseName,WebDriver driver) throws IOException
	{
	TakesScreenshot ts=(TakesScreenshot) driver;
	File source = ts.getScreenshotAs(OutputType.FILE);
	String DestinationFile =System.getProperty(System.getProperty("user.dir")+"\\Screenshots"+testCaseName+"_"+".png");
	//FileUtils.copyFile(source, new File("C:\\Users\\Brigosha_Guest\\eclipse-workspace\\AulasProject\\Screenshots"+testCaseName+"_"+".jpg"));
	FileUtils.copyFile(source, new File(DestinationFile));

	}
	
	public static void Wait(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	public static void WaitUnTil(WebElement ele)
	{
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(900));
		wait.until(ExpectedConditions.elementToBeClickable(ele));
	}
	public static void WaitTil(int Wait)
	{
		try {
			Thread.sleep(Wait);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

}
