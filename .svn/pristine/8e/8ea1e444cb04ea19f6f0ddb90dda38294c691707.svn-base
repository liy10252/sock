package cases.terminal.command;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.terminal.command.CommandPage;
import util.SeleniumTestCase;

public class LowerHairPopTest extends SeleniumTestCase {

	CommandPage commandPage;

	@Test(description = "已下发")
	public void alreadyIssued() {

		commandPage = new CommandPage(driver);
		commandPage.getCustomSearch().click();
		commandPage.specialTool(param.getString("start"), param.getString("end"));
		commandPage.getWebDataTr().findElement(By.xpath("./td[3]")).click();
		commandPage.singleClickPopup(commandPage.getStateAllPopup(), commandPage.getAlreadyIssued());
		Assert.assertTrue(commandPage.getWebDataTrPopup().
				findElement(By.xpath("./td[1]")).getText().equals(expect.getString("alreadyIssued")), "已下发验证错误");
	}

	@Test(dependsOnMethods = "alreadyIssued", description = "待下发")
	public void stayDown() {

		commandPage.singleClickPopup(commandPage.getStateAllPopup(), commandPage.getStayDown());
		Assert.assertTrue(commandPage.getWebDataTrPopup().
				findElement(By.xpath("./td[1]")).getText().equals(expect.getString("stayDown")), "待下发验证错误");
	}

	@Test(dependsOnMethods = "alreadyIssued", description = "超时")
	public void overTime() {

		commandPage.singleClickPopup(commandPage.getStateAllPopup(), commandPage.getOverTime());
		Assert.assertTrue(commandPage.getWebDataTrPopup().
				findElement(By.xpath("./td[1]")).getText().equals(expect.getString("overTime")), "超时验证错误");
	}
}