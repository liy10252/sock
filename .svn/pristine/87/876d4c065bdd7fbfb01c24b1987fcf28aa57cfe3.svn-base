package page.firewall.setup.limitweb;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;
import java.util.List;

@Data
public class LimitWebPage extends BasePage {

	@FindBy(id = "BrowserAudit_MonStatus")
	private WebElement webManage;

	@FindBy(xpath = "//div[@id='tab-brower']//dl[1]/dd[2]/label[1]/input")
	private WebElement noRecord;

	@FindBy(xpath = "//div[@id='tab-brower']//dl[1]/dd[2]/label[2]/input")
	private WebElement smart;

	@FindBy(xpath = "//div[@id='tab-brower']//dl[1]/dd[2]/label[3]/input")
	private WebElement recordAll;

	@FindBy(id = "add_rules")
	private WebElement add;

	@FindBy(xpath = "//label[@class='mb5 inblock']//b")
	private WebElement timeButton;

	@FindBy(xpath = "//label[@class='mb5 inblock']//li[text()='每周']")
	private WebElement everyWeek;

	@FindBy(xpath = "//label[@class='mb5 inblock']//li[text()='时间段']")
	private WebElement timeSlot;

	@FindBy(xpath = "//dl[@class='policy-rule-tpl']//dd[2]/div[1]//input[@name='start_time']")
	private WebElement startTime;

	@FindBy(xpath = "//dl[@class='policy-rule-tpl']//dd[2]/div[1]//input[@name='end_time']")
	private WebElement endTime;

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

	@FindBy(xpath = "//dl[@class='policy-rule-tpl']//dd[2]/div[2]//input[@name='start_time']")
	private WebElement weekStart;

	@FindBy(xpath = "//dl[@class='policy-rule-tpl']//dd[2]/div[2]//input[@name='end_time']")
	private WebElement weekEnd;

	@FindBy(xpath = "//input[@name='start_date']")
	private WebElement slotStart;

	@FindBy(xpath = "//input[@name='end_date']")
	private WebElement slotEnd;

	@FindBy(xpath = "//dl[@class='policy-rule-tpl']//button")
	private WebElement addRule;

	@FindBy(name = "urls")
	private WebElement webSite;

	@FindBy(name = "alert")
	private WebElement alert;

	@FindBy(name = "control")
	private WebElement control;

	@FindBy(xpath = "//input[@class='input-large redirect']")
	private WebElement redirect;

	@FindBy(xpath = "//div[@class='modal hide js_dialog_box in']//div[3]//a[1]")
	private WebElement confirm;

	@FindBy(xpath = "//i[@class='edit']")
	private WebElement modify;

	@FindBy(xpath = "//i[@class='del']")
	private WebElement del;

	@FindBy(id = "browserList")
	private WebElement webTable;

	@FindBy(xpath = "//table[@id='browserList']//td[1]")
	private List<WebElement> tds;

	public LimitWebPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void clickOne(){

		click(webManage);
		click(smart);
		click(apply);
	}

	public void clickTwo(){

		click(recordAll);
		click(apply);
	}

	public void everyDayAdd(String start,String end,String web,String redStr){

		click(add);
		startTime.sendKeys(start);
		click(startTime);
		endTime.sendKeys(end);
		click(endTime);
		click(addRule);
		webSite.sendKeys(web);
		click(alert);
		click(control);
		redirect.sendKeys(redStr);
		click(confirm);
		click(apply);
    }

    public void updateDay(String start,String end,String web,String redStr){

		click(modify);
		click(timeButton);
		click(everyWeek);
		click(mon);
		click(tues);
		click(wed);
		click(thur);
		click(fri);
		click(sat);
		click(sun);
		weekStart.sendKeys(start);
		click(weekStart);
		weekEnd.sendKeys(end);
		click(weekEnd);
		webSite.clear();
		webSite.sendKeys(web);
		click(alert);
		click(control);
		redirect.clear();
		redirect.sendKeys(redStr);
		click(confirm);
		click(apply);
	}


	public void timeSlotAdd(String start,String end,String web,String redStr){

		click(add);
		click(timeButton);
		click(timeSlot);
		slotStart.sendKeys(start);
		click(slotStart);
		slotEnd.sendKeys(end);
		click(slotEnd);
		click(addRule);
		webSite.sendKeys(web);
		click(alert);
		click(control);
		redirect.sendKeys(redStr);
		click(confirm);
		click(apply);
	}
}
