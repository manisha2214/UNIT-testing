package EST_Seleniumtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project22 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.wellsfargo.com/help/online-banking/sign-on-faqs/?linkLoc=signon");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void clickforgetIDpasscode() throws InterruptedException
	{
		driver.findElement(By.linkText("<a href=\"https://oam.wellsfargo.com/oamo/identity/help/passwordhelp\" enrollmentid=\"2475\">Create New Password</a>")).click();
		Thread.sleep(2000);
		driver.switchTo().alert();
		Thread.sleep(2000);
	}
	public void clickdismiss() throws InterruptedException
	{
		driver.findElement(By.linkText("<a href=\"https://oam.wellsfargo.com/oamo/identity/help/passwordhelp\" enrollmentid=\"2475\">Create New Password</a>")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().dismiss();
		Thread.sleep(2000);
	}
	public void gettextalert() throws InterruptedException
	{
		driver.findElement(By.linkText("<a href=\"https://oam.wellsfargo.com/oamo/identity/help/passwordhelp\" enrollmentid=\"2475\">Create New Password</a>")).click();
		Thread.sleep(2000);
		String alert_text = driver.switchTo().alert().getText();
		System.out.println("Alert msg is:" + alert_text);
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
				
	}
	public void senddata() throws InterruptedException
	{
		driver.findElement(By.linkText("<a href=\"https://oam.wellsfargo.com/oamo/identity/help/passwordhelp\" enrollmentid=\"2475\">Create New Password</a>")).click();
		Thread.sleep(2000);
		driver.switchTo().alert().sendKeys("manisha3876");
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
		Thread.sleep(2000);
		driver.switchTo().alert().accept();
	}
	public void closeAUT()
	{
		driver.close();
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		Project22 obj = new Project22();
		obj.LaunchAUT();
		obj.clickforgetIDpasscode();
		obj.clickdismiss();
		obj.gettextalert();
		obj.senddata();
		//obj.closeAUT();

	}

}
