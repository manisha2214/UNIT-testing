package EST_Seleniumtime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project1 {

	public static void main(String[] args) {
		//create driver path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//create object for webdriver interface
		WebDriver driver = new ChromeDriver();
		//load the website using get method
		driver.get("https://www.youtube.com/");
		

	}

}
