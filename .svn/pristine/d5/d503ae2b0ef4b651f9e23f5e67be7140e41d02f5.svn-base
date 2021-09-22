package page.firewall.log.malice;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

@Data
public class MalicePage extends BasePage {

	@FindBy(xpath = "//a[text()='不限']")
	private WebElement typeAll;

	@FindBy(xpath = "//a[text()='木马网址']")
	private WebElement trojan;

	@FindBy(xpath = "//a[text()='钓鱼网址']")
	private WebElement fish;

	@FindBy(xpath = "//a[text()='恶意下载']")
	private WebElement malice;

	@FindBy(xpath = "//a[text()='跨站攻击']")
	private WebElement attack;

	@FindBy(xpath = "//a[text()='搜索引擎']")
	private WebElement search;

	public MalicePage(EventFiringWebDriver driver) {
		super(driver);
	}
}
