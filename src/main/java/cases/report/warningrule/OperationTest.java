package cases.report.warningrule;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.report.warningrule.WarningRulePage;
import util.SeleniumTestCase;

public class OperationTest extends SeleniumTestCase {

	WarningRulePage warningRulePage;

	@Test(description = "关闭")
	public void close(){

		warningRulePage = new WarningRulePage(driver);
		warningRulePage.close();

		Assert.assertEquals(warningRulePage.getCloseBtn()
						.getAttribute("class"), expect.getString("close"),"关闭验证错误");
	}
}
