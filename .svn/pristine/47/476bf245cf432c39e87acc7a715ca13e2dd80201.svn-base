package page.terminal.group;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import java.util.List;

@Data
public class GroupPage extends BasePage {

	@FindBy(xpath = "//span[@class='group-add']")
	private WebElement groupAdd;

	@FindBy(id = "txtGroupName")
	private WebElement groupName;

	@FindBy(id = "btnSaveGroup")
	private WebElement saveGroup;

	@FindBy(xpath = "//span[text()='testgroup']")
	private WebElement groupValue;

	@FindBy(xpath = "//a[@title='testgroup']/i[2]")
	private WebElement modify;

	@FindBy(xpath = "//a[@title='testgroup']/../input")
	private WebElement modifyGroupNameItem;

	@FindBy(xpath = "//a[@title='testgroup']/following-sibling::b[1]")
	private WebElement modifyConfirm;

	@FindBy(xpath = "//span[text()='modifytestgroup']")
	private WebElement modifyValue;

	@FindBy(xpath = "//a[@title='modifytestgroup']/i[1]")
	private WebElement delete;

	@FindBy(xpath = "//a[text()='确认']")
	private WebElement deleteConfirm;

	@FindBy(xpath = "//div[@class='group-cmd']/preceding-sibling::div[1]//a")
	private List<WebElement> groups;

	public GroupPage(EventFiringWebDriver driver) {
		super(driver);
	}


	//添加组方法
	public void addGroup(String name){

		click(groupAdd);
		groupName.sendKeys(name);
		saveGroup.click();
	}

	//修改组名称
	public void modifyGroup(EventFiringWebDriver driver,String name){

		new Actions(driver).moveToElement(groupValue).perform();
		click(modify);
		modifyGroupNameItem.clear();
		modifyGroupNameItem.sendKeys(name);
		modifyConfirm.click();
	}

	//删除组
	public void deleteGroup(EventFiringWebDriver driver){

		new Actions(driver).moveToElement(modifyValue).perform();
		click(delete);
		click(deleteConfirm);
	}

}
