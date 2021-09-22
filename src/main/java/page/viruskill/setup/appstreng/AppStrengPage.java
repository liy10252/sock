package page.viruskill.setup.appstreng;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

@Data
public class AppStrengPage extends BasePage {

	@FindBy(id = "app_chkAllaptEnable")
	private WebElement open;

	@FindBy(xpath = "//i[@id='app_lockAptdeal']/../following-sibling::label[1]/input")
	private WebElement allowRun;

	@FindBy(xpath = "//i[@id='app_lockAptdeal']/../following-sibling::label[2]/input")
	private WebElement noRun;

	@FindBy(xpath = "//i[@id='app_lockAptnotify']/../following-sibling::label[1]/input")
	private WebElement autoProcess;

	@FindBy(xpath = "//i[@id='app_lockAptnotify']/../following-sibling::label[2]/input")
	private WebElement notice;

	@FindBy(xpath = "//i[@id='app_lockAptlog']/../following-sibling::label[1]/input")
	private WebElement record;

	@FindBy(xpath = "//i[@id='app_lockAptlog']/../following-sibling::label[2]/input")
	private WebElement noRecord;

	@FindBy(xpath = "//i[@id='app_lockAptstarttip']/../following-sibling::label[1]/input")
	private WebElement pop;

	@FindBy(xpath = "//i[@id='app_lockAptstarttip']/../following-sibling::label[2]/input")
	private WebElement noPop;

	public AppStrengPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void clickOne(){

		click(allowRun);
		click(autoProcess);
		click(noRecord);
		click(noPop);
		click(apply);
	}

	public void clickTwo(){

		click(open);
		click(apply);
	}
}
