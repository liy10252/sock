package page.authorize;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

public class AuthorizePage extends BasePage {

	@FindBy(linkText = "今日授权终端")
	private WebElement today;

	@FindBy(linkText = "历史授权终端")
	private WebElement historyAuth;

	public AuthorizePage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void gotoToday(){
		click(today);
	}

	public void gotoHistoryAuth(){
		click(historyAuth);
	}
}
