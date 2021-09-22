package page.firewall.safeshare;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class SafeSharePage extends BasePage {

	@FindBy(xpath = "//input[@class='js_computername']")
	private WebElement epName;

	@FindBy(xpath = "//input[@class='js_ip']")
	private WebElement ip;

	@FindBy(xpath = "//div[@class='controls js_task']/a[text()='全部']")
	private WebElement operationAll;

	@FindBy(xpath = "//div[@class='controls js_task']/a[text()='只读']")
	private WebElement readOnly;

	@FindBy(xpath = "//div[@class='controls js_task']/a[text()='读写']")
	private WebElement readWrite;

	@FindBy(xpath = "//li[text()='共享名称']")
	private WebElement shareName;

	@FindBy(xpath = "//li[text()='物理路径']")
	private WebElement path;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr[1]/td[1]/a")
	private WebElement detailButton;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr[2]//tbody/tr[1]")
	private WebElement webDetailTr;

	public SafeSharePage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void simpleSearch(WebElement input,String text){

		input.sendKeys(text);
		click(searchButton);
		TestUtil.waitForElementNumber(By.xpath("//table[@id='tbClient']//tbody/tr"),1);

	}
}
