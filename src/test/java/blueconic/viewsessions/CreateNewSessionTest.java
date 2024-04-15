package blueconic.viewsessions;

import lombok.extern.log4j.Log4j;
import lombok.extern.slf4j.Slf4j;
import org.testng.Assert;
import org.testng.annotations.Test;
import blueconic.viewsessions.baseclasses.BaseSetup;
import blueconic.viewsessions.pageobjects.SubmitSessionPage;
import blueconic.viewsessions.pageobjects.ViewSessionsPage;
import java.util.List;
import org.openqa.selenium.WebElement;

@Slf4j
public class CreateNewSessionTest extends BaseSetup {
	
	@Test
	public void verifyCreatingNewSession() {

		log.debug("Starting test creatingNewSession");
		ViewSessionsPage vsp = new ViewSessionsPage(driver);
		vsp.clickSubmitSession();
		SubmitSessionPage ssp = new SubmitSessionPage(driver);

		//Verify page title here
		String expectedPageTitle = "Submit a Session!";
		Assert.assertEquals(expectedPageTitle, ssp.getPageTitle());

		//Enter a title
		ssp.setTitle("Create a new Session 1");
		
		//Enter a description
		ssp.setDescription("This is the description of new session 1");
		
		//Enter a Day
		ssp.setDay("Friday");
		
		//Enter a Level
		ssp.setLevel("Beginner");
		
		//Submit the session and verify success message is displayed
		ssp.submitSession();
		log.info("Clicked on Submit button");
		String expectedMessage = "Session Submitted Successfully!";
		Assert.assertEquals(expectedMessage, ssp.successMessage());

		//Verify the session created displays in All Sessions filter
		driver.navigate().back();
		vsp.clickAllSessionsFilter();
		log.info("Clicked on All Sessions filter");
		String titleToCompare ="Create a new Session 1";
		List<WebElement> allTitles = ssp.getTitleByText(titleToCompare);
        verifyTitleExists(allTitles);

		//Verify the session created displays in Friday filter
		vsp.clickFridayFilter();
		log.info("Clicked on Friday filter");
		verifyTitleExists(allTitles);
		log.debug("Ending test creatingNewSession");
		
	}

	//Method to verify if Title of newly created session exists
	public void verifyTitleExists(List<WebElement> allTitles){
		Assert.assertFalse(allTitles.isEmpty());
	}

}
