package EST_Seleniumtime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LaunchChromeAUT {

	public static void main(String[] args) {
		// create a drive path
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		//create a object for webdriver interface
		WebDriver driver = new ChromeDriver();

	}

}
