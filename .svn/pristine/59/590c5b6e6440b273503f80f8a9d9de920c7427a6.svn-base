package cases.terminal.command;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.command.CommandPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ImplementTest extends SeleniumTestCase {

	CommandPage commandPage;

	@Test(description = "完成")
	public void finish(){

		commandPage = new CommandPage(driver);
		commandPage.getCustomSearch().click();
		commandPage.getTimeNolimt().click();
		commandPage.singleClick(commandPage.getImplementAll(),commandPage.getImFinish());
		Assert.assertTrue(commandPage.getWebDataTr().findElement(By.xpath("./td[3]"))
				.getText().trim().equals(expect.getString("finishName")),"完成验证错误");
		Assert.assertTrue(commandPage.getWebDataTr().findElement(By.xpath("./td[5]/div[1]/span"))
				.getText().trim().equals(expect.getString("finishState")),"完成验证错误");
	}

	@Test(dependsOnMethods = "finish",description = "未执行")
	public void unexecuted(){

		commandPage.singleClick(commandPage.getImplementAll(),commandPage.getImUnexecuted(),6);

		Assert.assertTrue(TestUtil.getValueList(commandPage.getClients())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("unexecutedName"),"name")),
				"未执行验证错误");
		Assert.assertTrue(commandPage.checkItems(commandPage.getImplementStates(),
				expect.getString("unexecutedState")),"未执行验证错误");
	}

	@Test(dependsOnMethods = "finish",description = "执行失败")
	public void failed(){

		commandPage.singleClick(commandPage.getImplementAll(),commandPage.getImFailed(),2);

		Assert.assertTrue(commandPage.checkItems(commandPage.getClients(),
				expect.getString("failedName")),
				"执行失败验证错误");
		Assert.assertTrue(TestUtil.getValueList(commandPage.getImplementStates())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("failedState"),"name")),
				"执行失败验证错误");

	}
}
