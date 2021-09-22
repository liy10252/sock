package page.authorize.historyauth;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class HistoryAuthPage extends BasePage {

	@FindBy(xpath = "//table[@id='tbClient']/tbody/tr[1]/td[1]/div")
	private WebElement webDay;

	@FindBy(xpath = "//button[@class='btn js_btn_search']")
	private WebElement specialButton;

	String day;

	public HistoryAuthPage(EventFiringWebDriver driver) {
		super(driver);
	}


	public void timeFrameTool(WebElement element) {

		TestUtil.seleniumWait();
		click(element);
		TestUtil.seleniumWait();
	}

	public void specialTool(String start,String end){

		specialUtil(start,end);
		click(specialButton);
		TestUtil.seleniumWait();
	}
}
