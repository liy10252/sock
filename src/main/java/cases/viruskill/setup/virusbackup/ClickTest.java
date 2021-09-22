package cases.viruskill.setup.virusbackup;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.virusbackup.VirusBackupPage;
import util.SeleniumTestCase;

public class ClickTest extends SeleniumTestCase {

	VirusBackupPage virusBackupPage;

	@Test(description = "点击操作一")
	public void oneClick(){

		virusBackupPage = new VirusBackupPage(driver);
		virusBackupPage.oneClickUtil();

		Assert.assertFalse(virusBackupPage.getBackupFile().isSelected(),"备份文件验证错误");
		Assert.assertTrue(virusBackupPage.getDeleteLong().isSelected(),"文件超长删除验证错误");
		Assert.assertTrue(virusBackupPage.getSpace().isSelected(),"空间自动增长验证错误");
		Assert.assertTrue(virusBackupPage.getDeleteBackup().isSelected(),"备份失败删除验证错误");
	}

	@Test(dependsOnMethods = "oneClick",description = "点击操作二")
	public void twoClick(){

		virusBackupPage.twoClickUtil();

		Assert.assertTrue(virusBackupPage.getNotDealLong().isSelected(),"文件超长不处理验证错误");
		Assert.assertTrue(virusBackupPage.getNotDealBackup().isSelected(),"备份失败不处理验证错误");
	}

}
