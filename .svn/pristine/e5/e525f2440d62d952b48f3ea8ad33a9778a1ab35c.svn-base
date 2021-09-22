package page.report.warningrecord;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

import java.util.List;

@Data
public class WarningRecordPage extends BasePage {

	@FindBy(xpath = "//div[@class='controls js_wsclass']/a[text()='全部']")
	private WebElement all;

	@FindBy(xpath = "//div[@class='controls js_wsclass']/a[text()='清理失败']")
	private WebElement cleanFail;

	@FindBy(xpath = "//div[@class='controls js_wsclass']/a[text()='病毒爆发']")
	private WebElement virusBreak;

	@FindBy(xpath = "//div[@class='controls js_wsclass']/a[text()='病毒传染']")
	private WebElement virusContagion;

	@FindBy(xpath = "//div[text()='病毒传染名称']/ancestor::tr/td[1]")
	private WebElement delSingle;

	@FindBy(xpath = "//div[text()='病毒传染名称']/ancestor::tr/td[last()]/a")
	private WebElement delBtn;

	@FindBy(xpath = "//a[text()='确认']")
	private WebElement confirm;

	@FindBy(xpath = "//span[text()='删除成功']")
	private WebElement alertMsg;

	@FindBy(xpath = "//table[@id='tbClient']/tbody/tr/td[3]")
	private List<WebElement> webNames;

	public WarningRecordPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void delete(){

		click(delSingle);
		click(delBtn);
		click(confirm);
		TestUtil.waitForVisbility(alertMsg);
	}
}
