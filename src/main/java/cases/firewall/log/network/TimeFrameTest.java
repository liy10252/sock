package cases.firewall.log.network;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.network.NetWorkPage;
import util.SeleniumTestCase;

public class TimeFrameTest extends SeleniumTestCase {

	NetWorkPage netWorkPage;

	@Test(description = "时间范围本周")
	public void thisWeek(){

		netWorkPage = new NetWorkPage(driver);
		netWorkPage.getCustomSearch().click();
		netWorkPage.timeFrameTool(netWorkPage.getWeek());
		Assert.assertTrue(netWorkPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisWeek")),"时间范围验证错误");
	}


	@Test(dependsOnMethods = "thisWeek",description = "时间范围本月")
	public void thisMonth(){
		netWorkPage.timeFrameTool(netWorkPage.getMonth());
		Assert.assertTrue(netWorkPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围上月")
	public void lastMonth(){
		netWorkPage.timeFrameTool(netWorkPage.getLastMonth());
		Assert.assertTrue(netWorkPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("lastMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围指定")
	public void special(){

		netWorkPage.specialTool(param.getString("start"),param.getString("end"),"noButton");
		Assert.assertTrue(netWorkPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("special")),"时间范围验证错误");

	}

}