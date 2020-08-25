package EST_Seleniumtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project13 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void Senddata(String username, String password) throws InterruptedException
	{
		driver.findElement(By.id("username")).sendKeys(username);
		Thread.sleep(2000);
		driver.findElement(By.id("password")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.id("Login")).click();
		Thread.sleep(2000);
		
	}
	public void pageSrc()
	{
		String src = driver.getPageSource();
		System.out.println("The page src:"+ src);
		if(src.contains("Please check your username and password."))
		{
			System.out.println("The test is pass");
		}
	
		else
		{
			System.out.println("The test case failed");
		}
	}
	
		public void closeAUT()
		{
			driver.close();
		}


	

	
	public static void main(String[] args) throws InterruptedException {
		Project13 obj = new Project13();
		obj.LaunchAUT();
		//positive testing
		obj.Senddata("manishashrestha123@gmail.com", "manisha1234");
		//negative testing
		obj.Senddata("pawan123@gmail.com", "pawan123@");
		obj.Senddata("anil123@gmail.com", "anil456#");
		obj.Senddata("shweta123@gmail.com", "shweta123$");
		obj.pageSrc();
		obj.closeAUT();
	}
	}

	




