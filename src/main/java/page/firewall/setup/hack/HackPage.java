package page.firewall.setup.hack;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class HackPage extends BasePage {

	@FindBy(id = "rsIpList_AlertStatus")
	private WebElement promptUser;

	@FindBy(id = "rsIpList_BreakTimes")
	private WebElement attackSource;

	@FindBy(xpath = "//table[@id='RsIpRuleList']//tr[1]/td[2]/input")
	private WebElement webButton;

	@FindBy(id = "rir_TrojanValue")
	private WebElement trojan;

	@FindBy(id = "rir_SqlValue")
	private WebElement sql;

	@FindBy(id = "rir_LeakValue")
	private WebElement leak;

	@FindBy(id = "rir_SnortValue")
	private WebElement snort;

	public HackPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void hackUtil(String min){

		click(promptUser);
		attackSource.clear();
		attackSource.sendKeys(min);
//		click(webButton);
		click(trojan);
		click(sql);
		click(leak);
		click(snort);
		click(apply);
	}
}
