package page.viruskill.setup.sysstreng;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class SysStrengPage extends BasePage {

	@FindBy(id = "sys_chkAllsysdefEnable")
	private WebElement bootStart;

	@FindBy(xpath = "//i[@id='sys_lockSysdefnotify']/../following-sibling::label[1]/input")
	private WebElement autoHandle;

	@FindBy(xpath = "//i[@id='sys_lockSysdefnotify']/../following-sibling::label[2]/input")
	private WebElement notice;

	@FindBy(id = "sys_radSysdefneedlog")
	private WebElement interceptLog;

	@FindBy(xpath = "//div[@id='tab-sys']//dd[4]//label[1]/input")
	private WebElement low;

	@FindBy(xpath = "//div[@id='tab-sys']//dd[4]//label[2]/input")
	private WebElement middle;

	@FindBy(xpath = "//div[@id='tab-sys']//dd[4]//label[3]/input")
	private WebElement high;

	@FindBy(id = "app_chkSysdefauditmode")
	private WebElement open;

	@FindBy(id = "sys_radSysdefdigitalsignature")
	private WebElement digitalSignature;

	public SysStrengPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void clickOne(){

		click(autoHandle);
		click(interceptLog);
		click(middle);
		click(open);
		click(digitalSignature);
		click(apply);
	}

	public void clickTwo(){

		click(high);
		click(bootStart);
		click(apply);
	}
}
