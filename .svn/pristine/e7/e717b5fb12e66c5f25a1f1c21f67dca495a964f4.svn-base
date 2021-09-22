package cases.firewall.log.hacker;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.hacker.HackerPage;
import util.SeleniumTestCase;

public class TimeFrameTest extends SeleniumTestCase {

	HackerPage hackerPage;

	@Test(description = "时间范围本周")
	public void thisWeek(){

		hackerPage = new HackerPage(driver);
		hackerPage.getCustomSearch().click();
		hackerPage.timeFrameTool(hackerPage.getWeek());
		Assert.assertTrue(hackerPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisWeek")),"时间范围验证错误");
	}


	@Test(dependsOnMethods = "thisWeek",description = "时间范围本月")
	public void thisMonth(){
		hackerPage.timeFrameTool(hackerPage.getMonth());
		Assert.assertTrue(hackerPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围上月")
	public void lastMonth(){
		hackerPage.timeFrameTool(hackerPage.getLastMonth());
		Assert.assertTrue(hackerPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("lastMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围指定")
	public void special(){

		hackerPage.specialTool(param.getString("start"),param.getString("end"),"noButton");
		Assert.assertTrue(hackerPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("special")),"时间范围验证错误");

	}

}