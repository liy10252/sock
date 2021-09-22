package cases.firewall.log.flow;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.flow.FlowPage;
import util.SeleniumTestCase;

public class TimeFrameTest extends SeleniumTestCase {

	FlowPage flowPage;

	@Test(description = "时间范围本周")
	public void thisWeek(){

		flowPage = new FlowPage(driver);
		flowPage.getCustomSearch().click();
		flowPage.timeFrameTool(flowPage.getWeek());
		Assert.assertTrue(flowPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisWeek")),"时间范围验证错误");
	}


	@Test(dependsOnMethods = "thisWeek",description = "时间范围本月")
	public void thisMonth(){
		flowPage.timeFrameTool(flowPage.getMonth());
		Assert.assertTrue(flowPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围上月")
	public void lastMonth(){
		flowPage.timeFrameTool(flowPage.getLastMonth());
		Assert.assertTrue(flowPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("lastMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围指定")
	public void special(){

		flowPage.specialTool(param.getString("start"),param.getString("end"),"noButton");
		Assert.assertTrue(flowPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("special")),"时间范围验证错误");

	}
}
