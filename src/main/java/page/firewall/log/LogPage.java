package page.firewall.log;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

public class LogPage extends BasePage {

	@FindBy(xpath = "//a[text()='恶意网址']")
	private WebElement malice;

	@FindBy(xpath = "//a[text()='黑客攻击']")
	private WebElement hacker;

	@FindBy(xpath = "//a[text()='广告过滤']")
	private WebElement advert;

	@FindBy(xpath = "//a[text()='网址访问']")
	private WebElement url;

	@FindBy(xpath = "//a[text()='联网程序']")
	private WebElement netWork;

	@FindBy(xpath = "//a[text()='共享访问']")
	private WebElement share;

	@FindBy(xpath = "//a[text()='上网流量']")
	private WebElement flow;

	public LogPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void gotoMalice(){
		click(malice);
	}

	public void gotoHacker(){
		click(hacker);
	}

	public void gotoAdvert(){
		click(advert);
	}

	public void gotoUrl(){
		click(url);
	}

	public void gotoNetWork(){
		click(netWork);
	}

	public void gotoShare(){
		click(share);
	}

	public void gotoFlow(){
		click(flow);
	}

}
