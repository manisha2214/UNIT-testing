package EST_Seleniumtime;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project39 {
	WebDriver driver;
	JavascriptExecutor jse;
	
 public void LaunchAUT() throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.ebay.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
 }
 public void senddata() throws InterruptedException
 {
	 jse = (JavascriptExecutor)driver;
	 WebElement we = driver.findElement(By.id("gh-ac"));
	 jse.executeScript("arguments[0].value = 'macbook';", we);
	 Thread.sleep(2000);
 }
 public void Highlight() throws InterruptedException
 {
	 jse = (JavascriptExecutor)driver;
	 WebElement we1 = driver.findElement(By.id("gh-ac"));
	 jse.executeScript("arguments[0].style = 'border:5px solid red';", we1);
	 Thread.sleep(2000);
			 
 }
 public void Click() throws InterruptedException
 {
	 jse = (JavascriptExecutor)driver;
	 WebElement we2 = driver.findElement(By.id("gh-btn"));
	 jse.executeScript("arguments[0].click();", we2);
	 Thread.sleep(2000);
 
 
 }
 public void refreshpage() throws InterruptedException
 {
	 jse = (JavascriptExecutor)driver;
	 jse.executeScript("history.go(0);");
	 Thread.sleep(2000);
	 
 }
 public void pageScrolling() throws InterruptedException
 {
	 jse = (JavascriptExecutor)driver;
	 jse.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	 Thread.sleep(2000);
	 jse.executeScript("window.scrollTo(document.body.scrollHeight,0)");
	 Thread.sleep(2000);
 }
 public void getpagetittle() throws InterruptedException
 {
	 jse = (JavascriptExecutor)driver;
	 String str = jse.executeScript("return document.title;").toString();
		System.out.println("the title is:"+ str);
		Thread.sleep(2000);
 }
 public void getinnertext() throws InterruptedException
 {
	 jse = (JavascriptExecutor)driver;
	 String str1 = jse.executeScript("return document.documentElement.innerText;").toString();
		System.out.println("the innertext:"+ str1);
		Thread.sleep(2000);

 }
 public void CloseAUT()
 {
	 driver.close();
 }
 

	public static void main(String[] args) throws InterruptedException {
		Project39 obj = new Project39();
		obj.LaunchAUT();
		obj.senddata();
		obj.Highlight();
		obj.Click();
		obj.refreshpage();
		obj.pageScrolling();
		obj.getpagetittle();
        obj.getinnertext();
        obj.CloseAUT();

	}

}
