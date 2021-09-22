package page.systemcenter.message;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;
import java.util.List;

@Data
public class MessagePage extends BasePage {

	@FindBy(xpath = "//div[@class='fixed-table-header']//div[@class='icheckbox_polaris']")
	private WebElement allChoice;

//	@FindBy(xpath = "//table[@id='tbClient']//tr[1]/td[last()]/a[@class='already']")
//	private WebElement firstRead;

	@FindBy(xpath = "//table[@id='tbClient']//tr[1]/td[1]/div")
	private WebElement firstBtn;

	@FindBy(xpath = "//table[@id='tbClient']//tr[1]/td[last()]/a[@class='del']")
	private WebElement firstDel;

	@FindBy(id = "readmsga")
	private WebElement read;

	@FindBy(id = "btnDel")
	private WebElement delBtn;

	@FindBy(xpath = "//table[@id='tbClient']//tr[1]/td[5]/div")
	private WebElement status;

	@FindBy(xpath = "//table[@id='tbClient']//tr/td[5]/div")
	private List<WebElement> allStatus;

	@FindBy(xpath = "//i[text()='没有找到匹配的记录']")
	private WebElement alert;

	String statu;

	public MessagePage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void singleRead(){

		TestUtil.seleniumWait();
		click(firstBtn);
		click(read);
		TestUtil.seleniumWait();
	}

	public void singleDel(){

		click(firstDel);
		TestUtil.seleniumWait(2000);
	}

	public void allRead(){

		TestUtil.seleniumWait();
		click(allChoice);
		click(read);
		TestUtil.seleniumWait();
	}

	public void allDel(){

		click(allChoice);
		click(delBtn);
		TestUtil.seleniumWait();
		TestUtil.waitForVisbility(alert);
	}
}
