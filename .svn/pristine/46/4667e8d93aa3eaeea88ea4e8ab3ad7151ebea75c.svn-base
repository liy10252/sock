package page.leakscan.setup.black;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

@Data
public class BlackPage extends BasePage {

	@FindBy(id = "pub_black")
	private WebElement blackInput;

	@FindBy(id = "pub_btnAddBlackList")
	private WebElement add;

	@FindBy(xpath = "//table[@id='pub_tbBlackList']//tr[1]/td[1]")
	private WebElement webText;

	@FindBy(id="pub_tbBlackList")
	private WebElement webTable;

	public BlackPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void addTest(String text){

		blackInput.sendKeys(text);
		click(add);
		click(apply);
	}
}