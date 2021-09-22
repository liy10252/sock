package cases.firewall.log.share;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.share.SharePage;
import util.SeleniumTestCase;

public class TimeFrameTest extends SeleniumTestCase {

	SharePage sharePage;

	@Test(description = "时间范围本周")
	public void thisWeek(){

		sharePage = new SharePage(driver);
		sharePage.getCustomSearch().click();
		sharePage.timeFrameTool(sharePage.getWeek());
		Assert.assertTrue(sharePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisWeek")),"时间范围验证错误");
	}


	@Test(dependsOnMethods = "thisWeek",description = "时间范围本月")
	public void thisMonth(){
		sharePage.timeFrameTool(sharePage.getMonth());
		Assert.assertTrue(sharePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围上月")
	public void lastMonth(){
		sharePage.timeFrameTool(sharePage.getLastMonth());
		Assert.assertTrue(sharePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("lastMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围指定")
	public void special(){

		sharePage.specialTool(param.getString("start"),param.getString("end"),"noButton");
		Assert.assertTrue(sharePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("special")),"时间范围验证错误");

	}
}
