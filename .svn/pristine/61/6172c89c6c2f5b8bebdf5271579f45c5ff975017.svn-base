package page.leakscan.log.patch;

import lombok.Data;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.leakscan.LeakScanPage;
import util.TestUtil;

@Data
public class PatchPage extends LeakScanPage {

	@FindBy(xpath = "//div[@id='customSearchBox']//li[text()='补丁名称']")
	private WebElement patchName;

	@FindBy(xpath = "//div[@id='customSearchBox']//input[@class='js_searchKey rlsUpdate']")
	public WebElement searchBar;

	public PatchPage(EventFiringWebDriver driver) {
		super(driver);
	}

	@Override
	public void search(WebElement element,String text){

		searchBar.clear();
		click(searchButton);
		click(conButton);
		click(element);
		searchBar.sendKeys(text);
		click(searchButton);
		TestUtil.waitForElementNumber(By.xpath("//table[@id='tbClient']//tbody/tr"),1);
	}
}
