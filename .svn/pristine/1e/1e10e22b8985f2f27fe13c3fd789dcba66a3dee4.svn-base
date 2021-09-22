package page.terminal.command;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;
import java.util.List;

@Data
public class CommandPage extends BasePage {

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='全部']")
	private WebElement stateAll;

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='已完成']")
	private WebElement finish;

	@FindBy(xpath = "//div[@class='controls js_state']/a[text()='未完成']")
	private WebElement noFinish;

	@FindBy(xpath = "//div[@class='controls js_result']/a[text()='全部']")
	private WebElement implementAll;

	@FindBy(xpath = "//div[@class='controls js_result']/a[text()='完成']")
	private WebElement imFinish;

	@FindBy(xpath = "//div[@class='controls js_result']/a[text()='未执行']")
	private WebElement imUnexecuted;

	@FindBy(xpath = "//div[@class='controls js_result']/a[text()='执行失败']")
	private WebElement imFailed;

	@FindBy(xpath = "//div[@id='customSearchBox']//li[text()='常用命令']")
	private WebElement commonlyUsed;

	@FindBy(xpath = "//div[@id='customSearchBox']//li[text()='终端管理']")
	private WebElement terminal;

	@FindBy(xpath = "//div[@id='customSearchBox']//li[text()='病毒查杀']")
	private WebElement virus;

	@FindBy(xpath = "//div[@id='customSearchBox']//li[text()='上网防护']")
	private WebElement internet;

	@FindBy(xpath = "//div[@id='customSearchBox']//li[text()='安全手机']")
	private WebElement phone;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[3]")
	private List<WebElement> clients;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[4]/div[1]/span")
	private List<WebElement> lowerStates;

	@FindBy(xpath = "//table[@id='tbClient']//tbody/tr/td[5]/div[1]/span")
	private List<WebElement> implementStates;

	@FindBy(xpath = "//div[@class='controls js_md_state']/a[text()='全部']")
	private WebElement stateAllPopup;

	@FindBy(xpath = "//div[@class='controls js_md_state']/a[text()='已下发']")
	private WebElement alreadyIssued;

	@FindBy(xpath = "//div[@class='controls js_md_state']/a[text()='待下发']")
	private WebElement stayDown;

	@FindBy(xpath = "//div[@class='controls js_md_state']/a[text()='超时']")
	private WebElement overTime;

	@FindBy(xpath = "//div[@class='controls js_md_result']/a[text()='全部']")
	private WebElement implementAllPop;

	@FindBy(xpath = "//div[@class='controls js_md_result']/a[text()='成功']")
	private WebElement imFinishPop;

	@FindBy(xpath = "//div[@class='controls js_md_result']/a[text()='未执行']")
	private WebElement imUnexecutedPop;

	@FindBy(xpath = "//div[@class='controls js_md_result']/a[text()='执行失败']")
	private WebElement imFailedPop;

	@FindBy(xpath = "//input[@class='js_md_searchKey']")
	private WebElement searchBarPopup;

	@FindBy(xpath = "//button[@class='btn js_md_btn_search']")
	private WebElement searchButtonPopup;

	@FindBy(xpath = "//table[@id='tbMdClient']//tbody/tr[1]")
	private WebElement WebDataTrPopup;

	public CommandPage(EventFiringWebDriver driver) {
		super(driver);
	}

	//弹出框的条件搜索
	public void searchPopup(String text){

		searchBarPopup.sendKeys(text);
		click(searchButtonPopup);
		TestUtil.waitForElementNumber(By.xpath("//table[@id='tbMdClient']//tbody/tr"),1);
	}

	//命令类型操作
	public void commandType(WebElement element){

		click(conButton);
		click(element);
		click(searchButton);
		TestUtil.seleniumWait();
	}

	//弹出框里的单选方法
	public void singleClickPopup(WebElement all, WebElement element){

		click(all);
		click(element);
		TestUtil.waitForElementNumber(By.xpath("//table[@id='tbMdClient']//tbody/tr"),1);
	}
}
