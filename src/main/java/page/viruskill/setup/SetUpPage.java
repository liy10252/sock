package page.viruskill.setup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

public class SetUpPage extends BasePage {

	@FindBy(linkText = "白名单")
	private WebElement whiteList;

	@FindBy(linkText = "黑名单")
	private WebElement blackList;

	@FindBy(linkText = "杀毒备份")
	private WebElement virusBackup;

	@FindBy(linkText = "病毒扫描")
	private WebElement virusScan;

	@FindBy(linkText = "定时扫描")
	private WebElement timingScan;

	@FindBy(linkText = "文件监控")
	private WebElement fileMonitor;

	@FindBy(linkText = "行为规则")
	private WebElement ruleOfCon;

	@FindBy(linkText = "U盘监控")
	private WebElement usbMonitor;

	@FindBy(linkText = "系统加固")
	private WebElement sysStreng;

	@FindBy(linkText = "防勒索文件保护")
	private WebElement blackMail;

	@FindBy(linkText = "应用加固")
	private WebElement appStreng;

	@FindBy(linkText = "p2p私有云")
	private WebElement privateCloud;

	@FindBy(linkText = "Linux防病毒")
	private WebElement linuxVirus;

	@FindBy(linkText = "邮件监控")
	private WebElement mailMonitor;

	@FindBy(linkText = "共享监控")
	private WebElement shareMonitor;

	@FindBy(linkText = "ftp监控")
	private WebElement ftpMonitor;

	@FindBy(linkText = "瑞星之剑")
	private WebElement sword;

	public SetUpPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void gotoWhiteList(){
		click(whiteList);
	}

	public void gotoBlackList(){
		click(blackList);
	}

	public void gotoVirusBackup(){
		click(virusBackup);
	}

	public void gotoVirusScan(){
		click(virusScan);
	}

	public void gotoTimingScan(){
		click(timingScan);
	}

	public void gotoFileMonitor(){
		click(fileMonitor);
	}

	public void gotoRuleOfCon(){
		click(ruleOfCon);
	}

	public void gotoUsbMonitor(){
		click(usbMonitor);
	}

	public void gotoSysStreng(){
		click(sysStreng);
	}

	public void gotoBlackMail(){
		click(blackMail);
	}

	public void gotoAppStreng(){
		click(appStreng);
	}

	public void gotoPrivateCloud(){
		click(privateCloud);
	}

	public void gotoLinuxVirus(){
		click(linuxVirus);
	}

	public void gotoMailMonitor(){
		click(mailMonitor);
	}

	public void gotoShareMonitor(){
		click(shareMonitor);
	}

	public void gotoFtpMonitor(){
		click(ftpMonitor);
	}

	public void gotoSword(){
		click(sword);
	}

}
