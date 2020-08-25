package EST_Seleniumtime;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Project16 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.salesforce.com/form/signup/freetrial-elf-v2/?d=cta-li-promo-147");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void fillform() throws InterruptedException
	{
		driver.findElement(By.name("UserFirstName")).sendKeys("Manisha");
		Thread.sleep(2000);
		driver.findElement(By.name("UserLastName")).sendKeys("Shrestha");
		Thread.sleep(2000);
		driver.findElement(By.name("UserEmail")).sendKeys("Manisha123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("UserTitle")).sendKeys("Quality Analysis");
		Thread.sleep(2000);
		driver.findElement(By.name("UserPhone")).sendKeys("1267879889");
		Thread.sleep(2000);
		driver.findElement(By.name("CompanyName")).sendKeys("Google");
		Thread.sleep(2000);
	}
	public void dropdown() throws InterruptedException
	{
		//automate select dropdown
		WebElement we = driver.findElement(By.name("CompanyEmployees"));
		//create object for select class
		Select slcobj = new Select(we);
		//select option by using visible test
		slcobj.selectByVisibleText("21 - 200 employees");
		Thread.sleep(2000);
		slcobj.selectByValue("100");
		Thread.sleep(2000);
		slcobj.selectByIndex(3);
		Thread.sleep(2000);
	}
	public void countryname() throws InterruptedException
	{
		//automate select dropdrown
		WebElement we1 = driver.findElement(By.name("CompanyCountry"));
		//create object for select class
		Select cn = new Select(we1);
		//select option by using visible test
		cn.deselectByVisibleText("United States");
		Thread.sleep(2000);
		cn.selectByValue("US");
		Thread.sleep(2000);
		cn.selectByIndex(10);
		Thread.sleep(2000);
		
	}
	public void login() throws InterruptedException
	{
		driver.findElement(By.xpath("//div[@class='msaCheckbox checkboxInput section']//div//div[@class='checkbox-ui']")).click();
		Thread.sleep(2000);
	}
	public void startmytrial() throws InterruptedException
	{
		driver.findElement(By.xpath("//button[@name='start my free trial']")).click();
		Thread.sleep(2000);
	}
	public void closeAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException { 
		Project16 obj = new Project16();
		obj.LaunchAUT();
		obj.fillform();
		obj.dropdown();
		obj.countryname();
		obj.login();
		obj.startmytrial();
		//obj.closeAUT();
		
				

	}

}
