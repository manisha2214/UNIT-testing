package EST_Seleniumtime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project18 {
	WebDriver driver;
	
public void LaunchAUT() throws InterruptedException
{
	System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	driver = new ChromeDriver();
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	driver.manage().window().maximize();
	}
	public void Navigate() throws InterruptedException
	{
		driver.navigate().to("https://www.salesforce.com/");
		Thread.sleep(2000);
		driver.navigate().refresh();
		Thread.sleep(2000);
		driver.navigate().back();
		Thread.sleep(2000);
		driver.navigate().forward();
		Thread.sleep(2000);
	}
	public void CloseAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		Project18 obj = new Project18();
		obj.LaunchAUT();
		obj.Navigate();
		obj.CloseAUT();
		

	}

}
