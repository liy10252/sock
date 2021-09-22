package page.terminal.setup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

public class SetUpPage extends BasePage {

	@FindBy(xpath = "//a[text()='软件更新']")
	private WebElement softwareUp;

	@FindBy(xpath = "//a[text()='中心服务器']")
	private WebElement centerser;

	@FindBy(xpath = "//a[text()='日志保留']")
	private WebElement keepLog;

	public SetUpPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void gotoSoftwareUp(){
		click(softwareUp);
	}

	public void gotoCenterser(){
		click(centerser);
	}

	public void gotoKeepLog(){
		click(keepLog);
	}
}
