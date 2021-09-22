package page.leakscan.overview;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.BasePage;
import page.leakscan.LeakScanPage;

import java.util.List;

@Data
public class OverViewPage extends LeakScanPage {

	@FindBy(xpath = "//div[@id='customSearchBox']//li[text()='计算机名称']")
	private WebElement computerName;

	public OverViewPage(EventFiringWebDriver driver) {
		super(driver);
	}
}
