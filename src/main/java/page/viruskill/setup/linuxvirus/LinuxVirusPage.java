package page.viruskill.setup.linuxvirus;

import lombok.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class LinuxVirusPage extends BasePage {

	@FindBy(id = "keepDayAble")
	private WebElement  keepDayAble;

	@FindBy(id = "keepDay")
	private WebElement keepDay;

	@FindBy(id = "compsAble")
	private WebElement compsAble;

	@FindBy(id = "compress")
	private WebElement compress;

	@FindBy(id = "scanPath")
	private WebElement scanPath;

	@FindBy(name = "ignPath")
	private WebElement ignPath;

	@FindBy(className = "ignPathVal")
	private WebElement ignPathVal;

	@FindBy(id = "add_ignPath")
	private WebElement ignPathAdd;

	@FindBy(xpath = "//table[@class='li_ignPaths_bod']//tr[1]")
	private WebElement webIgnTr;

	@FindBy(xpath = "//table[@class='li_ignPaths_bod']")
	private WebElement webTable;

	@FindBy(id = "setTimeViru")
	private WebElement startScan;

	@FindBy(xpath = "//div[@id='tab-viru']/div/dl[3]/dd/div[1]/label[1]")
	private WebElement sun;

	@FindBy(xpath = "//div[@id='tab-viru']/div/dl[3]/dd/div[1]/label[2]")
	private WebElement mon;

	@FindBy(xpath = "//div[@id='tab-viru']/div/dl[3]/dd/div[1]/label[3]")
	private WebElement tues;

	@FindBy(xpath = "//div[@id='tab-viru']/div/dl[3]/dd/div[1]/label[4]")
	private WebElement wed;

	@FindBy(xpath = "//div[@id='tab-viru']/div/dl[3]/dd/div[1]/label[5]")
	private WebElement thur;

	@FindBy(xpath = "//div[@id='tab-viru']/div/dl[3]/dd/div[1]/label[6]")
	private WebElement fri;

	@FindBy(xpath = "//div[@id='tab-viru']/div/dl[3]/dd/div[1]/label[7]")
	private WebElement sat;

	@FindBy(id = "scanT")
	private WebElement scanTime;

	@FindBy(id = "findViru_1")
	private WebElement virusCleanFind;

	@FindBy(id = "findViru_2")
	private WebElement deleteFileFind;

	@FindBy(id = "findViru_3")
	private WebElement noDealFind;

	@FindBy(id = "clearViru_1")
	private WebElement poisonFile;

	@FindBy(id = "clearViru_2")
	private WebElement noDealClean;

	@FindBy(id = "viruFail_1")
	private WebElement virusCleanDivide;

	@FindBy(id = "viruFail_2")
	private WebElement deleteFileDivide;

	@FindBy(id = "viruFail_3")
	private WebElement noDealDivide;

	public LinuxVirusPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void optimizeUtil(String day,String size,String path,String ignorePath){

		click(keepDayAble);
		keepDay.sendKeys(day);
		click(compsAble);
		compress.sendKeys(size);
		scanPath.clear();
		scanPath.sendKeys(path);
		click(ignPath);
		ignPathVal.sendKeys(ignorePath);
		click(ignPathAdd);
		click(apply);
	}

	public void scanUtil(String time){

		click(startScan);
		click(sun);
		click(mon);
		click(tues);
		click(wed);
		click(thur);
		click(fri);
		click(sat);
		scanTime.sendKeys(time);
		click(scanTime);
		click(apply);
	}

	public void setUtilOne(EventFiringWebDriver driver){

		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", virusCleanFind);
		click(deleteFileFind);
		click(noDealClean);
		click(deleteFileDivide);
		click(apply);
	}

	public void setUtilTwo(){

		click(noDealFind);
		click(noDealDivide);
		click(apply);
	}
}
