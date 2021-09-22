package page.systemcenter.setupcenter;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;
import java.util.List;

@Data
public class SetupCenterPage extends BasePage {

	@FindBy(id = "cleanDay")
	private WebElement cleanDay;

	@FindBy(id = "cleanLog")
	private WebElement cleanLog;

	@FindBy(linkText = "日志保留")
	private WebElement keepLog;

	@FindBy(xpath = "//div[@id='tab-log']//ul/li[1]//input")
	private WebElement terminal;

	@FindBy(xpath = "//div[@id='tab-log']//ul/li[2]//input")
	private WebElement visit;

	@FindBy(xpath = "//div[@id='tab-log']//ul/li[3]//input")
	private WebElement attack;

	@FindBy(xpath = "//div[@id='tab-log']//ul/li[4]//input")
	private WebElement network;

	@FindBy(xpath = "//div[@id='tab-log']//ul/li[5]//input")
	private WebElement shareVisit;

	@FindBy(xpath = "//div[@id='tab-log']//ul/li[6]//input")
	private WebElement shareList;

	@FindBy(xpath = "//div[@id='tab-log']//ul/li[7]//input")
	private WebElement flow;

	@FindBy(xpath = "//div[@id='tab-log']//ul/li[8]//input")
	private WebElement protect;

	@FindBy(xpath = "//div[@id='tab-log']//ul/li[9]//input")
	private WebElement reinforce;

	@FindBy(xpath = "//div[@id='tab-log']//ul/li[10]//input")
	private WebElement kill;

	@FindBy(xpath = "//div[@id='tab-log']//ul/li[11]//input")
	private WebElement active;

	@FindBy(xpath = "//div[@id='tab-log']//ul/li[12]//input")
	private WebElement scan;

	@FindBy(xpath = "//div[@id='tab-log']//ul/li[13]//input")
	private WebElement villTrack;

	@FindBy(xpath = "//div[@id='tab-auto']//li[1]//div[@type='ip']/input")
	private WebElement ipText;

	@FindBy(xpath = "//div[@id='tab-auto']//li[3]//h3/a[@class='js_rule_sys']")
	private WebElement sysRule;

	@FindBy(xpath = "//div[@id='tab-auto']//li[3]//div[@type='os']/input")
	private WebElement sysText;

	@FindBy(xpath = "//div[@id='tab-auto']//li[3]//h3/a[@class='js_rule_name']")
	private WebElement nameRule;

	@FindBy(xpath = "//div[@id='tab-auto']//li[3]//div[@type='computername']/input")
	private WebElement nameText;

	@FindBy(xpath = "//div[@id='tab-auto']//li[1]//div[@class='autoGroup_opt']/a[1]")
	private WebElement delBtn;

	@FindBy(id = "autoGroup_addRule")
	private WebElement add;

	@FindBy(xpath = "//ul[@id='autoGroup_list']/li[2]//input")
	private WebElement addType;

	@FindBy(id = "autoGroup_chioce")
	private WebElement addSubmit;

	@FindBy(xpath = "//div[@id='tab-auto']//ul[@class='unstyled autoGroupUL']/li")
	private List<WebElement> ruleNum;

	@FindBy(xpath = "//div[@id='tab-auto']//ul[@class='unstyled autoGroupUL']")
	private WebElement delValue;

	@FindBy(id = "policy-save")
	private WebElement confirm;

	@FindBy(xpath = "//span[text()='策略保存成功 !']")
	private WebElement alert;

	public SetupCenterPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void clientSerSet(String clearDay,String retainDay){

		click(cleanDay);
		cleanDay.clear();
		cleanDay.sendKeys(clearDay);
		click(cleanLog);
		click(keepLog);
		terminal.clear();
		terminal.sendKeys(retainDay);
		visit.clear();
		visit.sendKeys(retainDay);
		attack.clear();
		attack.sendKeys(retainDay);
		network.clear();
		network.sendKeys(retainDay);
		shareVisit.clear();
		shareVisit.sendKeys(retainDay);
		shareList.clear();
		shareList.sendKeys(retainDay);
		flow.clear();
		flow.sendKeys(retainDay);
		protect.clear();
		protect.sendKeys(retainDay);
		reinforce.clear();
		reinforce.sendKeys(retainDay);
		kill.clear();
		kill.sendKeys(retainDay);
		active.clear();
		active.sendKeys(retainDay);
		scan.clear();
		scan.sendKeys(retainDay);
		villTrack.clear();
		villTrack.sendKeys(retainDay);
		click(confirm);
		TestUtil.waitForVisbility(alert);
	}

	public void addGroupRule(String ip,String sys,String name){

		TestUtil.seleniumWait();
		click(add);
		click(addType);
		click(addSubmit);
		ipText.sendKeys(ip);
		TestUtil.seleniumWait();
//		click(sysRule);
//		sysText.sendKeys(sys);
//		click(nameRule);
//		nameText.sendKeys(name);
		click(confirm);
		TestUtil.waitForVisbility(alert);
	}

	public void delGroupRule(EventFiringWebDriver driver){

		new Actions(driver).moveToElement(ipText).perform();
		click(delBtn);
		TestUtil.seleniumWait();
		click(confirm);
		TestUtil.waitForVisbility(alert);
	}
}
