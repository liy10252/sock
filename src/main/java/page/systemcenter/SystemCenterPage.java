package page.systemcenter;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

public class SystemCenterPage extends BasePage {

	@FindBy(linkText = "账户信息")
	private WebElement account;

	@FindBy(linkText = "单位信息")
	private WebElement company;

	@FindBy(linkText = "用户管理")
	private WebElement userManage;

	@FindBy(linkText = "系统消息")
	private WebElement message;

	@FindBy(linkText = "系统设置")
	private WebElement setupCenter;

	@FindBy(linkText = "审计日志")
	private WebElement auditLog;

	public SystemCenterPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void gotoAccount(){
		click(account);
	}

	public void gotoCompany(){
		click(company);
	}

	public void gotoUserManage(){
		click(userManage);
	}

	public void gotoMessage(){
		click(message);
	}

	public void gotoSetupCenter(){
		click(setupCenter);
	}

	public void gotoAuditLog(){
		click(auditLog);
	}
}
