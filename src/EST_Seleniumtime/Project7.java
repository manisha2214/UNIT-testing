package EST_Seleniumtime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project7 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
	}
	public void getTitle()
	{
		String tie = driver.getTitle();
			System.out.println("the title is:" + tie);
	}
	public void currenturl()
	{
		String cur_url = driver.getCurrentUrl();
		System.out.println("the url is:" + cur_url);
	}
	public void GetpageSrc() {
	
	
	
		String page_src = driver.getPageSource();
		System.out.println("the page src is:" + page_src);
	}
	

	public static void main(String[] args) throws InterruptedException {
		Project7 obj = new Project7();
		obj.LaunchAUT();
		obj.getTitle();
		obj.currenturl();
		obj.GetpageSrc();
		
	}

}
