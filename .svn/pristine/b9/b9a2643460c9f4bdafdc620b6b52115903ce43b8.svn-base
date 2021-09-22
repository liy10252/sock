package cases.report.history;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.report.history.HistoryPage;
import util.SeleniumTestCase;

public class SearchNameTest extends SeleniumTestCase {

	HistoryPage historyPage;

	@Test(description = "名称搜索")
	public void searchName(){

		historyPage = new HistoryPage(driver);
		historyPage.getCustomSearch().click();
		String name = param.getString("name");
		historyPage.nameSearch(name);

		Assert.assertEquals(historyPage.getName().getText(),
				name,"名称搜索验证错误");
	}
}
