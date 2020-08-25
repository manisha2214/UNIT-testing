package EST_Seleniumtime;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Project33 {
	 WebDriver driver;
	 Actions actobj;
	 public void LaunchAUT() throws InterruptedException
	 {
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 driver = new ChromeDriver();
		 driver.get("https://www.walmart.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(2000);
	 }
	 public void search01() throws InterruptedException
	 {
		 WebElement we = driver.findElement(By.name("query"));
		 actobj.sendKeys(we, "home").perform();
		 for( int i=1; i<=5; i++);
		 {
			 
			 actobj.sendKeys(Keys.DOWN).perform();
			 Thread.sleep(2000);
		 }
		 actobj.sendKeys(Keys.ENTER).perform();
			 
	 }
	 public void closeAUT()
	 {
		 driver.close();
	 }

	public static void main(String[] args) throws InterruptedException {
		Project33 obj = new Project33();
		obj.LaunchAUT();
		obj.search01();
		obj.closeAUT();

	}

}
