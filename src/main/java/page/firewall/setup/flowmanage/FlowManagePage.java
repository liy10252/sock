package page.firewall.setup.flowmanage;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class FlowManagePage extends BasePage {

	@FindBy(id = "FluxMgr_MonStatus")
	private WebElement openNet;

	@FindBy(id = "FluxMgr_LogTimer")
	private WebElement interval;

	public FlowManagePage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void flowManUtil(String min){

		click(openNet);
		interval.clear();
		interval.sendKeys(min);
		click(apply);
	}
}
