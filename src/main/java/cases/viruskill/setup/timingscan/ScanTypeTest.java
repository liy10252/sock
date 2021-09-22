package cases.viruskill.setup.timingscan;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.SetUpPage;
import page.viruskill.setup.timingscan.TimingScanPage;
import util.SeleniumTestCase;

public class ScanTypeTest extends SeleniumTestCase {

	TimingScanPage timingScanPage;

	@Test(description = "添加目录")
	public void addList(){

		timingScanPage = new TimingScanPage(driver);
		String path = param.getString("path");

		timingScanPage.addListUtil(path);

		Assert.assertTrue(timingScanPage.getScanList().isSelected(),"目录列表验证错误");
		Assert.assertTrue(timingScanPage.getWebTr().getText().contains(path),"目录添加验证错误");

	}

	@Test(dependsOnMethods = "addList",description = "删除扫描目录")
	public void delete(){

		new SetUpPage(driver).gotoVirusBackup();
		new SetUpPage(driver).gotoTimingScan();
		timingScanPage.deleteUtil();

		Assert.assertTrue(timingScanPage.getWebTr().getText().isEmpty(),"删除扫描目录验证错误");
	}
}
