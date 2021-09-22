package cases.viruskill.log.sysdef;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.log.sysdef.SysDefPage;
import util.SeleniumTestCase;

public class TimeFrameTest extends SeleniumTestCase {

	SysDefPage sysDefPage;

	@Test(description = "时间范围本周")
	public void thisWeek(){

		sysDefPage = new SysDefPage(driver);
		sysDefPage.getCustomSearch().click();
		sysDefPage.timeFrameTool(sysDefPage.getWeek());
		Assert.assertTrue(sysDefPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisWeek")),"时间范围验证错误");
	}


	@Test(dependsOnMethods = "thisWeek",description = "时间范围本月")
	public void thisMonth(){
		sysDefPage.timeFrameTool(sysDefPage.getMonth());
		Assert.assertTrue(sysDefPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围上月")
	public void lastMonth(){
		sysDefPage.timeFrameTool(sysDefPage.getLastMonth());
		Assert.assertTrue(sysDefPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("lastMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围指定")
	public void special(){

		sysDefPage.specialTool(param.getString("start"),param.getString("end"),"noButton");
		Assert.assertTrue(sysDefPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("special")),"时间范围验证错误");

	}


}