package cases.terminal.history;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.history.HistoryPage;
import util.SeleniumTestCase;

public class SearchPopupTest extends SeleniumTestCase {

	HistoryPage historyPage;

	@Test(description = "终端名称搜索")
	public void searchByName(){

		historyPage = new HistoryPage(driver);
		historyPage.getCustomSearch().click();
		String name = param.getString("name");
		historyPage.specialTool(param.getString("start"),param.getString("end"));
		historyPage.getWebDataTr().findElement(By.xpath("./td[2]")).click();
		historyPage.searchPopup(name);
		Assert.assertTrue(historyPage.getWebDataTrPopup().
				findElement(By.xpath("./td[1]")).getText().equals(name),"终端名称搜索验证错误");
	}
}
