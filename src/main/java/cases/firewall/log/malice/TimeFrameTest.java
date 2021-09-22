package cases.firewall.log.malice;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.malice.MalicePage;
import util.SeleniumTestCase;

public class TimeFrameTest extends SeleniumTestCase {

	MalicePage malicePage;

	@Test(description = "时间范围本周")
	public void thisWeek(){

		malicePage = new MalicePage(driver);
		malicePage.getCustomSearch().click();
		malicePage.timeFrameTool(malicePage.getWeek());
		Assert.assertTrue(malicePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisWeek")),"时间范围验证错误");
	}


	@Test(dependsOnMethods = "thisWeek",description = "时间范围本月")
	public void thisMonth(){
		malicePage.timeFrameTool(malicePage.getMonth());
		Assert.assertTrue(malicePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("thisMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围上月")
	public void lastMonth(){
		malicePage.timeFrameTool(malicePage.getLastMonth());
		Assert.assertTrue(malicePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("lastMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围指定")
	public void special(){

		malicePage.specialTool(param.getString("start"),param.getString("end"),"noButton");
		Assert.assertTrue(malicePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim().equals(expect.getString("special")),"时间范围验证错误");

	}

}