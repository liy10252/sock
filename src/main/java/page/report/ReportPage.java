package page.report;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

public class ReportPage extends BasePage {

	@FindBy(linkText = "定制报告")
	private WebElement custom;

	@FindBy(linkText = "历史报告")
	private WebElement history;

	@FindBy(linkText = "预警规则")
	private WebElement warningRule;

	@FindBy(linkText = "预警记录")
	private WebElement warningRecord;

	public ReportPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void gotoCustom(){
		click(custom);
	}

	public void gotoHistory(){
		click(history);
	}

	public void gotoWarningRule(){
		click(warningRule);
	}

	public void gotoWarningRecord(){
		click(warningRecord);
	}
}
