package cases.viruskill.log.appdef;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.log.appdef.AppDefPage;
import util.SeleniumTestCase;

public class TimeFrameTest extends SeleniumTestCase {

	AppDefPage appDefPage;

	@Test(description = "时间范围本周")
	public void thisWeek(){

		appDefPage = new AppDefPage(driver);
		appDefPage.getCustomSearch().click();
		appDefPage.timeFrameTool(appDefPage.getWeek());
		Assert.assertTrue(appDefPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisWeek")),"时间范围验证错误");
	}


	@Test(dependsOnMethods = "thisWeek",description = "时间范围本月")
	public void thisMonth(){
		appDefPage.timeFrameTool(appDefPage.getMonth());
		Assert.assertTrue(appDefPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围上月")
	public void lastMonth(){
		appDefPage.timeFrameTool(appDefPage.getLastMonth());
		Assert.assertTrue(appDefPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("lastMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围指定")
	public void special(){

		appDefPage.specialTool(param.getString("start"),param.getString("end"),"noButton");
		Assert.assertTrue(appDefPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("special")),"时间范围验证错误");

	}

}
