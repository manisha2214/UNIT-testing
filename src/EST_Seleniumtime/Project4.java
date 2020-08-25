package EST_Seleniumtime;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project4 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your working time");
		int work_time = sc.nextInt();
		for( int i=0;i<=work_time;i++)
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
			driver.get("https://www.facebook.com/");
			Thread.sleep(2000);
			driver.manage().window().maximize();
			driver.close();
			
		}
		System.out.println(" Your working time is over");
		
	}

}
