package page.leakscan.setup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

public class SetupPage extends BasePage {

	@FindBy(xpath = "//a[text()='白名单']")
	private WebElement white;

	@FindBy(xpath = "//a[text()='黑名单']")
	private WebElement black;

	public SetupPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void gotoWhite(){
		click(white);
	}

	public void gotoBlack(){
		click(black);
	}
}
