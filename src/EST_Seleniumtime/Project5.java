package EST_Seleniumtime;

import java.util.Scanner;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project5 {

	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		System.out.println("Hi Anil please enter your faviourite URL");
		String out_url = sc.nextLine();
		System.out.println("Hi Anil what is your expected output");
		String exp_out = sc.nextLine();
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("out_url");
		driver.manage().window().maximize();
		String act_title = driver.getTitle();
		System.out.println("The title name is:" + act_title);
		if(act_title.equalsIgnoreCase(exp_out))
		{
			System.out.println("The title test is pass");
			
		}
		else
		{
			System.out.println("The title test is failed");
			Thread.sleep(2000);
			}
		driver.close();
		

}
}