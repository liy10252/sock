package page.firewall.setup.manage;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

@Data
public class ManagePage extends BasePage {

	@FindBy(id = "accessCheckTgl")
	private WebElement open;

	@FindBy(id = "access_pop")
	private WebElement promptUser;

	@FindBy(xpath = "//input[@name='accessAutoCheck' and @value='1']")
	private WebElement mind;

	@FindBy(xpath = "//input[@name='accessAutoCheck' and @value='0']")
	private WebElement timing;

	public ManagePage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void manageSet(){

		click(open);
		click(promptUser);
		click(timing);
		click(apply);
	}
}
