package cases.viruskill.log.scanevent;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.log.scanevent.ScanEventPage;
import util.SeleniumTestCase;

public class TimeFrameTest extends SeleniumTestCase {

	ScanEventPage scanEventPage;

	@Test(description = "时间范围本周")
	public void thisWeek(){

		scanEventPage = new ScanEventPage(driver);
		scanEventPage.getCustomSearch().click();
		scanEventPage.timeFrameTool(scanEventPage.getWeek());
		Assert.assertTrue(scanEventPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisWeek")),"时间范围验证错误");
	}


	@Test(dependsOnMethods = "thisWeek",description = "时间范围本月")
	public void thisMonth(){
		scanEventPage.timeFrameTool(scanEventPage.getMonth());
		Assert.assertTrue(scanEventPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围上月")
	public void lastMonth(){
		scanEventPage.timeFrameTool(scanEventPage.getLastMonth());
		Assert.assertTrue(scanEventPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("lastMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围指定")
	public void special(){

		scanEventPage.specialTool(param.getString("start"),param.getString("end"),"noButton");
		Assert.assertTrue(scanEventPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("special")),"时间范围验证错误");

	}


}
