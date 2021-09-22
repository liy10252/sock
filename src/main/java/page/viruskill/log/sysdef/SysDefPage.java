package page.viruskill.log.sysdef;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

import java.util.List;

@Data
public class SysDefPage extends BasePage {

	@FindBy(xpath = "//div[@class='controls js_def']/a[text()='全部']")
	private WebElement protectAll;

	@FindBy(xpath = "//div[@class='controls js_def']/a[text()='文件防护']")
	private WebElement fileProtect;

	@FindBy(xpath = "//div[@class='controls js_def']/a[text()='注册表防护']")
	private WebElement registryProtect;

	@FindBy(xpath = "//div[@class='controls js_def']/a[text()='进程防护']")
	private WebElement processProtect;

	@FindBy(xpath = "//div[@class='controls js_def']/a[text()='系统防护']")
	private WebElement systemProtect;

	@FindBy(xpath = "//div[@class='controls js_result']/a[text()='全部']")
	private WebElement handleAll;

	@FindBy(xpath = "//div[@class='controls js_result']/a[text()='允许']")
	private WebElement allow;

	@FindBy(xpath = "//div[@class='controls js_result']/a[text()='阻止']")
	private WebElement prevent;

	@FindBy(xpath = "//div[@class='controls js_result']/a[text()='永久允许']")
	private WebElement allowForever;

	@FindBy(xpath = "//div[@class='controls js_result']/a[text()='永久阻止']")
	private WebElement preventForever;

	@FindBy(xpath = "//div[@class='controls js_result']/a[text()='允许一次']")
	private WebElement allowOne;

	@FindBy(xpath = "//div[@class='controls js_result']/a[text()='阻止一次']")
	private WebElement preventOne;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[5]")
	private List<WebElement> webProtects;

	public SysDefPage(EventFiringWebDriver driver) {
		super(driver);
	}
}
