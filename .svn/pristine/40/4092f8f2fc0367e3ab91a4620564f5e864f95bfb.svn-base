package page.viruskill.setup.timingscan;

import lombok.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class TimingScanPage extends BasePage {

	@FindBy(id = "scan_chkAllscanEnable")
	private WebElement fullScan;

	@FindBy(xpath = "//dt[text()='时间设置']/following-sibling::dd[1]//input")
	private WebElement bootUp;

	@FindBy(xpath = "//dt[text()='时间设置']/following-sibling::dd[2]/label/input")
	private WebElement everyDay;

	@FindBy(id = "scan_txtAllscanEveryDay")
	private WebElement everyDayInput;

	@FindBy(xpath = "//dt[text()='时间设置']/following-sibling::dd[3]/label[text()='每周']/input")
	private WebElement everyWeek;

	@FindBy(xpath = "//dt[text()='时间设置']/following-sibling::dd[3]/label[text()='一']")
	private WebElement mon;

	@FindBy(xpath = "//dt[text()='时间设置']/following-sibling::dd[3]/label[text()='二']")
	private WebElement tues;

	@FindBy(xpath = "//dt[text()='时间设置']/following-sibling::dd[3]/label[text()='三']")
	private WebElement wed;

	@FindBy(xpath = "//dt[text()='时间设置']/following-sibling::dd[3]/label[text()='四']")
	private WebElement thur;

	@FindBy(xpath = "//dt[text()='时间设置']/following-sibling::dd[3]/label[text()='五']")
	private WebElement fri;

	@FindBy(xpath = "//dt[text()='时间设置']/following-sibling::dd[3]/label[text()='六']")
	private WebElement sat;

	@FindBy(xpath = "//dt[text()='时间设置']/following-sibling::dd[3]/label[text()='日']")
	private WebElement sun;

	@FindBy(id = "scan_txtAllscanEveryWeek")
	private WebElement everyWeekInput;

	@FindBy(xpath = "//dt[text()='时间设置']/following-sibling::dd[4]/label/input")
	private WebElement everyMon;

	@FindBy(xpath = "//input[@id='scan_txtAllscanMonth']/preceding-sibling::div//p")
	private WebElement monButton;

	@FindBy(xpath = "//input[@id='scan_txtAllscanMonth']/preceding-sibling::div/div[3]//li[8]")
	private WebElement monDate;

	@FindBy(id = "scan_txtAllscanMonth")
	private WebElement monInput;

	@FindBy(xpath = "//input[@id='duration_minute']/preceding-sibling::label//input")
	private WebElement conButton;

	@FindBy(id = "duration_minute")
	private WebElement conInput;

	@FindBy(xpath = "//input[@id='scan_txtQuickscanMonth']/preceding-sibling::label/input")
	private WebElement everyMonFast;

	@FindBy(xpath = "//input[@id='scan_txtQuickscanMonth']/preceding-sibling::div//p")
	private WebElement monButtonFast;

	@FindBy(xpath = "//input[@id='scan_txtQuickscanMonth']/preceding-sibling::div/div[3]//li[8]")
	private WebElement monDateFast;

	@FindBy(id = "scan_txtQuickscanMonth")
	private WebElement monInputFast;

	@FindBy(xpath = "//input[@id='duration_minute2']/preceding-sibling::label//input")
	private WebElement conButtonFast;

	@FindBy(id = "duration_minute2")
	private WebElement conInputFast;

	@FindBy(name = "allscanPath")
	private WebElement scanList;

	@FindBy(id = "pub_txtAllscanPath")
	private WebElement pathInput;

	@FindBy(id = "pub_btnAllscanPath")
	private WebElement add;

	@FindBy(xpath = "//table[@id='pub_tbAllscanPath']//tr[1]/td[2]/i")
	private WebElement delete;

	@FindBy(xpath = "//table[@id='pub_tbAllscanPath']//tr[1]")
	private WebElement webTr;

	@FindBy(name = "allscanExt")
	private WebElement typeFile;

	@FindBy(id = "exts")
	private WebElement typeFileInput;

	@FindBy(id = "scan_chkQuickscanEnable")
	private WebElement fastScan;

	@FindBy(xpath = "//input[@id='scan_chkQuickscanEnable']/../following-sibling::dl/dd[1]//input")
	private WebElement bootUpFast;

	@FindBy(xpath = "//input[@id='scan_txtQuickscanEveryDay']/preceding-sibling::label/input")
	private WebElement everyDayFast;

	@FindBy(id = "scan_txtQuickscanEveryDay")
	private WebElement everyDayInputFast;

	@FindBy(xpath = "//input[@id='scan_txtQuickscanEveryWeek']/../label[1]/input")
	private WebElement everyWeekFast;

	@FindBy(xpath = "//input[@id='scan_txtQuickscanMonth']/../label[1]/input")
	private WebElement everyMonButFast;

	@FindBy(xpath = "//input[@id='scan_txtQuickscanEveryWeek']/../label[2]")
	private WebElement monFast;

	@FindBy(xpath = "//input[@id='scan_txtQuickscanEveryWeek']/../label[3]")
	private WebElement tuesFast;

	@FindBy(xpath = "//input[@id='scan_txtQuickscanEveryWeek']/../label[4]")
	private WebElement wedFast;

	@FindBy(xpath = "//input[@id='scan_txtQuickscanEveryWeek']/../label[5]")
	private WebElement thurFast;

	@FindBy(xpath = "//input[@id='scan_txtQuickscanEveryWeek']/../label[6]")
	private WebElement friFast;

	@FindBy(xpath = "//input[@id='scan_txtQuickscanEveryWeek']/../label[7]")
	private WebElement satFast;

	@FindBy(xpath = "//input[@id='scan_txtQuickscanEveryWeek']/../label[8]")
	private WebElement sunFast;

	@FindBy(id = "scan_txtQuickscanEveryWeek")
	private WebElement everyWeekInputFast;

	public TimingScanPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void timeSetUtilOne(String dayTime){

		click(fullScan);
		click(everyDay);
		everyDayInput.clear();
		everyDayInput.sendKeys(dayTime);
		click(apply);
	}

	public void timeSetUtilTwo(String weekTime){

		click(everyWeek);
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

	public void monthSet(String time){

		click(everyMon);
		click(monButton);
		click(monDate);
		monInput.clear();
		monInput.sendKeys(time);
		click(apply);
	}

	public void conSet(String conTime){

		click(conButton);
		conInput.clear();
		conInput.sendKeys(conTime);
		click(apply);
	}

	public void addListUtil(String path){

		click(scanList);
		pathInput.sendKeys(path);
		click(add);
		click(apply);
	}

	public void deleteUtil(){

		TestUtil.seleniumWait();
		click(delete);
		click(apply);
	}

	public void fastScanUtilOne(EventFiringWebDriver driver,String dayTime,String type){

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", typeFile);
		click(typeFile);
		typeFileInput.sendKeys(type);
		click(fastScan);
		everyDayInputFast.clear();
		everyDayInputFast.sendKeys(dayTime);
		click(apply);
	}

	public void fastScanUtilTwo(){

		click(bootUpFast);
		click(apply);
	}

	public void fastScanUtilThree(String weekTime){

		click(everyWeekFast);
		click(monFast);
		click(tuesFast);
		click(wedFast);
		click(thurFast);
		click(friFast);
		click(satFast);
		click(sunFast);
		everyWeekInputFast.clear();
		everyWeekInputFast.sendKeys(weekTime);
		click(apply);
	}

	public void fastMonSet(String time){

		click(everyMonFast);
		click(monButtonFast);
		click(monDateFast);
		monInputFast.clear();
		monInputFast.sendKeys(time);
		click(apply);
	}

	public void fastConSet(String conTime){

		click(conButtonFast);
		conInputFast.clear();
		conInputFast.sendKeys(conTime);
		click(apply);
	}

}
