package page.viruskill.log.appdef;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import java.util.List;

@Data
public class AppDefPage extends BasePage {

	@FindBy(xpath = "//div[@class='controls js_type']/a[text()='全部']")
	private WebElement appAll;

	@FindBy(xpath = "//div[@class='controls js_type']/a[text()='IE浏览器']")
	private WebElement ieBrowser;

	@FindBy(xpath = "//div[@class='controls js_type']/a[text()='办公软件']")
	private WebElement software;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[4]")
	private List<WebElement> webAppTypes;

	public AppDefPage(EventFiringWebDriver driver) {
		super(driver);
	}
}
