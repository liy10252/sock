package page.terminal;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

public class TerminalPage extends BasePage {

	@FindBy(xpath = "//a[text()='日志']")
	private WebElement log;

	@FindBy(xpath = "//a[text()='备注']")
	private WebElement remark;

	@FindBy(xpath = "//a[text()='历史消息']")
	private WebElement history;

	@FindBy(xpath = "//a[text()='命令跟踪']")
	private WebElement command;

	@FindBy(xpath = "//a[text()='设置']")
	private WebElement setUp;

	public TerminalPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void gotoLog(){
		click(log);
	}

	public void gotoRemark() { click(remark);}

	public void gotoHistory(){
		click(history);
	}

	public void gotoCommand(){
		click(command);
	}

	public void gotoSetup(){
		click(setUp);
	}
}
