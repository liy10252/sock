package page.firewall.setup.secureshare;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;
import java.util.List;

@Data
public class SecureSharePage extends BasePage {

	@FindBy(id = "DisableDefaultShare_status1")
	private WebElement defaultShare;

	@FindBy(id = "DisableDefaultShare_status2")
	private WebElement remoteMan;

	@FindBy(id = "ShareMgr_FileLogStatus")
	private WebElement shareFile;

	@FindBy(id = "ShareMgr_AccessLogStatus")
	private WebElement accessLog;

	@FindBy(id = "AccessControl_MonStatus")
	private WebElement access;

	@FindBy(id = "AccessControl_AlertStatus")
	private WebElement noAccess;

	@FindBy(xpath = "//i[@id='AccessControl_lock_ControlCode']//following-sibling::label[1]/input")
	private WebElement allowIp;

	@FindBy(xpath = "//i[@id='AccessControl_lock_ControlCode']//following-sibling::label[2]/input")
	private WebElement forbidIp;

	@FindBy(xpath = "//div[@id='tab-share']//b")
	private WebElement listButton;

	@FindBy(xpath = "//div[@id='tab-share']//li[text()='IP']")
	private WebElement ip;

	@FindBy(xpath = "//div[@id='tab-share']//li[text()='IP段']")
	private WebElement ipSection;

	@FindBy(xpath = "//input[@class='start_ip']")
	private WebElement ipInput;

	@FindBy(xpath = "//input[@class='start_ip']//following-sibling::input")
	private WebElement ipInputEnd;

	@FindBy(id = "list_add")
	private WebElement add;

	@FindBy(id = "ip_list")
	private WebElement webTable;

	@FindBy(xpath = "//table[@id='ip_list']//tr[1]")
	private WebElement webTr;

	@FindBy(xpath = "//table[@id='ip_list']//tr[1]//td[2]/label[1]/input")
	private WebElement forbid;

	@FindBy(xpath = "//table[@id='ip_list']//tr[1]//i")
	private WebElement delButton;

	@FindBy(xpath = "//table[@id='ip_list']//td[1]")
	private List<WebElement> tds;

	public SecureSharePage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void clickUtil(){

		click(defaultShare);
		click(remoteMan);
		click(shareFile);
		click(accessLog);
		click(access);
		click(noAccess);
		click(forbidIp);
		click(apply);
	}

	public void addIp(String ipStr){

		ipInput.sendKeys(ipStr);
		click(add);
		click(forbid);
		click(apply);
	}

	public void addIpSection(String ipStart,String ipEnd){

		click(listButton);
		click(ipSection);
		ipInput.sendKeys(ipStart);
		ipInputEnd.sendKeys(ipEnd);
		click(add);
		click(apply);
	}

	public void delete(){

		click(delButton);
		click(apply);
		TestUtil.seleniumWait();
	}
}
