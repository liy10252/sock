package page.firewall.setup.netprotect;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class NetProtectPage extends BasePage {

	@FindBy(id = "pub_FwStatus")
	private WebElement netWork;

	@FindBy(id = "AntiEvilUrl_MonStatus")
	private WebElement trojanStart;

	@FindBy(id = "AntiEvilUrl_LogStatus")
	private WebElement trojanLog;

	@FindBy(id = "AntiFishUrl_MonStatus")
	private WebElement fishStart;

	@FindBy(id = "AntiFishUrl_LogStatus")
	private WebElement fishLog;

	@FindBy(id = "AntiEvilDown_MonStatus")
	private WebElement maliceStart;

	@FindBy(id = "AntiEvilDown_LogStatus")
	private WebElement maliceLog;

	@FindBy(id = "rsIpList_MonStatus")
	private WebElement hackerStart;

	@FindBy(id = "rsIpList_LogStatus")
	private WebElement hackerLog;

	@FindBy(id = "AntiXss_MonStatus")
	private WebElement scriptStart;

	@FindBy(id = "AntiXss_LogStatus")
	private WebElement scriptLog;

	@FindBy(id = "SearchUrlProtect_MonStatus")
	private WebElement searchStart;

	@FindBy(id = "SearchUrlProtect_LogStatus")
	private WebElement searchLog;

	@FindBy(id = "AdFilter_MonStatus")
	private WebElement advertStart;

	@FindBy(id = "AdFilter_LogStatus")
	private WebElement advertLog;

	public NetProtectPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void clickUtil(){

		click(netWork);
		click(trojanStart);
		click(trojanLog);
		click(fishStart);
		click(fishLog);
		click(maliceStart);
		click(maliceLog);
		click(hackerStart);
		click(hackerLog);
		click(scriptStart);
		click(scriptLog);
		click(searchStart);
		click(searchLog);
		click(advertStart);
		click(advertLog);
		click(apply);
	}
}
