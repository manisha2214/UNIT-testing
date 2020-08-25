package EST_Seleniumtime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project37 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void senddata() throws InterruptedException
	{
		jse = (JavascriptExecutor)driver;
		WebElement we = driver.findElement(By.id("email"));
		jse.executeScript("arguments[0].value='manisha2gmail.com';", we);
		Thread.sleep(2000);
		WebElement we1 = driver.findElement(By.id("pass"));
		jse.executeScript("arguments[0].value = 'manisha2876';", we1);
		Thread.sleep(2000);
	}
	public void Highlight() throws InterruptedException
	{
		jse = (JavascriptExecutor)driver;
		WebElement we2 = driver.findElement(By.id("email"));
		jse.executeScript("arguments[0].style = 'border:5px dotted red';", we2);
		Thread.sleep(2000);
	}
	public void click() throws InterruptedException
	{
		jse = (JavascriptExecutor)driver;
		WebElement we3 = driver.findElement(By.id("loginbutton"));
		jse.executeScript("arguments[0].click();", we3);
		Thread.sleep(2000);
		
	}
	public void closeAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		Project37 obj = new Project37();
		obj.LaunchAUT();
		obj.senddata();
		obj.Highlight();
		obj.click();
		obj.closeAUT();
				

	}

}

