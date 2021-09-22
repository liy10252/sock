package page.viruskill.setup.virusbackup;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class VirusBackupPage extends BasePage {

	@FindBy(id = "pub_chkNobackup")
	private WebElement backupFile;

	@FindBy(xpath = "//div[@id='tab-bak']//input[@value='0' and @name='pub_radBigfile']")
	private WebElement askMeLong;

	@FindBy(xpath = "//div[@id='tab-bak']//input[@value='1' and @name='pub_radBigfile']")
	private WebElement deleteLong;

	@FindBy(xpath = "//div[@id='tab-bak']//input[@value='2' and @name='pub_radBigfile']")
	private WebElement notDealLong;

	@FindBy(xpath = "//div[@id='tab-bak']//input[@value='0' and @name='pub_radNospace']")
	private WebElement cover;

	@FindBy(xpath = "//div[@id='tab-bak']//input[@value='1' and @name='pub_radNospace']")
	private WebElement space;

	@FindBy(xpath = "//div[@id='tab-bak']//input[@value='0' and @name='pub_radStorefailed']")
	private WebElement askMeBackup;

	@FindBy(xpath = "//div[@id='tab-bak']//input[@value='1' and @name='pub_radStorefailed']")
	private WebElement deleteBackup;

	@FindBy(xpath = "//div[@id='tab-bak']//input[@value='2' and @name='pub_radStorefailed']")
	private WebElement notDealBackup;

	public VirusBackupPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void oneClickUtil(){

		click(backupFile);
		click(deleteLong);
		click(space);
		click(deleteBackup);
		click(apply);
	}

	public void twoClickUtil(){

		click(notDealLong);
		click(notDealBackup);
		click(apply);
	}
}
