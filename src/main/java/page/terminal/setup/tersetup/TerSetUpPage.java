package page.terminal.setup.tersetup;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class TerSetUpPage extends BasePage {

	@FindBy(id = "epmsg_admin_pwd")
	private WebElement pwd;

	@FindBy(id = "eptray_lock")
	private WebElement hide;

	@FindBy(xpath = "//label[text()='弹框']/input")
	private WebElement bombBox;

	@FindBy(xpath = "//label[text()='不弹框']/input")
	private WebElement noBombBox;

//	@FindBy(id = "Title")
//	private WebElement mainTitle;

//	@FindBy(id = "SubTitle")
//	private WebElement subHead;

	@FindBy(id = "clientLock")
	private WebElement identity;



	public TerSetUpPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void buttonUtil(){

		click(hide);
		click(noBombBox);
		click(identity);
		click(apply);

	}

	public void inputUtil(String pwdTr){

		pwd.sendKeys(pwdTr);
//		mainTitle.sendKeys(mainText);
//		subHead.sendKeys(subText);
		click(apply);

	}
}
