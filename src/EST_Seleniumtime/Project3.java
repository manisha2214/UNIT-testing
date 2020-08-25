package EST_Seleniumtime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Project3 {
	WebDriver driver;
	public void launchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		//wait for sometime
		Thread.sleep(2000);
		
	}
	public void GetTitle()
	{
		//fetch the title
		String act_out = driver.getTitle();
		//expected output
		String exp_out = "Facebook - Log In or Sign Up";
		System.out.println("The title is: " + act_out);
		if(act_out.equalsIgnoreCase("exp_out"))
		{
			System.out.println("The title test is pass");
		}
		else
		{
			System.out.println("The title test is failed");
		}
		
	}

	public static void main(String[] args) throws InterruptedException {
		Project3 obj = new Project3();
		obj.launchAUT();
		obj.GetTitle();
		
		

	}

}
