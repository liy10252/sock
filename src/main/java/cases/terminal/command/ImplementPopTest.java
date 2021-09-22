package cases.terminal.command;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.command.CommandPage;
import util.SeleniumTestCase;

public class ImplementPopTest extends SeleniumTestCase {

	CommandPage commandPage;

	@Test(description = "成功")
	public void finish() {

		commandPage = new CommandPage(driver);
		commandPage.getCustomSearch().click();
		commandPage.specialTool(param.getString("start"), param.getString("end"));
		commandPage.getWebDataTr().findElement(By.xpath("./td[3]")).click();
		commandPage.singleClickPopup(commandPage.getImplementAllPop(), commandPage.getImFinishPop());
		Assert.assertTrue(commandPage.getWebDataTrPopup().
				findElement(By.xpath("./td[1]")).getText().equals(expect.getString("finish")), "成功验证错误");
	}

	@Test(dependsOnMethods = "finish", description = "未执行")
	public void unexecuted() {

		commandPage.singleClickPopup(commandPage.getImplementAllPop(), commandPage.getImUnexecutedPop());
		Assert.assertTrue(commandPage.getWebDataTrPopup().
				findElement(By.xpath("./td[1]")).getText().equals(expect.getString("unexecuted")), "未执行验证错误");
	}

	@Test(dependsOnMethods = "finish", description = "执行失败")
	public void failed() {

		commandPage.singleClickPopup(commandPage.getImplementAllPop(), commandPage.getImFailedPop());
		Assert.assertTrue(commandPage.getWebDataTrPopup().
				findElement(By.xpath("./td[1]")).getText().equals(expect.getString("failed")), "执行失败验证错误");
	}
}