package page.terminal.setup.softwareup;

import lombok.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class SoftwareUpPage extends BasePage {


	@FindBy(xpath = "//dt[text()='快捷方式']/following-sibling::dd[1]//input[@value='0']")
	private WebElement startNoCreate;

	@FindBy(xpath = "//dt[text()='快捷方式']/following-sibling::dd[1]//input[@value='1']")
	private WebElement startCreate;

	@FindBy(xpath = "//dt[text()='快捷方式']/following-sibling::dd[1]//input[@value='2']")
	private WebElement startKeep;

	@FindBy(xpath = "//dt[text()='快捷方式']/following-sibling::dd[2]//input[@value='0']")
	private WebElement desktopNoCreate;

	@FindBy(xpath = "//dt[text()='快捷方式']/following-sibling::dd[2]//input[@value='1']")
	private WebElement desktopCreate;

	@FindBy(xpath = "//dt[text()='快捷方式']/following-sibling::dd[2]//input[@value='2']")
	private WebElement desktopKeep;

	@FindBy(xpath = "//label[text()='手动']/input")
	private WebElement manual;

	@FindBy(xpath = "//label[text()='每天']/input")
	private WebElement everyDay;

	@FindBy(xpath = "//input[@name='policy_timeTxt']")
	private WebElement everyDayInput;

	@FindBy(xpath = "//label[text()='每周']/input")
	private WebElement everyWeek;

	@FindBy(xpath = "//label[text()='一']")
	private WebElement mon;

	@FindBy(xpath = "//label[text()='二']")
	private WebElement tues;

	@FindBy(xpath = "//label[text()='三']")
	private WebElement wed;

	@FindBy(xpath = "//label[text()='四']")
	private WebElement thur;

	@FindBy(xpath = "//label[text()='五']")
	private WebElement fri;

	@FindBy(xpath = "//label[text()='六']")
	private WebElement sat;

	@FindBy(xpath = "//label[text()='日']")
	private WebElement sun;

	@FindBy(xpath = "//input[@name='policy_timeTxt2']")
	private WebElement everyWeekInput;

	@FindBy(xpath = "//label[text()='间隔']/input")
	private WebElement interval;

	@FindBy(xpath = "//input[@name='policy_timeTxt3']")
	private WebElement intervalInput;

	@FindBy(xpath = "//label[text()='升级所有组件']/input")
	private WebElement updateAll;

	@FindBy(xpath = "//label[text()='恶意网址库即时生效']/input")
	private WebElement malice;

	@FindBy(xpath = "//label[text()='仅升级病毒库']/input")
	private WebElement updateVirus;

	@FindBy(id = "forceupdateEnable")
	private WebElement forceUpdate;

	@FindBy(id = "forceupdateMinDay")
	private WebElement forceInput;

	@FindBy(xpath = "//label[text()='使用IE设置']/input")
	private WebElement ie;

	@FindBy(xpath = "//label[text()='直接连接']/input")
	private WebElement connect;

	@FindBy(xpath = "//label[text()='通过代理']/input")
	private WebElement agent;

	@FindBy(name = "ip")
	private WebElement ip;

	@FindBy(name = "port")
	private WebElement port;

	@FindBy(name = "Authentication")
	private WebElement test;

	@FindBy(name = "username")
	private WebElement username;

	@FindBy(name = "password")
	private WebElement password;

	public SoftwareUpPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void buttonUtilOne(){

		click(startCreate);
		click(desktopCreate);
		click(manual);
		click(apply);

	}

	public void buttonUtilTwo(){

		click(startNoCreate);
		click(desktopNoCreate);
		click(everyWeek);
		click(mon);
		click(tues);
		click(wed);
		click(thur);
		click(fri);
		click(sat);
		click(sun);
		click(apply);

	}

	public void buttonUtilThree(EventFiringWebDriver driver){

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", updateAll);
		click(malice);
		click(forceUpdate);
		click(connect);
		click(apply);

	}

	public void inputUtilOne(String weekTime){

		everyWeekInput.clear();
		everyWeekInput.sendKeys(weekTime);
		click(everyWeekInput);
		click(apply);
	}

	public void inputUtilTwo(EventFiringWebDriver driver,String forceStr,String ipStr,String portStr,String name,String pwd){

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", updateAll);

		forceInput.clear();
		forceInput.sendKeys(forceStr);
		click(agent);
		ip.sendKeys(ipStr);
		port.sendKeys(portStr);
		click(test);
		username.sendKeys(name);
		password.sendKeys(pwd);
		click(apply);
	}

}
