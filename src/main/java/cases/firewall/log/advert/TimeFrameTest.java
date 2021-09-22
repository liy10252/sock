package cases.firewall.log.advert;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.advert.AdvertPage;
import util.SeleniumTestCase;

public class TimeFrameTest extends SeleniumTestCase {

	AdvertPage advertPage;

	@Test(description = "时间范围本周")
	public void thisWeek(){

		advertPage = new AdvertPage(driver);
		advertPage.getCustomSearch().click();
		advertPage.timeFrameTool(advertPage.getWeek());
		Assert.assertTrue(advertPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisWeek")),"时间范围验证错误");
	}


	@Test(dependsOnMethods = "thisWeek",description = "时间范围本月")
	public void thisMonth(){
		advertPage.timeFrameTool(advertPage.getMonth());
		Assert.assertTrue(advertPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围上月")
	public void lastMonth(){
		advertPage.timeFrameTool(advertPage.getLastMonth());
		Assert.assertTrue(advertPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("lastMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围指定")
	public void special(){

		advertPage.specialTool(param.getString("start"),param.getString("end"),"noButton");
		Assert.assertTrue(advertPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("special")),"时间范围验证错误");

	}

}