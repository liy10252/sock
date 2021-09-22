package cases.report.warningrecord;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.report.warningrecord.WarningRecordPage;
import util.SeleniumTestCase;

public class TimeFrameTest extends SeleniumTestCase {

	WarningRecordPage warningRecordPage;

	@Test(description = "时间范围本周")
	public void thisWeek(){

		warningRecordPage = new WarningRecordPage(driver);
		warningRecordPage.getCustomSearch().click();
		warningRecordPage.timeFrameTool(warningRecordPage.getWeek());
		Assert.assertTrue(warningRecordPage.getWebDataTr().findElement(By.xpath("./td[3]/div"))
				.getText().trim().equals(expect.getString("thisWeek")),"时间范围验证错误");
	}


	@Test(dependsOnMethods = "thisWeek",description = "时间范围本月")
	public void thisMonth(){

		warningRecordPage.timeFrameTool(warningRecordPage.getMonth());
		Assert.assertTrue(warningRecordPage.getWebDataTr().findElement(By.xpath("./td[3]/div"))
				.getText().trim().equals(expect.getString("thisMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围上月")
	public void lastMonth(){

		warningRecordPage.timeFrameTool(warningRecordPage.getLastMonth());
		Assert.assertTrue(warningRecordPage.getWebDataTr().findElement(By.xpath("./td[3]/div"))
				.getText().trim().equals(expect.getString("lastMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围指定")
	public void special(){

		warningRecordPage.specialTool(param.getString("start"),param.getString("end"));
		Assert.assertTrue(warningRecordPage.getWebDataTr().findElement(By.xpath("./td[3]/div"))
				.getText().trim().equals(expect.getString("special")),"时间范围验证错误");

	}
}
