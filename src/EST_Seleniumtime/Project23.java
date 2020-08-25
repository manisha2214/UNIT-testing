package EST_Seleniumtime;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Project23 {
	WebDriver driver;
	public void LaunchAUT() throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\sanip\\Downloads\\chromedriver_win32\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/xml/tryit.asp?filename=try_xpath_select_cdnodes");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		
	}
	public void MultiselectOption() throws InterruptedException
	{
		//switch to driver object from page to iframe
		driver.switchTo().frame("iframeResult");
		//automate multiselector
		WebElement we = driver.findElement(By.xpath(" //p[@id='demo']"));
		//create the object for select method
		Select slcobj = new Select(we);
		if(slcobj.isMultiple())
		{
			System.out.println("This is multi select");
			//select multi options
			slcobj.selectByVisibleText("Harry Potter");
			Thread.sleep(2000);
			slcobj.selectByValue("XQuery Kick Start");
			Thread.sleep(2000);
			//print all selected options
			List<WebElement>allselectoptions = slcobj.getAllSelectedOptions();
			for(int i=0;i<allselectoptions.size();i++)
			{
				String options = allselectoptions.get(i).getText();
				System.out.println("Selected options is:"+ options);
				Thread.sleep(2000);
			}
			//deselect option
			slcobj.deselectByVisibleText("Harry Potter");
			Thread.sleep(2000);
			slcobj.deselectAll();
			
			
		}
		else
		{
			System.out.println("This is not multiselector");
		}
		//switch to driver object from frame to webpage or iframe to frame
		driver.switchTo().defaultContent();
		Thread.sleep(2000);
		
	}
	public void getthesizeframeMsg() throws InterruptedException
	
	{
		driver.switchTo().frame("iframeResult");
		String story = driver.findElement(By.xpath(" //p[@id='demo']")).getText();
		System.out.println("The book is:" + story);
		Thread.sleep(2000);
		
	}
	public void CloseAUT()
	{
		driver.close();
	}

	public static void main(String[] args) throws InterruptedException {
		Project23 obj = new Project23();
		obj.LaunchAUT();
		obj.MultiselectOption();
		obj.getthesizeframeMsg();
		//obj.CloseAUT();
				

	}

}
