package baseclass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BaseClass {

	public static WebDriver driver;
	
	public static WebDriver getDriver (String browserName)
	{
		try {
			if (browserName.equalsIgnoreCase("chrome")) 
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\deepa\\eclipse-workspace\\Seleniumproject\\Driver\\chromedriver.exe");
				
				driver = new ChromeDriver();
			}
		}
		catch (Exception e)
			{
				e.printStackTrace();
			}
			
			driver.manage().window().maximize();
			return driver;
			}
	public static void getUrl(String url)
	{
		driver.get("https://www.amazon.com/");
	}
	public static void currentUrl()
	{
		driver.getCurrentUrl();
	}
	public static void forward()
	{
		driver.navigate().forward();
	}
	public static void backward()
	{
		driver.navigate().back();
	}
	public static void refresh()
	{
		driver.navigate().refresh();
	}
	public static void navigateTo(String url)
	{
		driver.navigate().to("https://www.amazon.com/");
	}
	public static void getTitle() {
		driver.getTitle();
	}
	public static void quite()
	{
		driver.quit();
	}
	public static void close()
	{
		driver.close();
	}
	
	public static void enabled(WebElement element)
	{
		element.isEnabled();
	}
public static void displayed(WebElement element)
{
	element.isDisplayed();
}
public static void selected(WebElement element)
{
element.isSelected();	
}

}
		
	
