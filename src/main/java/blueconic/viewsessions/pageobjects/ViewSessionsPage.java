package blueconic.viewsessions.pageobjects;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ViewSessionsPage extends WebDriverManager {
		
	public ViewSessionsPage(WebDriver driver) {
		
		super(driver);
	}
	
	//Locator for Submit a Session link
	By SubmitASession = By.xpath("//a[@href='/conference/sessions/new' and text()='Submit a Session!']");
	
	//All Sessions filter
	By AllSessionsFilter = By.xpath("//button[text()='All Sessions']");
	
	//Wednesday filter
	By WednesdayFilter = By.xpath("//button[text()='Wednesday']");
	By WednesdaySessions = By.xpath("//h5[contains(text(),'Wednesday')]");
	
	//Thursday filter
	By ThursdayFilter = By.xpath("//button[text()='Thursday']");
	By ThursdaySessions = By.xpath("//h5[contains(text(),'Thursday')]");
	
	//Friday filter
	By FridayFilter = By.xpath("//button[text()='Friday']");
	By FridaySessions = By.xpath("//h5[contains(text(),'Friday')]");
	
	//Get titles
	By Titles = By.xpath("//h3[@data-cy = 'title']");

	//Method to click "Submit A Session" link
    public void clickSubmitSession() {
    	
    	driver.findElement(SubmitASession).click();    
    	
    }

	//Method to click "All Sessions" filter
	public void clickAllSessionsFilter() {
		
		driver.findElement(AllSessionsFilter).click();
		
	}

	//Method to click "Wednesday" filter
	public void clickWednesdayFilter() {
		
		driver.findElement(WednesdayFilter).click();
	}

	//Method to click "Thursday" filter
	public void clickThursdayFilter() {
		
		driver.findElement(ThursdayFilter).click();
	
	}

	//Method to click "Friday" filter
	public void clickFridayFilter() {
		
		driver.findElement(FridayFilter).click();
		
	}

	//Method to get titles
	public List<WebElement> getTitles() {

        return driver.findElements(Titles);
		
	}

	//Method to get days
	public List<WebElement> getDays(String day) {

		By Days = By.xpath("//h5[contains(text(),'Day: "+day+"')]");
		return driver.findElements(Days);
	}
	

}
