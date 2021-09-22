package cases.terminal.history;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.history.HistoryPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class StateTest extends SeleniumTestCase {

	HistoryPage historyPage;

	@Test(description = "已完成")
	public void finish(){

		historyPage = new HistoryPage(driver);
		historyPage.getCustomSearch().click();
		historyPage.getTimeNolimt().click();
		historyPage.singleClick(historyPage.getStateAll(),historyPage.getFinish(),2);
		Assert.assertTrue(TestUtil.getValueList(historyPage.getClients())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("finishName"),"name")),
				"已完成验证失败");
		Assert.assertTrue(historyPage.checkItems(historyPage.getStates(),
				expect.getString("finishState")),"已完成验证错误");
	}

	@Test(dependsOnMethods = "finish",description = "未完成")
	public void noFinish(){

		historyPage.singleClick(historyPage.getStateAll(),historyPage.getNoFinish(),2);

		Assert.assertTrue(TestUtil.getValueList(historyPage.getClients())
						.contains(expect.getString("noFinishName")),
				"未完成验证失败");
		Assert.assertTrue(historyPage.checkItems(historyPage.getStates(),
				expect.getString("noFinishState")),"未完成验证错误");
	}
}
