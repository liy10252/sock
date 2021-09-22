package cases.terminal.overview;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.overview.OverviewPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class MoveGroupTest extends SeleniumTestCase {

	@Test(description = "移动到功能")
	public void moveGroup(){

		OverviewPage overviewPage = new OverviewPage(driver);
		overviewPage.moveGroup();
		Assert.assertEquals(overviewPage.getWebDataTr().findElement(By.xpath("./td[last()]"))
				.getText().trim(),"服务器","移动到功能验证错误");
	}
}
