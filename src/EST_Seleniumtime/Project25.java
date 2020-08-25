package EST_Seleniumtime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project25 {
	WebDriver driver;
	String browsername1 = "Firefox";
	public void ExecuteMultiBrowser() throws InterruptedException
	{
		Project25 obj = new Project25();
		if(obj.browsername1.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\sanip\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			System.out.println("This is browser 1");
		}
		else if(obj.browsername1.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
			System.out.println("This is browser 2");
		}
		else
		{
			System.out.println("browser not found");
		}
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void closeAUT()
	{
		driver.close();
	}
	

	public static void main(String[] args) throws InterruptedException {
		Project25 obj1 = new Project25();
		obj1.ExecuteMultiBrowser();
		obj1.closeAUT();

	}

}
