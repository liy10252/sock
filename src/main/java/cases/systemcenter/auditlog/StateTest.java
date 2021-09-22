package cases.systemcenter.auditlog;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.systemcenter.auditlog.AuditLogPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class StateTest extends SeleniumTestCase {

	AuditLogPage auditLogPage;

	@Test(description = "成功")
	public void success(){

		auditLogPage = new AuditLogPage(driver);
		auditLogPage.getCustomSearch().click();
		auditLogPage.getTimeNolimt().click();
		auditLogPage.singleClick(auditLogPage.getStateAll(), auditLogPage.getSuccess(), 8);

		Assert.assertTrue(TestUtil.getValueList(auditLogPage.getWebStates())
						.contains(expect.getString("success")),
				"成功验证失败");
	}

	@Test(dependsOnMethods = "success",description = "失败")
	public void fail(){

		auditLogPage.singleClick(auditLogPage.getStateAll(), auditLogPage.getFail());
		Assert.assertEquals(auditLogPage.getWebDataTr().findElement(By.xpath("./td[9]/div"))
				.getText().trim(), expect.getString("fail"), "失败验证失败");
	}
}
