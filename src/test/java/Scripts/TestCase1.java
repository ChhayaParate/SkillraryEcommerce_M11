package Scripts;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import Generic_Library.BaseClass;
import POM.DemoSkillraryPage;
import POM.SkillraryHomePage;
import POM.TestingPage;

public class TestCase1 extends BaseClass {
	@Test
	public void tc1() throws Throwable {
		SkillraryHomePage s = new SkillraryHomePage(driver);
		s.gearsButton();
	    s.skillraryDemoApp();
		utilities.childBrowser(driver);
		DemoSkillraryPage ds = new DemoSkillraryPage(driver);
		utilities.dropDown(ds.getSelectDd(),pdata.getPropertydata("coursedd"));
		TestingPage t = new TestingPage(driver);
		utilities.scrolling(driver,t.getFacebook());
		Thread.sleep(3000);
		t.FacebookWebElement();
	}

}
