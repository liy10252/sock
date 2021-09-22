package cases.terminal.command;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.command.CommandPage;
import util.SeleniumTestCase;

public class TimeFrameTest extends SeleniumTestCase {

	CommandPage commandPage;

	@Test(description = "时间范围本周")
	public void thisWeek(){

		commandPage = new CommandPage(driver);
		commandPage.getCustomSearch().click();
		commandPage.timeFrameTool(commandPage.getWeek());
		Assert.assertTrue(commandPage.getWebDataTr().findElement(By.xpath("./td[3]"))
				.getText().trim().equals(expect.getString("thisWeek")),"时间范围验证错误");
	}


	@Test(dependsOnMethods = "thisWeek",description = "时间范围本月")
	public void thisMonth(){
		commandPage.timeFrameTool(commandPage.getMonth());
		Assert.assertTrue(commandPage.getWebDataTr().findElement(By.xpath("./td[3]"))
				.getText().trim().equals(expect.getString("thisMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围上月")
	public void lastMonth(){
		commandPage.timeFrameTool(commandPage.getLastMonth());
		Assert.assertTrue(commandPage.getWebDataTr().findElement(By.xpath("./td[3]"))
				.getText().trim().equals(expect.getString("lastMonth")),"时间范围验证错误");
	}

	@Test(dependsOnMethods = "thisWeek",description = "时间范围指定")
	public void special(){

		commandPage.specialTool(param.getString("start"),param.getString("end"));
		Assert.assertTrue(commandPage.getWebDataTr().findElement(By.xpath("./td[3]"))
				.getText().trim().equals(expect.getString("special")),"时间范围验证错误");

	}
}
