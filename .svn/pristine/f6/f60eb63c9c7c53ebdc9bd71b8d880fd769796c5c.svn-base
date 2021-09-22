package page.firewall.overview;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import java.util.List;

@Data
public class OverViewPage extends BasePage{

	@FindBy(xpath = "//div[@class='controls js_rfwurlaudit']/a[text()='全部']")
	private WebElement urlAll;

	@FindBy(xpath = "//div[@class='controls js_rfwurlaudit']/a[text()='已开启']")
	private WebElement urlOpen;

	@FindBy(xpath = "//div[@class='controls js_rfwurlaudit']/a[text()='已关闭']")
	private WebElement urlClose;

	@FindBy(xpath = "//div[@class='controls js_rfwiprulers']/a[text()='全部']")
	private WebElement hackerAll;

	@FindBy(xpath = "//div[@class='controls js_rfwiprulers']/a[text()='已开启']")
	private WebElement hackerOpen;

	@FindBy(xpath = "//div[@class='controls js_rfwiprulers']/a[text()='已关闭']")
	private WebElement hackerClose;

	@FindBy(xpath = "//div[@class='controls js_rfwtdi']/a[text()='全部']")
	private WebElement netProgramAll;

	@FindBy(xpath = "//div[@class='controls js_rfwtdi']/a[text()='已开启']")
	private WebElement netOpen;

	@FindBy(xpath = "//div[@class='controls js_rfwtdi']/a[text()='已关闭']")
	private WebElement netClose;

	@FindBy(xpath = "//div[@class='controls js_rfwflux']/a[text()='全部']")
	private WebElement flowManageAll;

	@FindBy(xpath = "//div[@class='controls js_rfwflux']/a[text()='已开启']")
	private WebElement flowOpen;

	@FindBy(xpath = "//div[@class='controls js_rfwflux']/a[text()='已关闭']")
	private WebElement flowClose;

	@FindBy(xpath = "//div[@class='controls js_rfwshare']/a[text()='全部']")
	private WebElement shareAll;

	@FindBy(xpath = "//div[@class='controls js_rfwshare']/a[text()='已开启']")
	private WebElement shareOpen;

	@FindBy(xpath = "//div[@class='controls js_rfwshare']/a[text()='已关闭']")
	private WebElement shareClose;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[4]")
	private List<WebElement> webUrls;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[5]")
	private List<WebElement> webHackers;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[6]")
	private List<WebElement> webNets;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[7]")
	private List<WebElement> webFlows;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[8]")
	private List<WebElement> webShares;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[2]")
	private List<WebElement> clientNames;

	public OverViewPage(EventFiringWebDriver driver) {
		super(driver);
	}
}
