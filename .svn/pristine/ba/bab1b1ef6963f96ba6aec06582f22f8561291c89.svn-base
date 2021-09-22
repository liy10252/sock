package page.firewall.log.hacker;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import java.util.List;

@Data
public class HackerPage extends BasePage {

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='不限']")
	private WebElement stateAll;

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='放行']")
	private WebElement pass;

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='阻止']")
	private WebElement prevent;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[6]")
	private List<WebElement> webStates;

	public HackerPage(EventFiringWebDriver driver) {
		super(driver);
	}
}
