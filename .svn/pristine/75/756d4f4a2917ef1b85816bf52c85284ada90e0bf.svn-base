package page.firewall.log.share;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;

@Data
public class SharePage extends BasePage {

	@FindBy(xpath = "//div[@class='controls js_task']/a[text()='不限']")
	private WebElement operateAll;

	@FindBy(xpath = "//div[@class='controls js_task']/a[text()='创建文件']")
	private WebElement createFile;

	@FindBy(xpath = "//div[@class='controls js_task']/a[text()='创建目录']")
	private WebElement createDir;

	@FindBy(xpath = "//div[@class='controls js_task']/a[text()='访问文件']")
	private WebElement visitFile;

	@FindBy(xpath = "//div[@class='controls js_task']/a[text()='修改文件']")
	private WebElement modifyFile;

	@FindBy(xpath = "//div[@class='controls js_task']/a[text()='删除文件']")
	private WebElement deleteFile;

	@FindBy(xpath = "//div[@class='controls js_task']/a[text()='删除文件夹']")
	private WebElement deleteDir;

	@FindBy(xpath = "//div[@class='controls js_task']/a[text()='重命名']")
	private WebElement rename;

	@FindBy(xpath = "//div[@class='controls js_task']/a[text()='移动文件']")
	private WebElement moveFile;

	@FindBy(xpath = "//div[@class='controls js_task']/a[text()='访问拒绝']")
	private WebElement accessDenied;

	@FindBy(xpath = "//div[@id='customSearchBox']//li[text()='共享文件筛选']")
	private WebElement shareFile;

	public SharePage(EventFiringWebDriver driver) {
		super(driver);
	}
}
