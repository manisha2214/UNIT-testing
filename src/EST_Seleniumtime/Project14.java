package EST_Seleniumtime;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Project14 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Manisha please enter your favorite browser");
		String browser = sc.nextLine();
		if(browser.equals("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
			driver = new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver","C:\\Users\\sanip\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
			driver = new FirefoxDriver();
			
		}
		else
		{
			System.out.println("Browser not found");
		}
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void CloseAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException   {
		Project14 obj = new Project14();
		obj.LaunchAUT();
		obj.CloseAUT();

	}

}
