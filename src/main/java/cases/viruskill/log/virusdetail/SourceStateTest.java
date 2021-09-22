package cases.viruskill.log.virusdetail;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.log.virusdetail.VirusDetailPage;
import util.SeleniumTestCase;

public class SourceStateTest extends SeleniumTestCase {

	VirusDetailPage virusDetailPage;

	@Test(description = "快速查杀")
	public void quickScan(){

		virusDetailPage = new VirusDetailPage(driver);
		virusDetailPage.getCustomSearch().click();
		virusDetailPage.getBaseDetail().click();
		virusDetailPage.singleClick(virusDetailPage.getSourceAll(),virusDetailPage.getQuickScan());
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("quickScan"),"快速查杀验证失败");
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[7]"))
				.getText().trim(),expect.getString("quickScanState"),"快速查杀验证失败");
	}

	@Test(dependsOnMethods = "quickScan",description = "全盘查杀")
	public void allScan(){

		virusDetailPage.singleClick(virusDetailPage.getSourceAll(),virusDetailPage.getAllScan());
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("allScan"),"全盘查杀验证失败");
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[7]"))
				.getText().trim(),expect.getString("allScanState"),"全盘查杀验证失败");
	}

	@Test(dependsOnMethods = "quickScan",description = "自定义")
	public void customScan(){

		virusDetailPage.singleClick(virusDetailPage.getSourceAll(),virusDetailPage.getCustomScan());
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("customScan"),"自定义验证失败");
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[7]"))
				.getText().trim(),expect.getString("customScanState"),"自定义验证失败");
	}

	@Test(dependsOnMethods = "quickScan",description = "文件监控")
	public void fileMon(){

		virusDetailPage.singleClick(virusDetailPage.getSourceAll(),virusDetailPage.getFileMon());
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("fileMon"),"文件监控验证失败");
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[7]"))
				.getText().trim(),expect.getString("fileMonState"),"文件监控验证失败");
	}

	@Test(dependsOnMethods = "quickScan",description = "邮件监控")
	public void mailMon(){

		virusDetailPage.singleClick(virusDetailPage.getSourceAll(),virusDetailPage.getMailMon());
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("mailMon"),"邮件监控验证失败");
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[7]"))
				.getText().trim(),expect.getString("mailMonState"),"邮件监控验证失败");
	}

}
