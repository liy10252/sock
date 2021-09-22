package page.leakscan;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import java.util.List;

@Data
public class LeakScanPage extends BasePage {

	@FindBy(xpath = "//div[@class='controls js_seclevel']/a[1]")
	private WebElement rankAll;

	@FindBy(xpath = "//div[@class='controls js_seclevel']/a[2]")
	private WebElement noRank;

	@FindBy(xpath = "//div[@class='controls js_seclevel']/a[3]")
	private WebElement lowRank;

	@FindBy(xpath = "//div[@class='controls js_seclevel']/a[4]")
	private WebElement midRank;

	@FindBy(xpath = "//div[@class='controls js_seclevel']/a[5]")
	private WebElement importantRank;

	@FindBy(xpath = "//div[@class='controls js_seclevel']/a[6]")
	private WebElement seriousRank;

	@FindBy(xpath = "//div[@class='controls js_rlstype']/a[1]")
	private WebElement typeAll;

	@FindBy(xpath = "//div[@class='controls js_rlstype']/a[2]")
	private WebElement system;

	@FindBy(xpath = "//div[@class='controls js_rlstype']/a[3]")
	private WebElement ie;

	@FindBy(xpath = "//div[@class='controls js_rlstype']/a[4]")
	private WebElement net;

	@FindBy(xpath = "//div[@class='controls js_rlstype']/a[5]")
	private WebElement office;

	@FindBy(xpath = "//table[@id='tbClient']//td[2]/a")
	private List<WebElement> webNames;

	@FindBy(linkText = "日志")
	private WebElement log;

	@FindBy(linkText = "设置")
	private WebElement setup;

	public LeakScanPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void gotoLog(){
		click(log);
	}

	public void gotoSetup(){
		click(setup);
	}
}
