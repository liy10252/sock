package cases.viruskill.setup.virusbackup;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.virusbackup.VirusBackupPage;
import util.SeleniumTestCase;

public class RenewTest extends SeleniumTestCase {

	VirusBackupPage virusBackupPage;

	@Test(description = "恢复默认")
	public void renew(){

		virusBackupPage = new VirusBackupPage(driver);
		virusBackupPage.renew();

		Assert.assertTrue(virusBackupPage.getBackupFile().isSelected(),"恢复备份文件验证错误");
		Assert.assertTrue(virusBackupPage.getAskMeLong().isSelected(),"恢复文件超长验证错误");
		Assert.assertTrue(virusBackupPage.getCover().isSelected(),"恢复空间不足验证错误");
		Assert.assertTrue(virusBackupPage.getAskMeBackup().isSelected(),"恢复备份失败验证错误");
	}
}
