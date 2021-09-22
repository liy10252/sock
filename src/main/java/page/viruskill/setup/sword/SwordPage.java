package page.viruskill.setup.sword;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

@Data
public class SwordPage extends BasePage {

	@FindBy(id = "extortEnable")
	private WebElement protect;

	@FindBy(id = "extortLogEnable")
	private WebElement log;

	@FindBy(id = "extortTipEnable")
	private WebElement promptUser;

	@FindBy(xpath = "//input[@name='extortAction' and @value='0']")
	private WebElement ask;

	@FindBy(xpath = "//input[@name='extortAction' and @value='1']")
	private WebElement letGo;

	@FindBy(xpath = "//input[@name='extortAction' and @value='2']")
	private WebElement refuse;


	public SwordPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void setOne(){

		click(protect);
		click(log);
		click(promptUser);
		click(letGo);
		click(apply);
	}

	public void setTwo(){

		click(refuse);
		click(apply);
	}
}
