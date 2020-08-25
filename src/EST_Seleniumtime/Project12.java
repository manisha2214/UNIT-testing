package EST_Seleniumtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project12 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void logininformation(String email, String password) throws InterruptedException
	
	{
		driver.findElement(By.id("email")).sendKeys(email);
		Thread.sleep(2000);
		driver.findElement(By.id("pass")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("u_0_2")).click();
		Thread.sleep(2000);
		
	}
	public void pageSrc()
	{
		String page_src = driver.getPageSource();
		if(page_src.contains("Please Check Email and Password"))
		{
			System.out.println("the test case is pass");
		}
		else
		{
			System.out.println("the test case is failed");
		}
	}
	public void closeAUT()
	{
		driver.close();
	}
		
		


	public static void main(String[] args) throws InterruptedException {
		Project12 obj = new Project12();
		obj.LaunchAUT();
		obj.logininformation("manisha123@gmail.com", "manisha789");
		obj.pageSrc();
		obj.closeAUT();
		
		
	

	
	}

}
