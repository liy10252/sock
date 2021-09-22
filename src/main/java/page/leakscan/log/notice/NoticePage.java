package page.leakscan.log.notice;

import lombok.Data;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import page.leakscan.LeakScanPage;

@Data
public class NoticePage extends LeakScanPage {

	@FindBy(xpath = "//div[@id='customSearchBox']//li[text()='公告号']")
	private WebElement noticeName;

	public NoticePage(EventFiringWebDriver driver) {
		super(driver);
	}

}
