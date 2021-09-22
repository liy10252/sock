package page.firewall.log.url;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

import java.util.List;

@Data
public class UrlPage extends BasePage {

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='不限']")
	private WebElement stateAll;

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='允许']")
	private WebElement allow;

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='拒绝']")
	private WebElement refuse;

	@FindBy(xpath = "//div[@id='customSearchBox']//li[text()='终端']")
	private WebElement clientName;

	@FindBy(xpath = "//div[@id='customSearchBox']//li[text()='ip']")
	private WebElement ipaddr;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[6]")
	private List<WebElement> webStates;

	public UrlPage(EventFiringWebDriver driver) {
		super(driver);
	}
}
