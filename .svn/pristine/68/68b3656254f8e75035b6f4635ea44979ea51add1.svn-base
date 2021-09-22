package cases.terminal.history;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.history.HistoryPage;
import util.SeleniumTestCase;

public class StatePopupTest extends SeleniumTestCase {

	HistoryPage historyPage;

	@Test(description = "已下发")
	public void alreadyIssued(){

		historyPage = new HistoryPage(driver);
		historyPage.getCustomSearch().click();
		historyPage.specialTool(param.getString("start"),param.getString("end"));
		historyPage.getWebDataTr().findElement(By.xpath("./td[2]")).click();
		historyPage.singleClickPopup(historyPage.getStateAllPopup(),historyPage.getAlreadyIssued());
		Assert.assertTrue(historyPage.getWebDataTrPopup().
				findElement(By.xpath("./td[1]")).getText().equals(expect.getString("alreadyIssued")),"已下发验证错误");
	}

	@Test(dependsOnMethods = "alreadyIssued",description = "待下发")
	public void stayDown(){

		historyPage.singleClickPopup(historyPage.getStateAllPopup(),historyPage.getStayDown());
		Assert.assertTrue(historyPage.getWebDataTrPopup().
				findElement(By.xpath("./td[1]")).getText().equals(expect.getString("stayDown")),"待下发验证错误");
	}

	@Test(dependsOnMethods = "alreadyIssued",description = "超时")
	public void overTime(){

		historyPage.singleClickPopup(historyPage.getStateAllPopup(),historyPage.getOverTime());
		Assert.assertTrue(historyPage.getWebDataTrPopup().
				findElement(By.xpath("./td[1]")).getText().equals(expect.getString("overTime")),"超时验证错误");
	}
}
