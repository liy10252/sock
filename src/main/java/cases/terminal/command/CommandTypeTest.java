package cases.terminal.command;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.command.CommandPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class CommandTypeTest extends SeleniumTestCase {

	CommandPage commandPage;

	@Test(description = "常用命令")
	public void commonlyUsed(){

		commandPage = new CommandPage(driver);
		commandPage.getCustomSearch().click();
		commandPage.getTimeNolimt().click();
		commandPage.commandType(commandPage.getCommonlyUsed());

		Assert.assertTrue(TestUtil.getValueList(commandPage.getClients())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("commonlyUsed"),"name")),
				"常用命令验证失败");
	}

	@Test(dependsOnMethods = "commonlyUsed",description = "终端管理")
	public void terminal(){

		commandPage.commandType(commandPage.getTerminal());

		Assert.assertTrue(TestUtil.getValueList(commandPage.getClients())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("terminal"),"name")),
				"终端管理验证失败");
	}

	@Test(dependsOnMethods = "commonlyUsed",description = "病毒查杀")
	public void virus(){

		commandPage.commandType(commandPage.getVirus());

		Assert.assertTrue(commandPage.getWebDataTr().findElement(By.xpath("./td[3]"))
				.getText().trim().equals(expect.getString("virus")),"病毒查杀验证错误");
	}

	@Test(dependsOnMethods = "commonlyUsed",description = "上网防护")
	public void internet(){

		commandPage.commandType(commandPage.getInternet());

		Assert.assertTrue(TestUtil.getValueList(commandPage.getClients())
						.containsAll(TestUtil.JsonToList(expect.getJSONArray("internet"),"name")),
				"上网防护验证失败");
	}

	@Test(dependsOnMethods = "commonlyUsed",description = "安全手机")
	public void phone(){

		commandPage.commandType(commandPage.getPhone());

		Assert.assertTrue(commandPage.getWebDataTr().findElement(By.xpath("./td[3]"))
				.getText().trim().equals(expect.getString("phone")),"安全手机验证错误");
	}


}
