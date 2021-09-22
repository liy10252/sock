package cases.report.history;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.report.history.HistoryPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class DeleteTest extends SeleniumTestCase {

	HistoryPage historyPage;

	@Test(description = "删除历史报告")
	public void delete(){

		historyPage = new HistoryPage(driver);
		historyPage.delete();

		Assert.assertTrue(historyPage.getDelAlert().isDisplayed(),
				"删除历史报告验证错误");
		Assert.assertFalse(TestUtil.getValueList(historyPage.getNames())
				.contains(expect.getString("name")),"删除历史报告验证错误");
	}
}
