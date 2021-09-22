package page.terminal.setup.keeplog;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class KeepLogPage extends BasePage {

	@FindBy(xpath = "//dt[text()='平台类']/following-sibling::dd/div[1]/input[1]")
	private WebElement updateDay;

	@FindBy(xpath = "//dt[text()='平台类']/following-sibling::dd/div[1]/label[1]/input")
	private WebElement updateAnd;

	@FindBy(xpath = "//dt[text()='平台类']/following-sibling::dd/div[1]/label[2]/input")
	private WebElement updateOr;

	@FindBy(xpath = "//dt[text()='平台类']/following-sibling::dd/div[1]/input[2]")
	private WebElement updateRecord;

	@FindBy(xpath = "//dt[text()='平台类']/following-sibling::dd/div[2]/input[1]")
	private WebElement installDay;

	@FindBy(xpath = "//dt[text()='平台类']/following-sibling::dd/div[2]/label[1]/input")
	private WebElement installAnd;

	@FindBy(xpath = "//dt[text()='平台类']/following-sibling::dd/div[2]/label[2]/input")
	private WebElement installOr;

	@FindBy(xpath = "//dt[text()='平台类']/following-sibling::dd/div[2]/input[2]")
	private WebElement installRecord;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[1]/input[1]")
	private WebElement eventDay;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[1]/label[1]/input")
	private WebElement eventAnd;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[1]/label[2]/input")
	private WebElement eventOr;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[1]/input[2]")
	private WebElement eventRecord;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[2]/input[1]")
	private WebElement noteDay;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[2]/label[1]/input")
	private WebElement noteAnd;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[2]/label[2]/input")
	private WebElement noteOr;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[2]/input[2]")
	private WebElement noteRecord;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[3]/input[1]")
	private WebElement trackDay;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[3]/label[1]/input")
	private WebElement trackAnd;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[3]/label[2]/input")
	private WebElement trackOr;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[3]/input[2]")
	private WebElement trackRecord;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[4]/input[1]")
	private WebElement systemDay;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[4]/label[1]/input")
	private WebElement systemAnd;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[4]/label[2]/input")
	private WebElement systemOr;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[4]/input[2]")
	private WebElement systemRecord;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[5]/input[1]")
	private WebElement appDay;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[5]/label[1]/input")
	private WebElement appAnd;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[5]/label[2]/input")
	private WebElement appOr;

	@FindBy(xpath = "//dt[text()='防病毒']/following-sibling::dd/div[5]/input[2]")
	private WebElement appRecord;

	public KeepLogPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void buttonUtil(){

		click(updateAnd);
		click(installAnd);
		click(eventAnd);
		click(noteAnd);
		click(trackAnd);
		click(systemAnd);
		click(appAnd);
		click(apply);
	}

	public void inputUtil(String day,String record){

		updateDay.sendKeys(day);
		updateRecord.sendKeys(record);
		installDay.sendKeys(day);
		installRecord.sendKeys(record);
		eventDay.sendKeys(day);
		eventRecord.sendKeys(record);
		noteDay.sendKeys(day);
		noteRecord.sendKeys(record);
		trackDay.sendKeys(day);
		trackRecord.sendKeys(record);
		systemDay.sendKeys(day);
		systemRecord.sendKeys(record);
		appDay.sendKeys(day);
		appRecord.sendKeys(record);
		click(apply);
	}
}
