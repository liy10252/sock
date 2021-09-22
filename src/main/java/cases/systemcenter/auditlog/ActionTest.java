package cases.systemcenter.auditlog;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.systemcenter.auditlog.AuditLogPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ActionTest extends SeleniumTestCase {

	AuditLogPage auditLogPage;

	@Test(description = "执行")
	public void execute() {

		auditLogPage = new AuditLogPage(driver);
		auditLogPage.getCustomSearch().click();
		auditLogPage.getTimeNolimt().click();
		auditLogPage.singleClick(auditLogPage.getActionAll(), auditLogPage.getExecute(), 4);

		Assert.assertTrue(TestUtil.getValueList(auditLogPage.getWebActions())
						.contains(expect.getString("execute")),
				"执行动作验证失败");
	}

	@Test(dependsOnMethods = "execute", description = "添加")
	public void add() {

		auditLogPage.singleClick(auditLogPage.getActionAll(), auditLogPage.getAdd());
		Assert.assertEquals(auditLogPage.getWebDataTr().findElement(By.xpath("./td[5]/div"))
				.getText().trim(), expect.getString("add"), "添加验证失败");
	}

	@Test(dependsOnMethods = "execute", description = "更新")
	public void update() {

		auditLogPage.singleClick(auditLogPage.getActionAll(), auditLogPage.getUpdate());
		Assert.assertEquals(auditLogPage.getWebDataTr().findElement(By.xpath("./td[5]/div"))
				.getText().trim(), expect.getString("update"), "更新验证失败");
	}

	@Test(dependsOnMethods = "execute", description = "操作")
	public void operate() {

		auditLogPage.singleClick(auditLogPage.getActionAll(), auditLogPage.getOperate());
		Assert.assertEquals(auditLogPage.getWebDataTr().findElement(By.xpath("./td[5]/div"))
				.getText().trim(), expect.getString("operate"), "操作验证失败");
	}

}
