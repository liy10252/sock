package cases.viruskill.log.virusdetail;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.viruskill.log.virusdetail.VirusDetailPage;
import util.SeleniumTestCase;

public class ProcessModeTest extends SeleniumTestCase {

	VirusDetailPage virusDetailPage;

	@Test(description = "暂未处理")
	public void notYet(){

		virusDetailPage = new VirusDetailPage(driver);
		virusDetailPage.getCustomSearch().click();
		virusDetailPage.singleClick(virusDetailPage.getHandleAll(),virusDetailPage.getNotYet());
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("notYet"),"暂未处理验证失败");
	}

	@Test(dependsOnMethods = "notYet",description = "忽略")
	public void ignore(){

		virusDetailPage.singleClick(virusDetailPage.getHandleAll(),virusDetailPage.getIgnore());
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("ignore"),"忽略验证失败");
	}

	@Test(dependsOnMethods = "notYet",description = "删除")
	public void delete(){

		virusDetailPage.singleClick(virusDetailPage.getHandleAll(),virusDetailPage.getDelete());
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("delete"),"删除验证失败");
	}

	@Test(dependsOnMethods = "notYet",description = "清除")
	public void clear(){

		virusDetailPage.singleClick(virusDetailPage.getHandleAll(),virusDetailPage.getClear());
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("clear"),"清除验证失败");
	}

	@Test(dependsOnMethods = "notYet",description = "信任")
	public void trust(){

		virusDetailPage.singleClick(virusDetailPage.getHandleAll(),virusDetailPage.getTrust());
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("trust"),"信任验证失败");
	}

	@Test(dependsOnMethods = "notYet",description = "备份失败")
	public void backupFail(){

		virusDetailPage.singleClick(virusDetailPage.getHandleAll(),virusDetailPage.getBackupFail());
		Assert.assertEquals(virusDetailPage.getWebDataTr().findElement(By.xpath("./td[1]"))
				.getText().trim(),expect.getString("backupFail"),"备份失败验证失败");
	}

}
