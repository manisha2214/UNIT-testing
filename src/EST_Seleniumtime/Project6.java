package EST_Seleniumtime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project6 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.youtube.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		//fetch page source code
		String tie = driver.getTitle();
		System.out.println("The title is:" + tie);
		String page_src = driver.getPageSource();
		System.out.println("The src is:" + page_src);
		Thread.sleep(2000);
		driver.close();
		

	}

}
