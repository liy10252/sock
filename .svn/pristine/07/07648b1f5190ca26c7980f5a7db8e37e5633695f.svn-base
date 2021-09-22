package cases.viruskill.setup.linuxvirus;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.linuxvirus.LinuxVirusPage;
import util.SeleniumTestCase;

public class SetVirusTest extends SeleniumTestCase {

	LinuxVirusPage linuxVirusPage;

	@Test(description = "病毒设置一")
	public void setOne(){

		linuxVirusPage = new LinuxVirusPage(driver);
		linuxVirusPage.setUtilOne(driver);

		Assert.assertTrue(linuxVirusPage.getDeleteFileFind().isSelected(),
				"发现病毒验证错误");
		Assert.assertTrue(linuxVirusPage.getNoDealClean().isSelected(),
				"清除失败验证错误");
		Assert.assertTrue(linuxVirusPage.getDeleteFileDivide().isSelected(),
				"隔离失败验证错误");
	}

	@Test(dependsOnMethods = "setOne",description = "病毒设置二")
	public void setTwo(){

		linuxVirusPage.setUtilTwo();

		Assert.assertTrue(linuxVirusPage.getNoDealFind().isSelected(),
				"发现病毒验证错误");
		Assert.assertTrue(linuxVirusPage.getNoDealDivide().isSelected(),
				"隔离失败验证错误");
	}
}
