package blueconic.viewsessions.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ConferencePage extends WebDriverManager {

	
	public ConferencePage(WebDriver driver) {
		
		super(driver);
		
	}
	
	//Locator for View Speakers
	By ViewSpeakers = By.xpath("//a[@href='/conference/speakers' and text()='View Speakers']");
	
	//Locator for View Sessions
	By ViewSessions = By.xpath("//a[@href='/conference/sessions' and text()='View Sessions']");

	//Method to click on View Speakers 
	public void clickViewSpeakers(){
		
		driver.findElement(ViewSpeakers).click();
		
	}
	
	//Method to click on View Sessions 
	public void clickViewSessions() {
		
		driver.findElement(ViewSessions).click();
	}
	
	
	
}
