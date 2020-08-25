package EST_Seleniumtime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project36 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	public void click() throws InterruptedException
	{
		jse = (JavascriptExecutor)driver;
		WebElement we1 = driver.findElement(By.id("Login"));
		jse.executeScript("arguments[0].click();", we1);
		Thread.sleep(2000);
				
	}
	public void Senddata() throws InterruptedException
	{
		jse =(JavascriptExecutor)driver;
		WebElement we2 = driver.findElement(By.id("username"));
		jse.executeScript("arguments[0].value = 'manisha@gmail.com';", we2);
		Thread.sleep(2000);
		WebElement we3 = driver.findElement(By.id("password"));
		jse.executeScript("arguments[0].value='manisha1234';", we3);
		Thread.sleep(2000);
		
	}
	public void Highlight() throws InterruptedException
	{
		jse = (JavascriptExecutor)driver;
		WebElement we4 = driver.findElement(By.id("password"));
		jse.executeScript("arguments[0].style = 'border: 5px solid red';",we4);
		Thread.sleep(2000);
	}
	public void closeAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		Project36 obj = new Project36();
		obj.LaunchAUT();
		obj.Senddata();
		obj.Highlight();
		obj.click();
		//obj.Highlight();
		obj.closeAUT();
				}

}
