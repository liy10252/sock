package page.firewall.setup;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

public class SetUpPage extends BasePage {

	@FindBy(linkText = "上网防护")
	private WebElement netProtect;

	@FindBy(linkText = "白名单")
	private WebElement whiteList;

	@FindBy(linkText = "防黑客攻击")
	private WebElement hack;

	@FindBy(linkText = "受限网址")
	private WebElement limitWeb;

	@FindBy(linkText = "受限程序")
	private WebElement limitApp;

	@FindBy(linkText = "流量管理")
	private WebElement flowManage;

	@FindBy(xpath = "//ul[@id='policyTab']//a[text()='安全共享']")
	private WebElement secureShare;

	@FindBy(linkText = "ADSL共享管理")
	private WebElement adShare;

	@FindBy(linkText = "对外攻击拦截")
	private WebElement attack;

	@FindBy(linkText = "非法外联管控")
	private WebElement manage;

	@FindBy(linkText = "IP防篡改")
	private WebElement tamper;

	@FindBy(linkText = "IP规则")
	private WebElement rule;

	public SetUpPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void gotoNetProtect(){
		click(netProtect);
	}

	public void gotoWhiteList(){
		click(whiteList);
	}

	public void gotoHack(){
		click(hack);
	}

	public void gotoLimitWeb(){
		click(limitWeb);
	}

	public void gotoLimitApp(){
		click(limitApp);
	}

	public void gotoFlowManage(){
		click(flowManage);
	}

	public void gotoSecureShare(){
		click(secureShare);
	}

	public void gotoAdShare(){
		click(adShare);
	}

	public void gotoAttack(){
		click(attack);
	}

	public void gotoManage(){
		click(manage);
	}

	public void gotoTamper(){
		click(tamper);
	}

	public void gotoRule(){
		click(rule);
	}
}
