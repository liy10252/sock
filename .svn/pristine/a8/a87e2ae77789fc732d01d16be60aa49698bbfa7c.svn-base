package cases.leakscan.log.patch;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import page.leakscan.log.patch.PatchPage;
import util.SeleniumTestCase;

public class RankTest extends SeleniumTestCase {

	PatchPage patchPage;

	@Test(description = "无严重等级")
	public void noRank(){

		patchPage = new PatchPage(driver);
		patchPage.getCustomSearch().click();
		patchPage.singleClick(patchPage.getRankAll(),patchPage.getNoRank());
		Assert.assertEquals(patchPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("noRank"),"无严重等级错误");
	}

	@Test(dependsOnMethods = "noRank",description = "低等")
	public void lowRank(){

		patchPage.singleClick(patchPage.getRankAll(),patchPage.getLowRank());
		Assert.assertEquals(patchPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("lowRank"),"低等错误");
	}

	@Test(dependsOnMethods = "noRank",description = "中等")
	public void midRank(){

		patchPage.singleClick(patchPage.getRankAll(),patchPage.getMidRank());
		Assert.assertEquals(patchPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("midRank"),"中等错误");
	}

	@Test(dependsOnMethods = "noRank",description = "重要")
	public void importantRank(){

		patchPage.singleClick(patchPage.getRankAll(),patchPage.getImportantRank());
		Assert.assertEquals(patchPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("importantRank"),"重要错误");
	}

	@Test(dependsOnMethods = "noRank",description = "严重")
	public void seriousRank(){

		patchPage.singleClick(patchPage.getRankAll(),patchPage.getSeriousRank());
		Assert.assertEquals(patchPage.getWebDataTr().findElement(By.xpath("./td[2]"))
				.getText().trim(),expect.getString("seriousRank"),"严重错误");
	}
}
