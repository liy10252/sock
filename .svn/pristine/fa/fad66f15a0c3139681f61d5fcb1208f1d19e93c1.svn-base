package page.terminal.setup.centerser;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import page.terminal.setup.SetUpPage;
import util.TestUtil;

@Data
public class CenterSerPage extends BasePage {

	@FindBy(xpath = "//input[@class='ignPathVal']")
	private WebElement server;

	@FindBy(id = "add_ignPath")
	private WebElement serverAdd;

	@FindBy(className = "ignPaths")
	private WebElement webServer;

	@FindBy(xpath = "//table[@class='li_ignPaths_bod']/tbody/tr[1]")
	private WebElement webServerRenew;

	@FindBy(id = "epproxy")
	private WebElement open;

	@FindBy(id = "checkeid")
	private WebElement check;

	@FindBy(xpath = "//div[@id='tab-server']//dl[3]//b")
	private WebElement intervalButton;

	@FindBy(xpath = "//div[@id='tab-server']//dl[3]//p")
	private WebElement webInterval;

	@FindBy(xpath = "//li[text()='5分钟']")
	private WebElement fiveMin;

	@FindBy(xpath = "//li[text()='30分钟']")
	private WebElement thirty;

	@FindBy(xpath = "//li[text()='1小时']")
	private WebElement oneHour;

	@FindBy(xpath = "//li[text()='2小时']")
	private WebElement twoHour;

	@FindBy(xpath = "//li[text()='4小时']")
	private WebElement fourHour;

	@FindBy(xpath = "//li[text()='8小时']")
	private WebElement eightHour;

	@FindBy(xpath = "//div[@id='tab-server']//dl[4]//b")
	private WebElement bandButton;

	@FindBy(xpath = "//div[@id='tab-server']//dl[4]//p")
	private WebElement webBand;

	@FindBy(xpath = "//li[text()='10 KB/s']")
	private WebElement ten;

	@FindBy(xpath = "//li[text()='100 KB/s']")
	private WebElement oneHundred;

	@FindBy(xpath = "//li[text()='200 KB/s']")
	private WebElement twoHundred;

	@FindBy(xpath = "//li[text()='500 KB/s']")
	private WebElement fiveHundred;

	@FindBy(id = "startTime")
	private WebElement limitStart;

	@FindBy(id = "endTime")
	private WebElement limitEnd;

	public CenterSerPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void buttonUtil(){

		click(open);
		click(check);
		click(intervalButton);
		click(fiveMin);
		click(bandButton);
		click(ten);
		click(apply);
	}

	public void inputUtil(String ip,String start,String end){

		server.sendKeys(ip);
		click(serverAdd);
		limitStart.sendKeys(start);
		limitEnd.sendKeys(end);
		click(apply);
	}

	public void renewUtil(EventFiringWebDriver driver){

		new SetUpPage(driver).gotoCenterser();
		TestUtil.seleniumWait();
	}
}
