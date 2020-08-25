package EST_Seleniumtime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project28 {
	WebDriver driver;
	Actions actobj;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		//Thread.sleep(2000);
		driver.manage().window().maximize();
		//handle the pop-box using Actions method
		//create object for Actions
	    actobj = new Actions(driver);
	    //press escape key from keyboard
	    actobj.sendKeys( Keys.ESCAPE).perform();
	    Thread.sleep(2000);
		
	}
	public void Gettittle01()
	{
		String fliptitle = driver.getTitle();
		System.out.println("The title is:"+ fliptitle);
		String exp_title = "Welcome to Flipkart";
		if(fliptitle.equalsIgnoreCase(exp_title))
		{
			System.out.println("The test case is pass");
		}
	
		else
		{
			System.out.println("The test case is fail");
		}
}
	public void  SearchTc02() throws InterruptedException
	{
		//sending some data using traditional way
		//driver.findElement(By.name("q")).sendKeys("iphone");
		//i need to send some data using Actions method
		WebElement we = driver.findElement(By.name("q"));
		//using action
		actobj.sendKeys(we, "iphone").perform();
		//WebElement we1 = driver.findElement(By.xpath(" //button[@class='vh79eN']//*[local-name()='svg']"));
		actobj.sendKeys(Keys.ENTER).perform();
		//driver.findElement(By.xpath(" //button[@class='vh79eN']//*[local-name()='svg']")).click();
		Thread.sleep(2000);
		String act_title = driver.getTitle();
		if(act_title.contains("iphone"))
		{
			System.out.println("The test case is pass");
		}
		else
		{
			System.out.println("The test case is fail");
		}
	}
	public void closeAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		Project28 obj = new Project28();
		obj.LaunchAUT();
		obj.Gettittle01();
		obj.SearchTc02();
		obj.closeAUT();

	}

}
