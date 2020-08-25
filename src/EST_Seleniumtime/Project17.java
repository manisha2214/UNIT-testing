package EST_Seleniumtime;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class Project17 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://login.salesforce.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void Senddata() throws InterruptedException
	{
		driver.findElement(By.name("username")).sendKeys("manisha123@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.name("pw")).sendKeys("manisa1234$");
		Thread.sleep(2000);
		driver.findElement(By.name("Login")).click();
	
	}
	public void getTitle() throws IOException, InterruptedException
	{
		String act_out = driver.getTitle();
		System.out.println(act_out);
		String exp_out = "Wellcome to Sales force";
		if(act_out.equals(exp_out))
		{
			System.out.println("The test case is pass");
			
		}
		else
			//if test case is failed take screen shot.
			//we need that particular file location
		{
			File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			File dest = new File("C:\\Users\\sanip\\Desktop\\manisha.jpg");
			FileHandler.copy(src, dest);
			Thread.sleep(2000);

		}
	}
		public void closeAUT()
		{
			driver.close();
		}
		
		
	

	public static void main(String[] args) throws InterruptedException, IOException {
		Project17 obj = new Project17();
		obj.LaunchAUT();
		obj.Senddata();
		obj.getTitle();
		obj.closeAUT();
		

	}

}
