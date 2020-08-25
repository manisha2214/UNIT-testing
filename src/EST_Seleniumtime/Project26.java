package EST_Seleniumtime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project26 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		String[]browser = {"chrome","Firefox"};
		for(String browsers : browser)
		{
			if(browsers.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
				driver = new ChromeDriver();
			}
			else if(browsers.equals("Firefox"))
			{
			  System.setProperty("webdriver.gecko.driver", "C:\\Users\\sanip\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			  driver = new FirefoxDriver();
			}
		
			else
			{
				System.out.println("The browser not found");
			}
			driver.get("https://www.ebay.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.close();
		}
		
	}

	public void closeAUT()
	{
		driver.close();
	}	
	

	public static void main(String[] args) throws InterruptedException {
		Project26 obj = new Project26();
		obj.LaunchAUT();
		obj.closeAUT();

	}

}