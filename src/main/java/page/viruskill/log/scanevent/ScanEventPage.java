package page.viruskill.log.scanevent;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

import java.util.List;

@Data
public class ScanEventPage extends BasePage {

	@FindBy(xpath = "//a[@val='all']")
    private WebElement scanAll;

	@FindBy(xpath = "//a[@val='quickscan']")
	private WebElement quickScan;

	@FindBy(xpath = "//a[@val='allscan']")
	private WebElement allScan;

	@FindBy(xpath = "//a[@val='customscan']")
	private WebElement customScan;

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='全部']")
	private WebElement stateAll;

	@FindBy(xpath = "//a[text()='扫描中']")
	private WebElement scanning;

	@FindBy(xpath = "//a[text()='扫描完成']")
	private WebElement scanComplete;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[6]")
	private List<WebElement> states;

	public ScanEventPage(EventFiringWebDriver driver) {
		super(driver);
	}
}
