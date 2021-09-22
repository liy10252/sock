package page.authorize.today;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class TodayPage extends BasePage {

	@FindBy(xpath = "//div[@class='controls js_act']/a[1]")
	private WebElement author;

	@FindBy(xpath = "//div[@class='controls js_act']/a[2]")
	private WebElement unAuthor;

	@FindBy(xpath = "//div[@class='selectric-scroll']//li[1]")
	private WebElement ip;

	@FindBy(xpath = "//div[@class='selectric-scroll']//li[2]")
	private WebElement mac;

	@FindBy(xpath = "//table[@id='tbClient']/tbody/tr[1]/td[1]/a")
	private WebElement webName;

	private String name;

	public TodayPage(EventFiringWebDriver driver) {
		super(driver);
	}

//	public void author(){
//		click(author);
//	}

	public void unAuthor(){

		name = webName.getText();
		click(unAuthor);
		TestUtil.waitForChanges(webName, name);
	}

	public void search(WebElement element,String text){

		click(searchButton);
		click(conButton);
		click(element);
		searchBar.sendKeys(text);
		click(searchButton);
		TestUtil.seleniumWait();
	}

}
