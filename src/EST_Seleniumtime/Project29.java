package EST_Seleniumtime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project29 {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		actobj = new Actions(driver);
		actobj.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
	}
	public void gettitle1()
	{
		String walmart = driver.getTitle();
		System.out.println("The title is:"+ walmart);
		String exp_out = "Welcome to walmart";
		if(walmart.equalsIgnoreCase(exp_out))
		{
			System.out.println("The test case is pass");
		}
		else
		{
			System.out.println("The test case is fail");
		}
		
	}
	public void search2() throws InterruptedException
	{
		WebElement we = driver.findElement(By.name("query"));
		actobj.sendKeys(we, "macbook").perform();
		actobj.sendKeys(Keys.ENTER).perform();
		Thread.sleep(2000);
		String act_title = driver.getTitle();
		System.out.println("The title of iphone:"+ act_title);
		if(act_title.contains("macbook"))
		{
			System.out.println("The test case is pass");
		}
		else
		{
			System.out.println("The test case is fail");
		}
		
	}
	public void closeAUt()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		Project29 obj = new Project29();
		obj.LaunchAUT();
		obj.gettitle1();
		obj.search2();
		obj.closeAUt();

	}

}
