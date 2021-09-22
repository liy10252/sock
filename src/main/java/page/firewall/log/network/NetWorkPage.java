package page.firewall.log.network;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import java.util.List;

@Data
public class NetWorkPage extends BasePage {

	@FindBy(xpath = "//div[@class='controls js_task']/a[text()='不限']")
	private WebElement typeAll;

	@FindBy(xpath = "//div[@class='controls js_task']/a[text()='监听']")
	private WebElement monitor;

	@FindBy(xpath = "//div[@class='controls js_task']/a[text()='连接']")
	private WebElement connect;

	@FindBy(xpath = "//div[@class='controls js_result']/a[text()='不限']")
	private WebElement netWorkAll;

	@FindBy(xpath = "//div[@class='controls js_result']/a[text()='允许']")
	private WebElement allow;

	@FindBy(xpath = "//div[@class='controls js_result']/a[text()='拒绝']")
	private WebElement refuse;

	@FindBy(xpath = "//div[@id='customSearchBox']//li[text()='程序筛选']")
	private WebElement program;

	@FindBy(xpath = "//div[@id='customSearchBox']//li[text()='访问网址']")
	private WebElement visitURL;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[7]")
	private List<WebElement> webTypes;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[8]")
	private List<WebElement> webNetWorks;

	public NetWorkPage(EventFiringWebDriver driver) {
		super(driver);
	}
}
