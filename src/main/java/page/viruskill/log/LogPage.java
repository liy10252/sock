package page.viruskill.log;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

public class LogPage extends BasePage {

	@FindBy(xpath = "//a[text()='病毒详情']")
	private WebElement virusDetail;

	@FindBy(xpath = "//a[text()='扫描事件']")
	private WebElement scanEvent;

	@FindBy(xpath = "//a[text()='系统加固']")
	private WebElement sysdef;

	@FindBy(xpath = "//a[text()='应用加固']")
	private WebElement botauditlog;

	public LogPage(EventFiringWebDriver driver) {
		super(driver);
	}


	public void gotoXav_virus(){
		click(virusDetail);
	}

	public void gotoXav_scanevent(){
		click(scanEvent);
	}

	public void gotoXav_sysdef(){
		click(sysdef);
	}

	public void gotoXav_botauditlog(){
		click(botauditlog);
	}
}
