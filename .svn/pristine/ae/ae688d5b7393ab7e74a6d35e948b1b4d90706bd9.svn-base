package cases.viruskill.log.sysdef;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.log.sysdef.SysDefPage;
import util.SeleniumTestCase;
import util.TestUtil;

public class ProtectTypeTest extends SeleniumTestCase {

	SysDefPage sysDefPage;

	@Test(description = "文件防护")
	public void fileProtect(){

		sysDefPage = new SysDefPage(driver);
		sysDefPage.getCustomSearch().click();
		sysDefPage.getBaseDetail().click();
		sysDefPage.singleClick(sysDefPage.getProtectAll(),sysDefPage.getFileProtect());
		Assert.assertEquals(sysDefPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("fileProtect"),"文件防护验证失败");
		Assert.assertEquals(sysDefPage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim(),expect.getString("fileProtectState"),"文件防护验证失败");
	}

	@Test(dependsOnMethods = "fileProtect",description = "注册表防护")
	public void registryProtect(){

		sysDefPage.singleClick(sysDefPage.getProtectAll(),sysDefPage.getRegistryProtect(),3);
		Assert.assertTrue(TestUtil.getValueList(sysDefPage.getClientNames())
				.containsAll(TestUtil.JsonToList(expect.getJSONArray("registryProtect"),"name")),
				"注册表防护验证失败");
		Assert.assertTrue(sysDefPage.checkItems(sysDefPage.getWebProtects(),
				expect.getString("registryProtectState")),"注册表防护验证失败");
	}

	@Test(dependsOnMethods = "fileProtect",description = "进程防护")
	public void processProtect(){

		sysDefPage.singleClick(sysDefPage.getProtectAll(),sysDefPage.getProcessProtect());
		Assert.assertEquals(sysDefPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("processProtect"),"进程防护验证失败");
		Assert.assertEquals(sysDefPage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim(),expect.getString("processProtectState"),"进程防护验证失败");
	}

	@Test(dependsOnMethods = "fileProtect",description = "系统防护")
	public void systemProtect(){

		sysDefPage.singleClick(sysDefPage.getProtectAll(),sysDefPage.getSystemProtect());
		Assert.assertEquals(sysDefPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("systemProtect"),"系统防护验证失败");
		Assert.assertEquals(sysDefPage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim(),expect.getString("systemProtectState"),"系统防护验证失败");
	}
}
