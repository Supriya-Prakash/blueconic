package blueconic.viewsessions.pageobjects;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends WebDriverManager {
	
	public HomePage(WebDriver driver) {
		
		super(driver);
	}
	
	//Locator for Globomantics logo
	By GlobomanticsLogo = By.xpath("//div[contains(@class,'logo')]//a");
	
	//Locator for Search button
	By Search = By.xpath("//input[@class = 'form-control']");
			
	//Locator for 'Our Story' header menu 
    By OurStory = By.xpath("//div[@id = 'navbarSupportedContent']//a[text() = 'Our story']");
    
    //Locator for 'Robotics' menu
    By Robotics = By.xpath("//div[@id = 'navbarSupportedContent']//a[text() = 'Robotics']");
    
    //Locator for 'Media' menu
    By Media = By.xpath("//div[@id = 'navbarSupportedContent']//a[text() = 'Media']");
    
    //Locator for 'Conference' menu
    By Conference = By.xpath("//div[@id = 'navbarSupportedContent']//a[text() = 'Conference']");
    
    //Locator for 'Our Story' in the footer
    By OurStoryFooter = By.xpath("//ul[contains(@class,'quick-links')]//a[text()='Our Story']");
    
    //Locator for 'Robotics' in the footer
    By RoboticsFooter = By.xpath("//ul[contains(@class,'quick-links')]//a[text()='Robotics']");
    
    //Locator for 'Media' in the footer
    By MediaFooter = By.xpath("//ul[contains(@class,'quick-links')]//a[text()='Media']");
    
    //Locator for 'Conference' in the footer
    By ConferenceFooter = By.xpath("//ul[contains(@class,'quick-links')]//a[text()='Conference']");
    
    //Locator for Sign up Today button
    By SignUpToday = By.xpath("//button[text()= 'SIGN UP TODAY']");
    
    //Locator for Learn More button - Robotics
    By LearnMoreRobotics = By.xpath("//a[contains(@href, '/robotics') and text()='Learn More']");
    
    //Locator for Learn More button - Dark Energy
    By LearnMoreDarkEnergy = By.xpath("");
    
    //Locator for Learn More button - Strangers Rise
    By LearnMoreStrangersRise = By.xpath("");
     
    //Method to click on Conference menu
    public void clickConference()
    {

        driver.findElement(Conference).click();
    }    
    
    
    
    
    
			
}
