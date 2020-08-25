package EST_Seleniumtime;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Project19 {
	
	WebDriver driver;
	
 public void LaunchAUT() throws InterruptedException
 {
	 System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	 driver.get("https://www.facebook.com/");
	 driver.manage().window().maximize();
	 Thread.sleep(2000);
 }
 public void senddata() throws InterruptedException
 {
	 driver.findElement(By.name("email")).sendKeys("manisha21123@gmail.com");
	 Thread.sleep(2000);
	 driver.findElement(By.name("pass")).sendKeys("manisha2356");
	 Thread.sleep(2000);
	 driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div/div/div[2]/form/table/tbody/tr[2]/td[3]/label/input")).click();
	 Thread.sleep(2000);
 }
 public void getTitle() throws IOException, InterruptedException 
 {
	 String act_out = driver.getTitle();
	 System.out.println(act_out);
	 String exp_out = "Wellcome to Facebook";
	 if(act_out.equals(exp_out))
	 {
		 System.out.println("The test case pass");
	 }
	 else
	 {
		 File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 File dest = new File ("C:\\Users\\sanip\\Desktop\\ms\\manisha.jpg");
		 FileHandler.copy(src, dest);
		 Thread.sleep(2000);
		 
	 } 
	 }
	 public void closeAUT()
	 {
		 driver.close();
	 }
 


	public static void main(String[] args) throws InterruptedException, IOException {
		Project19 obj = new Project19();
		obj.LaunchAUT();
		obj.senddata();
		obj.getTitle();
		obj.closeAUT();

	}

}
