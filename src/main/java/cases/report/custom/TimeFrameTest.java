package cases.report.custom;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.report.custom.CustomPage;
import util.SeleniumTestCase;

public class TimeFrameTest extends SeleniumTestCase {

	CustomPage customPage;

	@Test(description = "时间范围操作")
	public void timeFrame(){

		customPage = new CustomPage(driver);
		String start = param.getString("start");
		String end = param.getString("end");
		customPage.getCustomSearch().click();
		customPage.timeFrameUtil(start,end);

		Assert.assertTrue(customPage.getNames().size() == expect.getIntValue("size"),"时间范围验证错误");
		Assert.assertEquals(customPage.getWebDataTr().findElement(By.xpath("./td[2]")).getText()
				,expect.getString("name"),"时间范围验证错误");
	}
}
