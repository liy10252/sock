package cases.leakscan.overview;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.overview.OverViewPage;
import util.SeleniumTestCase;

public class TimeFrameTest extends SeleniumTestCase {

	OverViewPage overViewPage;

	@Test(description = "时间范围本周")
	public void thisWeek(){

		overViewPage = new OverViewPage(driver);
		overViewPage.getCustomSearch().click();
		overViewPage.timeFrameForOne(overViewPage.getWeek());

		Assert.assertTrue(overViewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim().equals(expect.getString("thisWeek")),"时间范围验证错误");
	}


	@Test(dependsOnMethods = "thisWeek",description = "时间范围本月")
	public void thisMonth(){
		overViewPage.timeFrameForOne(overViewPage.getMonth());

		Assert.assertTrue(overViewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim().equals(expect.getString("thisMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围上月")
	public void lastMonth(){
		overViewPage.timeFrameForOne(overViewPage.getLastMonth());
		Assert.assertTrue(overViewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim().equals(expect.getString("lastMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围指定")
	public void special(){

		overViewPage.specialTool(param.getString("start"),param.getString("end"),"noButton");
		Assert.assertTrue(overViewPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim().equals(expect.getString("special")),"时间范围验证错误");

	}
}
