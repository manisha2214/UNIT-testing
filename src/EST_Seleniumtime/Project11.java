package EST_Seleniumtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project11 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}
	public void senddata() throws InterruptedException
	{
		driver.findElement(By.name("q")).sendKeys("Selemium");
		Thread.sleep(2000);
		driver.findElement(By.name("btnK")).click();
	}
	public void closeAUT()
	{
		driver.close();
	}
	

	public static void main(String[] args) throws InterruptedException {
		Project11 obj = new Project11();
		obj.LaunchAUT();
		obj.senddata();
		obj.closeAUT();
	

	}

}
