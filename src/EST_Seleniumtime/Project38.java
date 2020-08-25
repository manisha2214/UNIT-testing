package EST_Seleniumtime;



import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Project38 {
	WebDriver driver;
	JavascriptExecutor jse;
	public void LaunchAUT() throws InterruptedException
	
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
	}
	public void Scroll() throws InterruptedException
	{
		jse = (JavascriptExecutor)driver;
		//scroll to bottom
		jse.executeScript( "window.scrollTo(0,document.body.scrollHeight)");
		Thread.sleep(2000);
		//scroll to Top
		jse.executeScript("window.scrollTo(document.body.scrolHeight,0)");
		Thread.sleep(2000);
	}
	public void Refresh() throws InterruptedException
	{
		//driver.navigate().refresh();
		jse = (JavascriptExecutor)driver;
		jse.executeScript("history.go(0);");
		Thread.sleep(2000);
		
	}
	public void GetTitle() throws InterruptedException
	{
		//using jse get title
		String str = jse.executeScript("return document.title;").toString();
		System.out.println("the title is:"+ str);
		Thread.sleep(2000);
	}
	public void getinnertext() throws InterruptedException
	{
		String str1 = jse.executeScript("return document.documentElement.innerText;").toString();
		System.out.println("the innertext:"+ str1);
		Thread.sleep(2000);
	}
	public void CloseAUT()
	{
		driver.quit();
	}
	

	public static void main(String[] args) throws InterruptedException {
		Project38 obj = new Project38();
		obj.LaunchAUT();
		obj.Scroll();
		obj.Refresh();
		obj.GetTitle();
		obj.getinnertext();
		obj.CloseAUT();


	}

}
