package cases.firewall.log.share;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.firewall.log.share.SharePage;
import util.SeleniumTestCase;

public class OperateTest extends SeleniumTestCase {

	SharePage sharePage;

	@Test(description = "创建文件")
	public void createFile() {

		sharePage = new SharePage(driver);
		sharePage.getCustomSearch().click();
		sharePage.singleClick(sharePage.getOperateAll(), sharePage.getCreateFile());

		Assert.assertEquals(sharePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(), expect.getString("createFile"), "创建文件验证失败");
		Assert.assertTrue(sharePage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim().equals(expect.getString("createFileState")), "创建文件验证失败");
	}

	@Test(dependsOnMethods = "createFile", description = "创建目录")
	public void createDir() {

		sharePage.singleClick(sharePage.getOperateAll(), sharePage.getCreateDir());

		Assert.assertEquals(sharePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(), expect.getString("createDir"), "创建目录验证失败");
		Assert.assertTrue(sharePage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim().equals(expect.getString("createDirState")), "创建目录验证失败");

	}

	@Test(dependsOnMethods = "createFile", description = "访问文件")
	public void visitFile() {

		sharePage.singleClick(sharePage.getOperateAll(), sharePage.getVisitFile());

		Assert.assertEquals(sharePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(), expect.getString("visitFile"), "访问文件验证失败");
		Assert.assertTrue(sharePage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim().equals(expect.getString("visitFileState")), "访问文件验证失败");

	}

	@Test(dependsOnMethods = "createFile", description = "修改文件")
	public void modifyFile() {

		sharePage.singleClick(sharePage.getOperateAll(), sharePage.getModifyFile());

		Assert.assertEquals(sharePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(), expect.getString("modifyFile"), "修改文件验证失败");
		Assert.assertTrue(sharePage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim().equals(expect.getString("modifyFileState")), "修改文件验证失败");

	}

	@Test(dependsOnMethods = "createFile", description = "删除文件")
	public void deleteFile() {

		sharePage.singleClick(sharePage.getOperateAll(), sharePage.getDeleteFile());

		Assert.assertEquals(sharePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(), expect.getString("deleteFile"), "删除文件验证失败");
		Assert.assertTrue(sharePage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim().equals(expect.getString("deleteFileState")), "删除文件验证失败");

	}

	@Test(dependsOnMethods = "createFile", description = "删除文件夹")
	public void deleteDir() {

		sharePage.singleClick(sharePage.getOperateAll(), sharePage.getDeleteDir());

		Assert.assertEquals(sharePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(), expect.getString("deleteDir"), "删除文件夹验证失败");
		Assert.assertTrue(sharePage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim().equals(expect.getString("deleteDirState")), "删除文件夹验证失败");

	}

	@Test(dependsOnMethods = "createFile", description = "重命名")
	public void rename() {

		sharePage.singleClick(sharePage.getOperateAll(), sharePage.getRename());

		Assert.assertEquals(sharePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(), expect.getString("rename"), "重命名验证失败");
		Assert.assertTrue(sharePage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim().equals(expect.getString("renameState")), "重命名验证失败");

	}

	@Test(dependsOnMethods = "createFile", description = "移动文件")
	public void moveFile() {

		sharePage.singleClick(sharePage.getOperateAll(), sharePage.getMoveFile());

		Assert.assertEquals(sharePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(), expect.getString("moveFile"), "移动文件验证失败");
		Assert.assertTrue(sharePage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim().equals(expect.getString("moveFileState")), "移动文件验证失败");

	}

	@Test(dependsOnMethods = "createFile", description = "访问拒绝")
	public void accessDenied() {

		sharePage.singleClick(sharePage.getOperateAll(), sharePage.getAccessDenied());

		Assert.assertEquals(sharePage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(), expect.getString("accessDenied"), "访问拒绝验证失败");
		Assert.assertTrue(sharePage.getWebDataTr().findElement(By.xpath("./td[5]"))
				.getText().trim().equals(expect.getString("accessDeniedState")), "访问拒绝验证失败");

	}

}
