package page.viruskill.overview;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

import java.util.List;

@Data
public class OverViewPage extends BasePage {

	@FindBy(xpath = "//div[@class='controls js_filemon']/a[text()='全部']")
	private WebElement fileAll;

	@FindBy(xpath = "//div[@class='controls js_filemon']/a[text()='已开启']")
	private WebElement fileOpen;

	@FindBy(xpath = "//div[@class='controls js_filemon']/a[text()='已关闭']")
	private WebElement fileClose;

	@FindBy(xpath = "//div[@class='controls js_mailmon']/a[text()='全部']")
	private WebElement mailAll;

	@FindBy(xpath = "//div[@class='controls js_mailmon']/a[text()='已开启']")
	private WebElement mailOpen;

	@FindBy(xpath = "//div[@class='controls js_mailmon']/a[text()='已关闭']")
	private WebElement mailClose;

	@FindBy(xpath = "//div[@class='controls js_sysmon']/a[text()='全部']")
	private WebElement sysAll;

	@FindBy(xpath = "//div[@class='controls js_sysmon']/a[text()='已开启']")
	private WebElement sysOpen;

	@FindBy(xpath = "//div[@class='controls js_sysmon']/a[text()='已关闭']")
	private WebElement sysClose;

	@FindBy(xpath = "//div[@class='controls js_VirusAction']/a[text()='全部']")
	private WebElement appAll;

	@FindBy(xpath = "//div[@class='controls js_VirusAction']/a[text()='已开启']")
	private WebElement appOpen;

	@FindBy(xpath = "//div[@class='controls js_VirusAction']/a[text()='已关闭']")
	private WebElement appClose;

	@FindBy(xpath = "//div[@id='customSearchBox']//li[text()='病毒库版本']")
	private WebElement virusBank;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[2]")
	private List<WebElement> clientNames;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[5]")
	private List<WebElement> webFiles;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[6]")
	private List<WebElement> webMails;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[7]")
	private List<WebElement> webSys;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[8]")
	private List<WebElement> webApps;

	public OverViewPage(EventFiringWebDriver driver) {
		super(driver);
	}
}
