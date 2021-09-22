package page.terminal.log;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

import java.util.List;

@Data
public class LogPage extends BasePage {

	@FindBy(xpath = "//div[@class='controls js_act']/a[text()='全部']")
	private WebElement actionAll;

	@FindBy(xpath = "//div[@class='controls js_act']/a[text()='安装']")
	private WebElement install;

	@FindBy(xpath = "//div[@class='controls js_act']/a[text()='升级']")
	private WebElement update;

	@FindBy(xpath = "//div[@class='controls js_act']/a[text()='卸载']")
	private WebElement uninstall;

	@FindBy(xpath = "//div[@class='controls js_act']/a[text()='修复']")
	private WebElement repair;

	@FindBy(xpath = "//div[@class='controls js_act']/a[text()='重启']")
	private WebElement restart;

	@FindBy(xpath = "//div[@class='controls js_role']/a[text()='全部']")
	private WebElement entryAll;

	@FindBy(xpath = "//div[@class='controls js_role']/a[text()='病毒库']")
	private WebElement virusBank;

	@FindBy(xpath = "//div[@class='controls js_role']/a[text()='恶意网址库']")
	private WebElement badWebSite;

	@FindBy(xpath = "//div[@class='controls js_role']/a[text()='安全云终端']")
	private WebElement safeCloud;

	@FindBy(xpath = "//div[@id='customSearchBox']//li[text()='新版本']")
	private WebElement newVersion;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[4]")
	private List<WebElement> webActions;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[5]")
	private List<WebElement> webEntrys;

	public LogPage(EventFiringWebDriver driver) {
		super(driver);
	}
}
