package page.viruskill.setup.ftpmonitor;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import util.TestUtil;

@Data
public class FtpMonitorPage extends BasePage {

	@FindBy(id = "ftp_fundisable")
	private WebElement runDisable;

	@FindBy(id = "ftp_cachesize")
	private WebElement customSize;

	@FindBy(xpath = "//input[@name='ftp_cachetype' and @value='1']")
	private WebElement allCache;

	@FindBy(xpath = "//input[@name='ftp_cachetype' and @value='2']")
	private WebElement noCache;

	@FindBy(id = "ftp_scanmaxsize")
	private WebElement fileSize;

	@FindBy(id = "ftp_ip")
	private WebElement ip;

	@FindBy(id = "ftp_port")
	private WebElement port;

	@FindBy(id = "ftp_listAdd")
	private WebElement add;

	@FindBy(xpath = "//table[@id='ftp_list']//tr[1]")
	private WebElement webTr;

	@FindBy(id = "ftp_list")
	private WebElement webTable;

	public FtpMonitorPage(EventFiringWebDriver driver) {
		super(driver);
	}

	public void setUpOne(String customSizeStr,String fileSizeStr,String ipStr,String portStr){

		click(runDisable);
		customSize.clear();
		customSize.sendKeys(customSizeStr);
		fileSize.clear();
		fileSize.sendKeys(fileSizeStr);
		ip.sendKeys(ipStr);
		port.sendKeys(portStr);
		click(add);
		click(apply);
	}

	public void setUpTwo(){

		click(allCache);
		click(webTr.findElement(By.xpath("./td[last()]/a")));
		click(apply);
	}

	public void setUpThree(){

		click(noCache);
		click(apply);
	}
}
