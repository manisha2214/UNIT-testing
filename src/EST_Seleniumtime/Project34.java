package EST_Seleniumtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project34 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void Rightclick() throws InterruptedException
	{
		WebElement we = driver.findElement(By.id("about-us_menu_item"));
		Actions actobj = new Actions(driver);
		actobj.contextClick(we).perform();
		Thread.sleep(2000);
		
	}
	public void closeAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		Project34 obj = new Project34();
		obj.LaunchAUT();
		obj.Rightclick();
		obj.closeAUT();
	}

}
