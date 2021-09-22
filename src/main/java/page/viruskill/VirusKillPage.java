package page.viruskill;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

public class VirusKillPage extends BasePage {

	@FindBy(xpath = "//a[text()='日志']")
	private WebElement log;

	@FindBy(xpath = "//a[text()='设置']")
	private WebElement setup;

	public VirusKillPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void gotoLog(){
		click(log);
	}

	public void gotoSetup(){
		click(setup);
	}
}

