package blueconic.viewsessions.baseclasses;

import java.time.Duration;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import blueconic.viewsessions.pageobjects.ConferencePage;
import blueconic.viewsessions.pageobjects.HomePage;

public class BaseSetup {
	
	public static WebDriver driver;
	
	@BeforeClass
	public void setup()
	{
		driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.get("http://localhost:1337/");
		driver.manage().window().maximize();
		
		HomePage hp = new HomePage(driver);
		hp.clickConference();
		
		//In Conference page click on View sessions
		ConferencePage cp = new ConferencePage(driver);
		cp.clickViewSessions();

	}

	@AfterClass
	public void tearDown(){
		driver.quit();
	}

}
