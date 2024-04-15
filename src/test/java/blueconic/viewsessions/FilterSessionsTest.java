package blueconic.viewsessions;

import lombok.extern.slf4j.Slf4j;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import blueconic.viewsessions.baseclasses.BaseSetup;
import blueconic.viewsessions.pageobjects.ViewSessionsPage;

import java.util.List;

@Slf4j
public class FilterSessionsTest extends BaseSetup {
	
	@Test
	public void verifyFilteringSessions() {

		log.debug("Starting test verifyFilterSessions");
		//In View Sessions page, click on Wednesday filter and verify sessions displayed are for Wednesday
		ViewSessionsPage vsp = new ViewSessionsPage(driver);
		vsp.clickWednesdayFilter();
		log.info("Clicked on Wednesday filter");
		List<WebElement> wednesdayRecords = vsp.getDays("Wednesday");
		Assert.assertTrue(verifyDay(wednesdayRecords, "Day: Wednesday"));

		//In View Sessions page, click on Thursday filter and verify sessions displayed are for Wednesday
		vsp.clickThursdayFilter();
		log.info("Clicked on Thursday filter");
		List<WebElement> thursdayRecords = vsp.getDays("Thursday");
		Assert.assertTrue(verifyDay(thursdayRecords, "Day: Thursday"));

		//In View Sessions page, click on Friday filter and verify sessions displayed are for Wednesday
		vsp.clickFridayFilter();
		log.info("Clicked on Friday filter");
		List<WebElement> fridayRecords = vsp.getDays("Friday");
		Assert.assertTrue(verifyDay(fridayRecords, "Day: Friday"));

		//In View Sessions page, click on All Sessions filter
		vsp.clickAllSessionsFilter();
		log.info("Clicked on All Sessions filter");
		log.debug("Ending test verifyFilterSessions");
		
	}

	//Method to verify particular day
	public boolean verifyDay(List<WebElement> records, String day){

		return records.stream()
				.map(record -> record.getText().trim())
				.allMatch(dayOfWeek -> dayOfWeek.equalsIgnoreCase(day));

	}

}
