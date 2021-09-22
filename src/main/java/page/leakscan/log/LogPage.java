package page.leakscan.log;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

public class LogPage extends BasePage {

	@FindBy(linkText = "按公告号")
	private WebElement notice;

	public LogPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void gotoNotice(){
		click(notice);
	}
}
