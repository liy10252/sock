package cases.report.history;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.report.history.HistoryPage;
import util.SeleniumTestCase;

public class TimeFrameTest extends SeleniumTestCase {

	HistoryPage historyPage;

	@Test(description = "时间范围")
	public void timeFrame(){

		historyPage = new HistoryPage(driver);
		historyPage.getCustomSearch().click();
		String start = param.getString("start");
		String end = param.getString("end");
		historyPage.timeSearch(start,end);

		Assert.assertEquals(historyPage.getName().getText(),
				expect.getString("name"),"时间范围验证错误");
	}
}
