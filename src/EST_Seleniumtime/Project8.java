package EST_Seleniumtime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project8 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	
	{
		// create a driver path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//create a object for interface
	    driver = new ChromeDriver();
	    //load website using get method
	    driver.get("https://www.facebook.com/");
	    //maximize the active window
	    driver.manage().window().maximize();
	    //wait for some time
	    Thread.sleep(2000);
	}
	public void gettitle()
	{
		//fetch the title
		String name = driver.getTitle();
		System.out.println("the title is:"+ name);
	}
	public void getpageSrc()
	{
		//fetch the page source code
		String page_src = driver.getPageSource();
		System.out.println("the page source code is:" + page_src);
		
	}
	public void getcurrenturl() {
		//fetch the current URL
		String url_name = driver.getCurrentUrl();
		System.out.println("the current URL is:"+ url_name);
	}
	public void close()
	
	{
		//close the browser
		driver.close();
	}
	
	

	public static void main(String[] args) throws InterruptedException {
		Project8 result = new Project8();
		result.LaunchAUT();
		result.gettitle();
		result.getpageSrc();
		result.getcurrenturl();
		result.close();
		

	}

}
