package page.viruskill.setup.sharemonitor;

import lombok.Data;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class ShareMonitorPage extends BasePage {

	@FindBy(id = "share_Rundisable")
	private WebElement runDisable;

	@FindBy(xpath = "//div[@id='tab-share']//dd[3]//input")
	private WebElement fileAll;

	@FindBy(xpath = "//div[@id='tab-share']//dd[4]//input")
	private WebElement programFile;

	@FindBy(xpath = "//div[@id='tab-share']//dd[5]/label/input")
	private WebElement customFileBtn;

	@FindBy(id = "file4Exts")
	private WebElement customFile;

	@FindBy(id = "share_Popvirus")
	private WebElement popVirus;

	@FindBy(id = "share_chkHeuristic")
	private WebElement heuristics;

	@FindBy(id = "share_chkScanzip")
	private WebElement scanZip;

	@FindBy(id = "share_txtFilesize")
	private WebElement fileSize;

	@FindBy(id = "filedepth4")
	private WebElement fileDepth;

	@FindBy(xpath = "//div[@id='tab-share']//dd[10]//label[1]/input")
	private WebElement autoHandle;

	@FindBy(xpath = "//div[@id='tab-share']//dd[10]//label[2]/input")
	private WebElement manualHandle;

	@FindBy(xpath = "//div[@id='tab-share']//dd[10]//label[3]/input")
	private WebElement noHandleVirus;

	@FindBy(xpath = "//div[@id='tab-share']//dd[11]//label[1]/input")
	private WebElement delete;

	@FindBy(xpath = "//div[@id='tab-share']//dd[11]//label[2]/input")
	private WebElement noHandleClean;

	@FindBy(xpath = "//div[@id='tab-share']//dd[12]//label[1]/input")
	private WebElement noPrompt;

	@FindBy(xpath = "//div[@id='tab-share']//dd[12]//label[2]/input")
	private WebElement prompt;

	@FindBy(xpath = "//div[@id='tab-share']//dd[12]//label[3]/input")
	private WebElement result;

	@FindBy(xpath = "//div[@id='tab-share']//dd[12]//label[4]/input")
	private WebElement success;

	@FindBy(id = "share_chkCloudScan")
	private WebElement openCloud;

	public ShareMonitorPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void setupOne(String size,String depth){

		click(runDisable);
		click(programFile);
		click(popVirus);
		click(heuristics);
		fileSize.clear();
		fileSize.sendKeys(size);
		fileDepth.clear();
		fileDepth.sendKeys(depth);
		click(manualHandle);
		click(noHandleClean);
		click(noPrompt);
		click(apply);
	}

	public void setupTwo(String fileType){

		click(customFileBtn);
		customFile.sendKeys(fileType);
		click(noHandleVirus);
		click(result);
		click(apply);
	}

	public void setupThree(EventFiringWebDriver driver){

		click(success);
//		((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();", openCloud);
//		click(openCloud);
		click(apply);
	}
}
