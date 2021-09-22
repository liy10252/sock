package page.firewall;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

public class FireWallPage extends BasePage {

	@FindBy(xpath = "//a[text()='日志']")
	private WebElement log;

	@FindBy(xpath = "//a[text()='安全共享']")
	private WebElement safeShare;

	@FindBy(xpath = "//a[text()='设置']")
	private WebElement setup;

	public FireWallPage(EventFiringWebDriver driver) {
		super(driver);
	}


	public void gotoLog(){
		click(log);
	}

	public void gotoSafeShare(){
		click(safeShare);
	}

	public void gotoSetup(){
		click(setup);
	}
}
