package page.viruskill.setup.usbmonitor;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class UsbMonitorPage extends BasePage {

	@FindBy(id = "pub_chkUdiskmon")
	private WebElement bootEnabled;

	@FindBy(xpath = "//input[@name='pub_udiskAsk' and @value='1']")
	private WebElement ask;

	@FindBy(xpath = "//input[@name='pub_udiskAsk' and @value='0']")
	private WebElement fastKill;

	@FindBy(id = "pub_udiskmonLevel")
	private WebElement killDepth;

	public UsbMonitorPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void usbMonitor(String depth){

		click(bootEnabled);
		click(fastKill);
		killDepth.clear();
		killDepth.sendKeys(depth);
		click(apply);
	}
}
