package EST_Seleniumtime;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project27 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.nopcommerce.com/en/demo");
		driver.manage().window().maximize();
	}
	public void AdminArea() throws InterruptedException
	//store parent window handle
	{
		String parent_window = driver.getWindowHandle();
		System.out.println("parent window handle:"+ parent_window);
		driver.findElement(By.xpath(" //span[contains(text(),'Admin area')]")).click();
		Thread.sleep(2000);
		//now we need to get all the windows handles
		Set<String>all_windows = driver.getWindowHandles();
		Thread.sleep(2000);
		for(String handle:all_windows)
		{
			if(!handle.equals(parent_window)) {
				System.out.println("This is child window");
			//switch to child window
			driver.switchTo().window(handle);
			//automate login admin area
			driver.findElement(By.name("Email")).clear();
			driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
			driver.findElement(By.id("Password")).clear();
			driver.findElement(By.id("Password")).sendKeys("admin");
			driver.findElement(By.xpath("//input[@class='button-1 login-button']")).click();
			Thread.sleep(2000);
		}
			else
			{
				System.out.println("This is not child window");
			}
		
			
		
		}
		
		
		
		}
	       
	
	


	
	public void quitAUT()
	{
		driver.close();
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		Project27 obj = new Project27();
		obj.LaunchAUT();
		obj.AdminArea();
		obj.quitAUT();

	}

}
