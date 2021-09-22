package page.report.warningrule;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class WarningRulePage extends BasePage {

	@FindBy(xpath = "//table[@id='tbClient']/tbody/tr[1]/td[last()]//a")
	private WebElement closeBtn;

	public WarningRulePage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void close(){

		click(closeBtn);
		TestUtil.seleniumWait();
	}
}
