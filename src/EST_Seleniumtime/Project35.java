package EST_Seleniumtime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project35 {
	WebDriver driver;
	JavascriptExecutor jse;
 public void launchAUT() throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver= new ChromeDriver();
	 driver.get("https://login.salesforce.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
 }
 public void senddata() throws InterruptedException
 {
	 //driver.findElement(By.name("username")).sendKeys("manisha@gmail.com");
	 jse = (JavascriptExecutor)driver;
	 WebElement we = driver.findElement(By.name("username"));
	 jse.executeScript("arguments[0].value='manisha@gmail.com';", we);
	 Thread.sleep(2000);
	 WebElement we1 = driver.findElement(By.name("pw"));
	 jse.executeScript("arguments[0].value = 'manisha12345';", we1);
	 Thread.sleep(2000);
	// WebElement we3 = driver.findElement(By.name("Login"));
	// jse.executeScript("aruguments[0].click;", we3);
	// Thread.sleep(2000);
	 
 }
 public void click() throws InterruptedException
 {

		jse = (JavascriptExecutor)driver;
		WebElement we1 = driver.findElement(By.id("Login"));
		jse.executeScript("arguments[0].click();", we1);
		Thread.sleep(2000);
				
	 }
		 
	 
		 
 public void closeAUT()
 {
	 driver.close();
 }

	public static void main(String[] args) throws InterruptedException {
		Project35 obj = new Project35();
		obj.launchAUT();
		obj.senddata();
		obj.click();
		obj.closeAUT();

	}

}
