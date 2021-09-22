package page.viruskill.log.virusdetail;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

@Data
public class VirusDetailPage extends BasePage {

	@FindBy(xpath = "//a[@val='all']")
	private WebElement sourceAll;

	@FindBy(xpath = "//a[@val='quickscan']")
	private WebElement quickScan;

	@FindBy(xpath = "//a[@val='allscan']")
	private WebElement allScan;

	@FindBy(xpath = "//a[@val='customscan']")
	private WebElement customScan;

	@FindBy(xpath = "//a[@val='filemon']")
	private WebElement fileMon;

	@FindBy(xpath = "//a[@val='mailmon']")
	private WebElement mailMon;

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='全部']")
	private WebElement handleAll;

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='暂未处理']")
	private WebElement notYet;

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='忽略']")
	private WebElement ignore;

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='删除']")
	private WebElement delete;

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='清除']")
	private WebElement clear;

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='信任']")
	private WebElement trust;

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='备份失败']")
	private WebElement backupFail;

	@FindBy(xpath = "//div[@id='customSearchBox']//li[text()='病毒名']")
	private WebElement virusName;

	public VirusDetailPage(EventFiringWebDriver driver) {
		super(driver);
	}
}
