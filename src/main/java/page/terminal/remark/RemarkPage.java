package page.terminal.remark;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

@Data
public class RemarkPage extends BasePage {

	@FindBy(xpath = "//input[@cname='RISING-023C2B94']")
	private WebElement reMark;

	@FindBy(xpath = "//table[@id='tbClient']//td[text()='RISING-023C2B94']")
	private WebElement clientName;

	public RemarkPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void insert(String text){
		reMark.sendKeys(text);
		clientName.click();
	}

	public void update(String text){
		reMark.clear();
		reMark.sendKeys(text);
		clientName.click();
	}

	public void delete(){
		reMark.clear();
		clientName.click();
	}

}
