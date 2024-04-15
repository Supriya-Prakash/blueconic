package blueconic.viewsessions.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SubmitSessionPage extends WebDriverManager {
		
	public SubmitSessionPage(WebDriver driver) {
		
		super(driver);
	}

	//Locator for Page Title
	By PageTitle = By.xpath("//h3[contains(text(),'Submit a Session!')]");

	//Locator for field Title
	By Title = By.xpath("//input[@id = 'inputTitle']");
	
	//Locator for field Description
	By Description = By.xpath("//input[@id = 'inputDescription']");
	
	//Locator for field Day
	By Day = By.xpath("//input[@id = 'inputDay']");
	
	//Locator for field Level
	By Level = By.xpath("//input[@id = 'inputLevel']");
	
	//Locator for Submit button
	By SubmitButton = By.xpath("//button[contains(text(),'Submit')]");
	
	//Submit session success message
	By SuccessMessage = By.xpath("//p[contains(text(),'Session Submitted Successfully!')]");

	//Method to get page title
	public String getPageTitle() {

		return driver.findElement(PageTitle).getText();

    }

	//Method to click submit button
	public void submitSession() {
		
		driver.findElement(SubmitButton).click();
		
	}

	//Method to get success message after submitting session
	public String successMessage() {

        return driver.findElement(SuccessMessage).getText();
	}

	//Method to set the Title
	public void setTitle(String title) {
		
		driver.findElement(Title).sendKeys(title);
		
		}

	//Method to set the Description
	public void setDescription(String description) {
		
		driver.findElement(Description).sendKeys(description);
	}

	//Method to set the Day
	public void setDay(String day) {

		driver.findElement(Day).sendKeys(day);
	}


	public void setLevel(String level) {
		
		driver.findElement(Level).sendKeys(level);
	}
	
	public List<WebElement> getTitleByText(String text) {

		By TitleByText = By.xpath("//h3[@data-cy = 'title' and contains(text(), '"+text+"')]");
        return driver.findElements(TitleByText);
		
	}
	
	

}
