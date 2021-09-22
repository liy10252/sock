package page.firewall.setup.tamper;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

@Data
public class TamperPage extends BasePage {

	@FindBy(id = "IpProtectstate")
	private WebElement open;

	@FindBy(id = "IpProtectMacProtect")
	private WebElement mac;

	@FindBy(id = "IpProtectLog")
	private WebElement log;

	public TamperPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void tamperSet(){

		click(open);
		click(mac);
		click(log);
		click(apply);
	}
}
