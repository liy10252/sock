package cases.systemcenter.auditlog;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.systemcenter.auditlog.AuditLogPage;
import util.SeleniumTestCase;

public class CleanTest extends SeleniumTestCase {

	AuditLogPage auditLogPage;

	@Test(description = "删除日志")
	public void delete(){

		auditLogPage = new AuditLogPage(driver);
		auditLogPage.delete();

		Assert.assertEquals(auditLogPage.getWebDelData().findElement(By.xpath("./td[6]/div"))
		.getText(),expect.getString("delFun"),"删除日志验证错误");
		Assert.assertEquals(auditLogPage.getWebDelData().findElement(By.xpath("./td[7]/a"))
				.getText(),expect.getString("delObj"),"删除日志验证错误");
	}

	@Test(dependsOnMethods = "delete",description = "清空")
	public void clean(){

		auditLogPage.clear();

		Assert.assertTrue(auditLogPage.getWebActions().size() == 1,
				"清空验证错误");
		Assert.assertEquals(auditLogPage.getWebDataTr().findElement(By.xpath("./td[7]/a"))
				.getText(),expect.getString("cleanObj"),"清空验证错误");
	}
}
