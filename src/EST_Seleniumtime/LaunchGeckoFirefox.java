package EST_Seleniumtime;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchGeckoFirefox {

	public static void main(String[] args) {
		// create drive path
		System.setProperty("webdrive.gecko.driver", "C:\\Users\\sanip\\Downloads\\geckodriver-v0.26.0-win64\\geckodriver.exe");
		//create object for webdriver interface
		WebDriver driver = new FirefoxDriver();

	}

}
