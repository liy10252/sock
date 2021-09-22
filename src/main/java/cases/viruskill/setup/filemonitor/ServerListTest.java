package cases.viruskill.setup.filemonitor;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.filemonitor.FileMonitorPage;
import util.SeleniumTestCase;

public class ServerListTest extends SeleniumTestCase {

	FileMonitorPage fileMonitorPage;

	@Test(description = "添加文件服务器")
	public void addServer(){

		fileMonitorPage = new FileMonitorPage(driver);
		String server = param.getString("server");
		fileMonitorPage.addSever(driver,server);

		Assert.assertTrue(fileMonitorPage.getWebTr().getText().contains(server),
				"添加服务器验证错误");
	}

	@Test(dependsOnMethods = "addServer",description = "删除文件服务器")
	public void delete(){

		fileMonitorPage.delete();

		Assert.assertTrue(fileMonitorPage.getWebTr().getText().
				isEmpty(),"删除文件服务器验证错误");
	}
}
