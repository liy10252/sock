package page.firewall.setup.rule;

import lombok.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

@Data
public class RulePage extends BasePage {

	@FindBy(id = "WhiteIPRulemonstate")
	private WebElement openWhite;

	@FindBy(xpath = "//input[@class='start_ip2']")
	private WebElement whiteInput;

	@FindBy(id = "list_add2")
	private WebElement whiteAdd;

	@FindBy(xpath = "//table[@id='ip_list2']//td[1]")
	private WebElement webWhite;

	@FindBy(id = "BlackIPRulemonstate")
	private WebElement openBlack;

	@FindBy(id = "BlackIPRuleAlert")
	private WebElement blackAlert;

	@FindBy(id = "BlackIPRulebLog")
	private WebElement blackLog;

	@FindBy(xpath = "//input[@class='start_ip3']")
	private WebElement blackInput;

	@FindBy(id = "list_add3")
	private WebElement blackAdd;

	@FindBy(xpath = "//table[@id='ip_list3']//td[1]")
	private WebElement webBlack;

	@FindBy(id = "PortRulemonstate")
	private WebElement openPort;

	@FindBy(id = "PortRuleAlert")
	private WebElement portAlert;

	@FindBy(xpath = "//input[@class='start_ip4']")
	private WebElement portInput;

	@FindBy(id = "list_add4")
	private WebElement portAdd;

	@FindBy(xpath = "//table[@id='ip_list4']//td[1]")
	private WebElement webPort;

	@FindBy(id = "UserIPRulemonstate")
	private WebElement openCustom;

	@FindBy(id = "list_add5")
	private WebElement customAdd;

	@FindBy(xpath = "//input[@class='js_cusIp_name']")
	private WebElement name;

	@FindBy(xpath = "//input[@class='js_cusIp_local_single']")
	private WebElement local;

	@FindBy(xpath = "//input[@class='js_cusIp_remote_single']")
	private WebElement remote;

	@FindBy(xpath = "//div[@id='resetPolicy']/following-sibling::div//a[text()='确定']")
	private WebElement confirm;

	@FindBy(xpath = "//table[@id='ip_list5']//i[@class='edit']")
	private WebElement editBtn;

	@FindBy(xpath = "//table[@id='ip_list5']//tr[1]//i[@class='edit']")
	private WebElement editHouBtn;

	@FindBy(xpath = "//input[@class='js_cusIp_alert']")
	private WebElement customAlert;

	@FindBy(xpath = "//input[@class='js_cusIp_action']")
	private WebElement cusIp;

	@FindBy(xpath = "//input[@name='dirc' and @value='2']")
	private WebElement out;

	@FindBy(xpath = "//table[@id='ip_list5']//tr[1]/td[2]")
	private WebElement webCustom;

	public RulePage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void whiteSet(String ip){

		click(openWhite);
		whiteInput.sendKeys(ip);
		click(whiteAdd);
		click(apply);
	}

	public void blackSet(String ip){

		click(openBlack);
		click(blackAlert);
		click(blackLog);
		blackInput.sendKeys(ip);
		click(blackAdd);
		click(apply);
	}

	public void portSet(EventFiringWebDriver driver,String ip){

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", openPort);
		click(openPort);
		click(portAlert);
		portInput.sendKeys(ip);
		click(portAdd);
		click(apply);
	}

	public void addCustom(EventFiringWebDriver driver,String nameStr,String localIp,String remoteIp){

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", openPort);
		click(openCustom);
		click(customAdd);
		name.sendKeys(nameStr);
		local.sendKeys(localIp);
		remote.sendKeys(remoteIp);
		click(confirm);
		click(apply);
	}

	public void updateCustom(String nameGai,String localGai){

		click(editBtn);
		name.clear();
		name.sendKeys(nameGai);
		click(customAlert);
		click(cusIp);
		click(out);
		local.clear();
		local.sendKeys(localGai);
		click(confirm);
		click(apply);
	}
}
