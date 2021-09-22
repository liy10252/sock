package cases.terminal.command;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.command.CommandPage;
import util.SeleniumTestCase;

public class SearchPopTest extends SeleniumTestCase {

	CommandPage commandPage;

	@Test(description = "终端名称搜索")
	public void searchByName(){

		commandPage = new CommandPage(driver);
		commandPage.getCustomSearch().click();
		String name = param.getString("name");
		commandPage.specialTool(param.getString("start"),param.getString("end"));
		commandPage.getWebDataTr().findElement(By.xpath("./td[3]")).click();
		commandPage.searchPopup(name);
		Assert.assertTrue(commandPage.getWebDataTrPopup().
				findElement(By.xpath("./td[1]")).getText().equals(name),"终端名称搜索验证错误");
	}
}
