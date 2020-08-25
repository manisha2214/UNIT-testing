package EST_Seleniumtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project21 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver =  new ChromeDriver();
		driver.get("https://www.indiehackers.com/sign-in");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void ClickReset() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		//switch to driver object from webpage to alert.
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
	}
	public void ClickDismiss() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		//switch to driver object from webpaage to alert dismiss
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
	}
	public void GetTextalert() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		//switch to driver object from webpage tp alert get text
		String alert_msg = driver.switchTo().alert().getText();
		System.out.println("Alert msg is:"+ alert_msg);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		//driver.switchTo().alert().accept();
		
	}
	public void SendData() throws InterruptedException
	{
		driver.findElement(By.linkText("Reset")).click();
		Thread.sleep(2000);
		//senddata to alert input box
		driver.switchTo().alert().sendKeys("manishagyh@gmail.com");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	public void CloseAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		Project21 obj =  new Project21();
		obj.LaunchAUT();
		obj.ClickReset();
		obj.ClickDismiss();
		obj.GetTextalert();
		obj.SendData();
		obj.CloseAUT();


	}

}
