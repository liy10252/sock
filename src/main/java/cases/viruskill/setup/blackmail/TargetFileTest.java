package cases.viruskill.setup.blackmail;

import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.setup.blackmail.BlackMailPage;
import util.SeleniumTestCase;

public class TargetFileTest extends SeleniumTestCase {

	BlackMailPage blackMailPage;

	@Test(description = "保护目标文件操作")
	public void targetFile(){

		blackMailPage = new BlackMailPage(driver);
		String file = param.getString("file");
		String extension = param.getString("extension");
		blackMailPage.targetFile(driver,file,extension);

		Assert.assertEquals(blackMailPage.getProtectFileInput().getAttribute("value"),
				file,"添加目标文件验证错误");
		Assert.assertEquals(blackMailPage.getFileExtension().getAttribute("value"),
				extension,"文件后缀验证错误");
	}

	@Test(dependsOnMethods = "targetFile",description = "删除目标文件操作")
	public void delete(){

		blackMailPage.targetDelete();

		Assert.assertTrue(blackMailPage.getProtectFileTable().getText().isEmpty(),"删除目标文件验证错误");
	}
}
