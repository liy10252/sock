package cases.terminal.command;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.command.CommandPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class LowerHairTest extends SeleniumTestCase {

	CommandPage commandPage;

	@Test(description = "已完成")
	public void finish(){

		commandPage = new CommandPage(driver);
		commandPage.getCustomSearch().click();
		commandPage.getTimeNolimt().click();
		commandPage.singleClick(commandPage.getStateAll(),commandPage.getFinish(),5);
		Assert.assertTrue(TestUtil.getValueList(commandPage.getClients())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("finishName"),"name")),
				"已完成验证失败");
		Assert.assertTrue(commandPage.checkItems(commandPage.getLowerStates(),
				expect.getString("finishState")),"已完成验证错误");
	}

	@Test(dependsOnMethods = "finish",description = "未完成")
	public void noFinish(){

		commandPage.singleClick(commandPage.getStateAll(),commandPage.getNoFinish(),2);

		Assert.assertTrue(TestUtil.getValueList(commandPage.getClients())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("noFinishName"),"name")),
				"未完成验证失败");
		Assert.assertTrue(commandPage.checkItems(commandPage.getLowerStates(),
				expect.getString("noFinishState")),"未完成验证错误");

	}
}
