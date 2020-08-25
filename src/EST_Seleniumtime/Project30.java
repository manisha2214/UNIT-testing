package EST_Seleniumtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project30 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void CountIFrame()
	{
		int iframe_count = driver.findElements(By.tagName("iframe")).size();
		System.out.println("the number of iframes:"+ iframe_count);
		
	}
	public void draganddrop() throws InterruptedException
	{
		//first we need to switch frame to iframe
		driver.switchTo().frame(0);
		WebElement src = driver.findElement(By.id("draggable"));
		WebElement des = driver.findElement(By.id("droppable"));
		//drag and drop using actions
		Actions actobj = new Actions(driver);
		actobj.dragAndDrop(src, des).perform();
		Thread.sleep(2000);
		
	}
	public void closeAUT()
	{
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		Project30 obj = new Project30();
		obj.LaunchAUT();
		obj.CountIFrame();
		obj.draganddrop();
		//obj.closeAUT();

	}

}
