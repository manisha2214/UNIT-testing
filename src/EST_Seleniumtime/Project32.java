package EST_Seleniumtime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project32 {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		//Thread.sleep(2000);
		actobj =new Actions(driver);
		actobj.sendKeys(Keys.ESCAPE).perform();
		Thread.sleep(2000);
		
		}
	public void Searchtc01() throws InterruptedException
	{//locate element
		WebElement we =driver.findElement(By.name("q"));
		//we need to send some data inside of the search field
		actobj.sendKeys(we, "selenium").perform();
		//press down arrow 7 times
		for(int i=1; i<=7;i++);
		{
			actobj.sendKeys(Keys.DOWN).perform();
			Thread.sleep(2000);
		}
		//press enter
		actobj.sendKeys(Keys.ENTER).perform();
			
	
	}
	public void closeAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		Project32 obj = new Project32();
		obj.LaunchAUT();
		obj.Searchtc01();
		//obj.closeAUT();

	}

}
