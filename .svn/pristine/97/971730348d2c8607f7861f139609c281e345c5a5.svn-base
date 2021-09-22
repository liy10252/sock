package page.leakscan.setup.white;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

@Data
public class WhitePage extends BasePage {

	@FindBy(id = "pub_white")
	private WebElement whiteInput;

	@FindBy(id = "pub_btnAddWhiteList")
	private WebElement add;

	@FindBy(xpath = "//table[@id='pub_tbWhiteList']//tr[1]/td[1]")
	private WebElement webText;

	@FindBy(id="pub_tbWhiteList")
	private WebElement webTable;

	public WhitePage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void addTest(String text){

		whiteInput.sendKeys(text);
		click(add);
		click(apply);
	}
}
