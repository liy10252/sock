package page.leakscan.setup.routine;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

@Data
public class RoutinePage extends BasePage {

	@FindBy(xpath = "//input[@name='rdoScanLevel' and @value='1']")
	private WebElement leakAll;

	@FindBy(xpath = "//input[@name='rdoScanLevel' and @value='2']")
	private WebElement leakHigh;

	@FindBy(xpath = "//input[@name='rdoScanLevel' and @value='3']")
	private WebElement leakMiddle;

	@FindBy(xpath = "//input[@name='rdoScanLevel' and @value='4']")
	private WebElement leakLower;

	@FindBy(xpath = "//input[@name='chkScanType' and @value='1']")
	private WebElement system;

	@FindBy(xpath = "//input[@name='chkScanType' and @value='2']")
	private WebElement microsoft;

	@FindBy(xpath = "//input[@name='chkScanType' and @value='3']")
	private WebElement third;

	@FindBy(xpath = "//input[@name='scan_Type' and @value='2']")
	private WebElement start;

	@FindBy(xpath = "//input[@name='scan_Type' and @value='6']")
	private WebElement dayBtn;

	@FindBy(xpath = "//input[@name='policy_timeTxt']")
	private WebElement dayInput;

	@FindBy(xpath = "//input[@name='scan_Type' and @value='5']")
	private WebElement weekBtn;

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

	@FindBy(xpath = "//input[@value='autorepair']")
	private WebElement autoFix;

	@FindBy(xpath = "//input[@value='no']")
	private WebElement noAutoFix;

	@FindBy(xpath = "//input[@value='popwindow']")
	private WebElement pop;

	@FindBy(xpath = "//input[@value='none']")
	private WebElement noPop;

	@FindBy(xpath = "//input[@value='on']")
	private WebElement on;

	@FindBy(xpath = "//input[@value='off']")
	private WebElement off;

	public RoutinePage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void testOne(String dayTime){

		click(leakHigh);
		click(microsoft);
		click(dayBtn);
		dayInput.clear();
		dayInput.sendKeys(dayTime);
		click(autoFix);
		click(noPop);
		click(off);
		click(apply);
	}

	public void testTwo(String weekTime){

		click(leakMiddle);
		click(third);
		click(weekBtn);
		click(mon);
		click(tues);
		click(wed);
		click(thur);
		click(fri);
		click(sat);
		click(sun);
		everyWeekInput.clear();
		everyWeekInput.sendKeys(weekTime);
		click(apply);
	}
}
