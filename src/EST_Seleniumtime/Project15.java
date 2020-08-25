package EST_Seleniumtime;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project15 {
	WebDriver driver;
	public void LaunchAut() throws InterruptedException

	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
	}	
	public void senddata() throws InterruptedException
	{
		driver.findElement(By.name("field-keywords")).sendKeys("Macbook");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"nav-search\"]/form/div[2]/div/input")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div[2]/div/span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/div/div/div[1]/h2/a/span")).click();
	}
	public void closeAUT()
	{
		driver.close();
	}
	public static void main(String[] args) throws InterruptedException  {
		Project15 obj = new Project15();
		obj.LaunchAut();
		obj.senddata();
		obj.closeAUT();
	
		
		

	}

}
