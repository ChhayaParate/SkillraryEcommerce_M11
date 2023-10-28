package Scripts;

import org.testng.annotations.Test;

import Generic_Library.BaseClass;
import POM.DemoSkillraryPage;
import POM.DownloadInvoicePage;
import POM.SkillraryHomePage;

public class TestCase2 extends BaseClass {
	@Test
	public void tc2() {
		SkillraryHomePage s = new SkillraryHomePage(driver);
		s.gearsButton();//business library of gears from SkillraryHomePage
		s.skillraryDemoApp();//business library of skillraryDemoApp from SkillraryHomePage
		utilities.childBrowser(driver);
		DemoSkillraryPage ds=new DemoSkillraryPage(driver);
		ds.feedBckBtn();//business library of feedBckbtn from DemoSkillrarypage
		DownloadInvoicePage dI=new DownloadInvoicePage(driver);
		dI.downloadInvoiceButton();//business library of downloadInvoiceButton from downloadInvoicepage
	}
}
