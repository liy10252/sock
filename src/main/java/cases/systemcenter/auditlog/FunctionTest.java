package cases.systemcenter.auditlog;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.systemcenter.auditlog.AuditLogPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class FunctionTest extends SeleniumTestCase {

	AuditLogPage auditLogPage;

	@Test(description = "登录")
	public void login() {

		auditLogPage = new AuditLogPage(driver);
		auditLogPage.getCustomSearch().click();
		auditLogPage.getTimeNolimt().click();
		auditLogPage.singleClick(auditLogPage.getFunctionAll(), auditLogPage.getLogin(), 2);

		Assert.assertTrue(TestUtil.getValueList(auditLogPage.getWebFunctions())
						.contains(expect.getString("login")),
				"登录验证失败");
	}

	@Test(dependsOnMethods = "login", description = "全网终端")
	public void terminal() {

		auditLogPage.singleClick(auditLogPage.getFunctionAll(), auditLogPage.getTerminal());
		Assert.assertEquals(auditLogPage.getWebDataTr().findElement(By.xpath("./td[6]/div"))
				.getText().trim(), expect.getString("terminal"), "全网终端验证失败");
	}

	@Test(dependsOnMethods = "login", description = "病毒查杀")
	public void virusKill(){

		auditLogPage.singleClick(auditLogPage.getFunctionAll(), auditLogPage.getVirusKill());
		Assert.assertEquals(auditLogPage.getWebDataTr().findElement(By.xpath("./td[6]/div"))
				.getText().trim(), expect.getString("virusKill"), "病毒查杀验证失败");
	}

	@Test(dependsOnMethods = "login", description = "防火墙")
	public void fireWall(){

		auditLogPage.singleClick(auditLogPage.getFunctionAll(), auditLogPage.getFireWall());
		Assert.assertEquals(auditLogPage.getWebDataTr().findElement(By.xpath("./td[6]/div"))
				.getText().trim(), expect.getString("fireWall"), "防火墙验证失败");
	}

	@Test(dependsOnMethods = "login", description = "报告预警")
	public void report() {

		auditLogPage.singleClick(auditLogPage.getFunctionAll(), auditLogPage.getReport());
		Assert.assertEquals(auditLogPage.getWebDataTr().findElement(By.xpath("./td[6]/div"))
				.getText().trim(), expect.getString("report"), "报告预警验证失败");
	}

	@Test(dependsOnMethods = "login", description = "系统中心")
	public void center() {

		auditLogPage.singleClick(auditLogPage.getFunctionAll(), auditLogPage.getCenter());
		Assert.assertEquals(auditLogPage.getWebDataTr().findElement(By.xpath("./td[6]/div"))
				.getText().trim(), expect.getString("center"), "系统中心验证失败");
	}

	@Test(dependsOnMethods = "login", description = "用户管理")
	public void manage() {

		auditLogPage.singleClick(auditLogPage.getFunctionAll(), auditLogPage.getManage());
		Assert.assertEquals(auditLogPage.getWebDataTr().findElement(By.xpath("./td[6]/div"))
				.getText().trim(), expect.getString("manage"), "用户管理验证失败");
	}

}

